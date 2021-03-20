package com.google.joodapp;

import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserInfo;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.joodapp.Models.NamedLocation;
import com.google.joodapp.Models.Report;
import com.google.joodapp.Models.User;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProfileActivity extends AppCompatActivity {

    public LinearLayout reports,followers,followed;
    public TextView nameDisplayed,startapp;
    public CircleImageView image;
    DatabaseReference reference;
    User actualUser;

    // Components for the UI
    private RecyclerView mRecyclerView;
    ArrayList<Report> list;
    ArrayList<NamedLocation> namedLocations;
    private LinearLayoutManager mLinearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        actualUser = new User();
        nameDisplayed = (TextView) findViewById(R.id.name_profile);
        startapp = (TextView) findViewById(R.id.startapp);
        image = (CircleImageView) findViewById(R.id.image_profile);
        AppCompatButton editbtn = (AppCompatButton) findViewById(R.id.edit_profile);
        editbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfileActivity.this, EditProfileActivity.class));
            }
        });

        mLinearLayoutManager = new LinearLayoutManager(this);

        // Set up the RecyclerView
        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(mLinearLayoutManager);

        reports = (LinearLayout) findViewById(R.id.signalements_btn);

        final FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();


        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

        if (user != null) {

            for (UserInfo profile : user.getProviderData()) {


                // Id of the provider (ex: google.com)
                String providerId = profile.getProviderId();

                // UID specific to the provider
                String uid = profile.getUid();

                // Name, email address, and profile photo Url
                String name = profile.getDisplayName();
                String email = profile.getEmail();
                String photoUrl = profile.getPhotoUrl().toString();

                actualUser.setImageurl(photoUrl);
                Picasso.with(ProfileActivity.this).load(actualUser.getImageurl()).into(image);
                actualUser.setName(name);
                nameDisplayed.setText(user.getDisplayName());
                startapp.setText("");
            }
        }

        reference = FirebaseDatabase.getInstance().getReference().child("posts");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                list = new ArrayList<Report>();
                namedLocations = new ArrayList<>();

                for(DataSnapshot dataSnapshot1: dataSnapshot.getChildren())
                {

                        Report p = dataSnapshot1.getValue(Report.class);
                        list.add(p);
                        NamedLocation namedLocation = new NamedLocation(p.getDisplayNameUserPost(),
                                new LatLng(p.getLatitude(), p.getLongitude()), p.getPublishedAt(), p.getHeure(), p.getPhotoProfile(), p.getAdresse());
                        namedLocations.add(namedLocation);

                        mRecyclerView.setAdapter(new ProfileActivity.MapAdapter(namedLocations));
                        mRecyclerView.setRecyclerListener(mRecycleListener);


                }


            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        ImageView back = (ImageView) findViewById(R.id.back_actu);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfileActivity.this,MainActivity.class));
            }
        });


    }

    /**
     * Adapter that displays a title and {@link com.google.android.gms.maps.MapView} for each item.
     * The layout is defined in <code>lite_list_demo_row.xml</code>. It contains a MapView
     * that is programatically initialised in
     * {@link #(int, android.view.View, android.view.ViewGroup)}
     */
    public class MapAdapter extends RecyclerView.Adapter<MapAdapter.ViewHolder> {

        public ArrayList<NamedLocation> namedLocations;

        public MapAdapter(ArrayList<NamedLocation> locations) {
            super();
            namedLocations = locations;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new ProfileActivity.MapAdapter.ViewHolder(LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.lite_list_demo_row, parent, false));
        }

        /**
         * This function is called when the user scrolls through the screen and a new item needs
         * to be shown. So we will need to bind the holder with the details of the next item.
         */
        @Override
        public void onBindViewHolder(MapAdapter.ViewHolder holder, int position) {

            if (holder == null) {
                return;
            }
            holder.bindView(position);
        }

        @Override
        public int getItemCount() {
            return namedLocations.size();
        }


        class ViewHolder extends RecyclerView.ViewHolder implements OnMapReadyCallback {

            MapView mapView;
            TextView title, date, time, adresse;
            ImageView profilePic;
            GoogleMap map;
            View layout;

            private ViewHolder(View itemView) {

                super(itemView);
                layout = itemView;
                mapView = layout.findViewById(R.id.lite_listrow_map);
                title = layout.findViewById(R.id.authorName);
                date = layout.findViewById(R.id.publishedAt);
                time = layout.findViewById(R.id.timePosted);
                profilePic = layout.findViewById(R.id.avatar_image);
                adresse = layout.findViewById(R.id.timePosted)    ;

                if (mapView != null) {
                    // Initialise the MapView
                    mapView.onCreate(null);
                    // Set the map ready callback to receive the GoogleMap object
                    mapView.getMapAsync(this);
                }
            }

            @Override
            public void onMapReady(GoogleMap googleMap) {
                MapsInitializer.initialize(getApplicationContext());
                map = googleMap;
                setMapLocation();
            }


            private void setMapLocation() {
                if (map == null) return;

                NamedLocation data = (NamedLocation) mapView.getTag();
                if (data == null) return;

                // Add a marker for this item and set the camera
                map.moveCamera(CameraUpdateFactory.newLatLngZoom(data.location, 13f));
                map.addMarker(new MarkerOptions().position(data.location));

                // Set the map type back to normal.
                map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
            }

            private void bindView(int pos) {

                NamedLocation item = namedLocations.get(pos);
                // Store a reference of the ViewHolder object in the layout.
                layout.setTag(this);

                // Store a reference to the item in the mapView's tag. We use it to get the
                // coordinate of a location, when setting the map location.
                mapView.setTag(item);
                setMapLocation();

                title.setText(item.name);
                date.setText(item.date);
                time.setText(item.pid);
                adresse.setText(item.adresse);

                Picasso.with(ProfileActivity.this).load(item.profileImgUri).into(profilePic);

            }
        }
    }

    /**
     * RecycleListener that completely clears the {@link com.google.android.gms.maps.GoogleMap}
     * attached to a row in the RecyclerView.
     * Sets the map type to {@link com.google.android.gms.maps.GoogleMap#MAP_TYPE_NONE} and clears
     * the map.
     */
    private RecyclerView.RecyclerListener mRecycleListener = new RecyclerView.RecyclerListener() {

        @Override
        public void onViewRecycled(RecyclerView.ViewHolder holder) {

            ProfileActivity.MapAdapter.ViewHolder mapHolder = (ProfileActivity.MapAdapter.ViewHolder) holder;
            if (mapHolder != null && mapHolder.map != null) {
                // Clear the map and free up resources by changing the map type to none.
                // Also reset the map when it gets reattached to layout, so the previous map would
                // not be displayed.
                mapHolder.map.clear();
                mapHolder.map.setMapType(GoogleMap.MAP_TYPE_NONE);
            }
        }
    };

    /**
     * Location represented by a position ({@link com.google.android.gms.maps.model.LatLng} and a
     * name ({@link java.lang.String}).
     */

    /**
     * A list of locations to show in this ListView.
     */
}

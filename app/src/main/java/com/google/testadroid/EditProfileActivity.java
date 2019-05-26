package com.google.testadroid;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.testadroid.Models.User;
import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;

public class EditProfileActivity extends AppCompatActivity {

    public EditText name;
    public CircleImageView image;
    public FloatingActionButton btn_change_img;
    public AppCompatButton editProfil;
    public EditText editText;
    DatabaseReference reference;
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        image = (CircleImageView) findViewById(R.id.image_profile);
        user = new User();
        reference = FirebaseDatabase.getInstance().getReference().child("posts").child("-LeHfdN3qBysv4ku0K2f");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                user.setImageurl(dataSnapshot.child("profilePic").getValue().toString());
                Picasso.with(EditProfileActivity.this).load(user.getImageurl()).into(image);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        editProfil = (AppCompatButton) findViewById(R.id.edit_profile);
        editText = (EditText) findViewById(R.id.new_name);
        editProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user.setName(editText.getText().toString());
                reference.child("displayNameUserPost").setValue(user.getName());
                startActivity(new Intent(EditProfileActivity.this,ProfileActivity.class));
            }
        });


        ImageView back = (ImageView) findViewById(R.id.back_profile);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EditProfileActivity.this,ProfileActivity.class));
            }
        });
    }
}

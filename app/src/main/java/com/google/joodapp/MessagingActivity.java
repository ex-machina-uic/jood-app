package com.google.joodapp;

import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.material.bottomnavigation.BottomNavigationMenuView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

public class MessagingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messaging);











        /* BottomNavigation Section */
        final BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView_Bar);
        //BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(1);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.ic_home:
                        Intent intent1 = new Intent(MessagingActivity.this, MainActivity.class);
                        startActivity(intent1);
                        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                        break;

                    case R.id.ic_messages:
                        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                        break;

                    case R.id.ic_navigation:
                        Intent intent2 = new Intent(MessagingActivity.this, NavigationActivity.class);
                        startActivity(intent2);
                        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                        break;

                    case R.id.ic_notifications:
                        Intent intent4 = new Intent(MessagingActivity.this, NotificationActivity.class);
                        startActivity(intent4);
                        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                        break;
                }


                return false;
            }
        });

        BottomNavigationMenuView menuView = (BottomNavigationMenuView) bottomNavigationView.getChildAt(0);

        for (int i = 0; i < menuView.getChildCount(); i++) {

            final View iconView = menuView.getChildAt(i).findViewById(com.google.android.material.R.id.icon);
            final ViewGroup.LayoutParams layoutParams = iconView.getLayoutParams();
            final DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            layoutParams.height = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 21, displayMetrics);
            layoutParams.width = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 21, displayMetrics);
            iconView.setLayoutParams(layoutParams);
        }

        /* BottomNavigation Section */
    }
}

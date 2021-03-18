package com.example.navcal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Dashboard extends AppCompatActivity {

    //initialize variable
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        //assign vari
        drawerLayout = findViewById(R.id.drawer_layout);
    }

    public void ClickMenu(View view) {
        //open drawer
        MainActivity.openDrawer(drawerLayout);
    }

    public void ClickLogo(View view){
        //close drawer
        MainActivity.closeDrawer(drawerLayout);
    }

    public void ClickHome(View view){
        //redirect activity to home
        MainActivity.redirectActivity(this, MainActivity.class);
    }

    public void ClickDashboard(View view){
        //recreate activty
        recreate();

    }
    public void ClickCalculator(View view) {
        //recreate activty
        MainActivity.redirectActivity(this, Calculator.class);
    }

    public void ClickAbout(View view){
        //redirect activty to about us
        MainActivity.redirectActivity(this,AboutUs.class);

    }

    @Override
    protected void onPause() {
        super.onPause();
        //close drawer
        MainActivity.closeDrawer(drawerLayout);
    }


    public void twitter(View view){
        Intent twitterIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/CaltransHQ"));
        startActivity(twitterIntent);
    }

    public void facebook(View view){
        Intent facebookIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/CaltransHQ"));
        startActivity(facebookIntent);
    }
    public void caltransweb(View view){
        Intent caltranswebIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://dot.ca.gov/"));
        startActivity(caltranswebIntent);
    }




}
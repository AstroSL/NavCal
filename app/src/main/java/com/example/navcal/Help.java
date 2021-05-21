package com.example.navcal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Help extends AppCompatActivity {

    //initialize variable
    DrawerLayout drawerLayout;
    TextView CalcTitle, DashTitle, HistoryTitle, CalcDetails, DashDetails, HistoryDetails;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        //Initialization
        drawerLayout = findViewById(R.id.drawer_layout);

        CalcTitle = findViewById(R.id.calc_title);
        DashTitle = findViewById(R.id.dash_title);
        HistoryTitle = findViewById(R.id.history_title);
        CalcDetails = findViewById(R.id.calc_details);
        DashDetails = findViewById(R.id.dash_details);
        HistoryDetails = findViewById(R.id.history_details);
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
        //redirect activty to dashboard
        MainActivity.redirectActivity(this, Dashboard.class);

    }
    public void ClickCalculator(View view) {
        //recreate activty
        MainActivity.redirectActivity(this, Calculator.class);
    }

    public void ClickCalculator2(View view) {
        //recreate activty
        MainActivity.redirectActivity(this, Calculator2.class);
    }

    public void ClickHistory(View view) {
        //recreate activty
        MainActivity.redirectActivity(this, History.class);
    }

    public void ClickHelp(View view){
        recreate();

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
}
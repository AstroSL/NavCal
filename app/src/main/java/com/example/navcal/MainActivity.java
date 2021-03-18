package com.example.navcal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //initialize variable
    DrawerLayout drawerLayout;

    TextView result;
    TextView rbag;
    EditText number1, number2, number3;
    Button clear, add, oneBTN;

    float result_num;
    double num1, num2, num3;
    double totalAcre = (num1 / num2);
    float result_bag;
    float bagT;
    double acre = 43560 ;



    @SuppressLint({"DefaultLocale", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assign variable
        drawerLayout = findViewById(R.id.drawer_layout);

    }

    public void ClickMenu(View view){
        openDrawer(drawerLayout);
    }

    public static void openDrawer(DrawerLayout drawerLayout) {
        //open drawer layout
        drawerLayout.openDrawer(GravityCompat.START);

    }
    public void ClickLogo(View view){
        closeDrawer(drawerLayout);

    }

    public static void closeDrawer(DrawerLayout drawerLayout) {
        //close drawer layout
        //check condition
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            //when drawer is open
            //close drawer
            drawerLayout.closeDrawer(GravityCompat.START);
        }
    }

    public void ClickDashboard(View view){
        redirectActivity(this,Dashboard.class);

    }

    public void ClickHome(View view){
        //recreate activity
        recreate();
    }
    public void ClickCalculator(View view){
        //recreate activity
        redirectActivity(this,Calculator.class);
    }

    public void ClickCalculator2(View view){
        //redirect activity to about us
        redirectActivity(this,Calculator2.class);

    }public void ClickHistory(View view) {
        //recreate activty
        MainActivity.redirectActivity(this, History.class);
    }


    public void ClickAbout(View view){
        //redirect activity to about us
        redirectActivity(this,AboutUs.class);

    }

    public static void redirectActivity(Activity activity,Class aClass) {
        //initialize intent
        Intent intent = new Intent(activity,aClass);
        //set flag
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        //start activity
        activity.startActivity(intent);
    }

    @Override
    protected void onPause() {
        super.onPause();
        //close drawer
        closeDrawer(drawerLayout);
    }

    public void caltransTool(View view){
        Intent caltransToolIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://dot.ca.gov/programs/design/lap-erosion-control-design/tool-1-lap-erosion-control-toolbox"));
        startActivity(caltransToolIntent);
    }

}
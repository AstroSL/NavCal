package com.example.navcal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {


    DrawerLayout drawerLayout;
    TextView result, rbag, resultTank, tankLoad, sqFtTank;
    EditText number1, number2, number3, number4, number5;
    Button clear, add;

    float result_num, bagT, result_num2, tankT2, tankSqFt;
    double num1, num2, num3, num4, num5;
    double totalAcre = (num1 / num2);
    float result_bag;
    double acre = 43560 ;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        drawerLayout = findViewById(R.id.drawer_layout);

        number1=findViewById(R.id.number1);
        number2=findViewById(R.id.number2);
        number3=findViewById(R.id.number3);
        number4=findViewById(R.id.number4);
        number5=findViewById(R.id.number5);




        result=findViewById(R.id.result);
        clear=findViewById(R.id.clear);

        result = (TextView)findViewById(R.id.result);
        rbag = (TextView)findViewById(R.id.rBag);
        resultTank = (TextView)findViewById(R.id.resultTank);
        tankLoad = (TextView)findViewById(R.id.tankLoad);
        sqFtTank = (TextView)findViewById(R.id.sqFeetTank);




        number1 = (EditText)findViewById(R.id.number1);
        number2 = (EditText)findViewById(R.id.number2);
        number3 = (EditText)findViewById(R.id.number3);
        number4 = (EditText)findViewById(R.id.number4);
        number5 = (EditText)findViewById(R.id.number5);



        add = (Button)findViewById(R.id.add);

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1.getText().clear();
                number2.getText().clear();
                number3.getText().clear();
                number4.getText().clear();
                number5.getText().clear();
            }
        });



        add.setOnClickListener(new View.OnClickListener() {
            @SuppressLint({"DefaultLocale", "SetTextI18n"})
            @Override
            public void onClick(View v) {
                
                /*double num1 = Double.parseDouble(String.valueOf(number1.getText()));
                double acre = 43560.0 ;//0.25 acre
                num2.setText((Math.round(num1) / Integer.parseInt(String.valueOf(num3.getText()) )));
                double bags = (num2 / Double.parseDouble(num3.getText()*10)/10);*/

                /*num1 = Integer.parseInt(number1.getText().toString());//total
                num2 = Integer.parseInt(number2.getText().toString());//mulch app
                num3 = Integer.parseInt(number3.getText().toString());//bag weight*/

                num1 = Double.parseDouble(number1.getText().toString());//total size
                num2 = Double.parseDouble(number2.getText().toString());//mulch app
                num3 = Double.parseDouble(number3.getText().toString());//bag weight
                num4 = Double.parseDouble(number4.getText().toString());//tank size
                num5 = Double.parseDouble(number5.getText().toString());//mulch mixing rate

                //total much needed for project
                result_num = (float) (num2 * (num1/acre));//double acre = 43560 ;
                bagT = (float)((result_num / num3 * 10) / 10);

                //total tank loads needed for project
                result_num2=(float)((num4 * num5) /100/ num3);//bags per tank
                tankT2=(bagT/result_num2);//tank load
                tankSqFt=(float)(num1/tankT2);//sq ft/tank



                //output text total mulch needed for project
                result.setText(String.format("%.2f",result_num)+ " lbs of mulch");
                rbag.setText(String.format("%.2f", bagT)+" bags");

                //output text total tank loads needed for project
                resultTank.setText(String.format("%.2f", result_num2)+ "  bags per tank");
                tankLoad.setText(String.format("%.2f", tankT2)+ "  tank loads");
                sqFtTank.setText(String.format("%.2f", tankSqFt)+ " sq ft/tank");



                //result.setText(String.valueOf(result_num) + " lbs of mulch");
                //rbag.setText(String.valueOf(bagT) + " bags");



                //result.setText(String.valueOf(Math.ceil(result_num)));//round up
                //rbag.setText(String.valueOf(Math.ceil(bagT)));//round up


            }



        });


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

    public void ClickCalculator(View view){
        recreate();
    }

    public void ClickCalculator2(View view) {
        //recreate activty
        MainActivity.redirectActivity(this, Calculator2.class);
    }

    public void ClickHistory(View view) {
        //recreate activty
        MainActivity.redirectActivity(this, History.class);
    }

    public void ClickDashboard(View view){
        //recreate activty
        MainActivity.redirectActivity(this,Dashboard.class);
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
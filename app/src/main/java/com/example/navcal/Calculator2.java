package com.example.navcal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Calculator2 extends AppCompatActivity {

    private Spinner sp1, sp2;
    private EditText editText;
    private TextView textOut;
    private Button button;
    DrawerLayout drawerLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator2);

        //Initialization
        editText = (EditText) findViewById(R.id.editTextNumber);
        textOut = (TextView) findViewById(R.id.textView);
        //textOut1 = (TextView) findViewById(R.id.textView13);
        //textOut2 = (TextView) findViewById(R.id.textView14);
        //textOut3 = (TextView) findViewById(R.id.textView15);
        button = (Button) findViewById(R.id.buttonConvert);
        sp1 = (Spinner) findViewById(R.id.sp1);
        sp2 = (Spinner) findViewById(R.id.sp2);
        drawerLayout = findViewById(R.id.drawer_layout);


        String[] unitConversion = {"lb", "kg", "ton(metric)", "oz", "gram"};
        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,
                unitConversion);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp1.setAdapter(adapter);
        sp2.setAdapter(adapter);

        NumberFormat formatter = new DecimalFormat("0.###E0");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {

                //convertNumber();
                String userInput = editText.getText().toString();
                double input = Double.parseDouble(userInput);
                double result;

                if (sp1.getSelectedItem().toString() == "lb"
                        && sp2.getSelectedItem().toString() == "kg") {

                    result = input * 0.453592;

                    String length = "" + result;
                    String[] split = length.split("\\.");

                    if (split[0].length() + split[1].length() > 8) {

                        textOut.setText(String.format("%9.3E", result));

                    } else {
                        textOut.setText("" + result);
                    }
                    ;
                } else if (sp1.getSelectedItem().toString() == "lb"
                        && sp2.getSelectedItem().toString() == "gram") {

                    result = input * 453.592;

                    String length = "" + result;
                    String[] split = length.split("\\.");

                    if (split[0].length() + split[1].length() > 8) {

                        textOut.setText(String.format("%9.3E", result));

                    } else {
                        textOut.setText("" + result);
                    }
                    ;

                } else if (sp1.getSelectedItem().toString() == "lb"
                        && sp2.getSelectedItem().toString() == "ton(metric)") {

                    result = input * 0.000453592;

                    String length = "" + result;
                    String[] split = length.split("\\.");

                    if (split[0].length() + split[1].length() > 8) {

                        textOut.setText(String.format("%9.3E", result));

                    } else {
                        textOut.setText("" + result);
                    }
                    ;

                } else if (sp1.getSelectedItem().toString() == "lb"
                        && sp2.getSelectedItem().toString() == "oz") {

                    result = input * 16;

                    String length = "" + result;
                    String[] split = length.split("\\.");

                    if (split[0].length() + split[1].length() > 8) {

                        textOut.setText(String.format("%9.3E", result));

                    } else {
                        textOut.setText("" + result);
                    }
                    ;

                } else if (sp1.getSelectedItem().toString() == "kg"
                        && sp2.getSelectedItem().toString() == "lb") {

                    result = input * 2.2046;

                    String length = "" + result;
                    String[] split = length.split("\\.");

                    if (split[0].length() + split[1].length() > 8) {

                        textOut.setText(String.format("%9.3E", result));

                    } else {
                        textOut.setText("" + result);
                    }
                    ;

                } else if (sp1.getSelectedItem().toString() == "kg"
                        && sp2.getSelectedItem().toString() == "oz") {

                    result = input * 35.274;

                    String length = "" + result;
                    String[] split = length.split("\\.");

                    if (split[0].length() + split[1].length() > 8) {

                        textOut.setText(String.format("%9.3E", result));

                    } else {
                        textOut.setText("" + result);
                    }
                    ;

                } else if (sp1.getSelectedItem().toString() == "kg"
                        && sp2.getSelectedItem().toString() == "gram") {

                    result = input * 1000;

                    String length = "" + result;
                    String[] split = length.split("\\.");

                    if (split[0].length() + split[1].length() > 8) {

                        textOut.setText(String.format("%9.3E", result));

                    } else {
                        textOut.setText("" + result);
                    }
                    ;

                } else if (sp1.getSelectedItem().toString() == "kg"
                        && sp2.getSelectedItem().toString() == "ton(metric)") {

                    result = input * 0.001;

                    String length = "" + result;
                    String[] split = length.split("\\.");

                    if (split[0].length() + split[1].length() > 8) {

                        textOut.setText(String.format("%9.3E", result));

                    } else {
                        textOut.setText("" + result);
                    }
                    ;

                } else if (sp1.getSelectedItem().toString() == "oz"
                        && sp2.getSelectedItem().toString() == "lb") {

                    result = input * 0.0625;

                    String length = "" + result;
                    String[] split = length.split("\\.");

                    if (split[0].length() + split[1].length() > 8) {

                        textOut.setText(String.format("%9.3E", result));

                    } else {
                        textOut.setText("" + result);
                    }
                    ;

                } else if (sp1.getSelectedItem().toString() == "oz"
                        && sp2.getSelectedItem().toString() == "kg") {

                    result = input * 0.0283495;

                    String length = "" + result;
                    String[] split = length.split("\\.");

                    if (split[0].length() + split[1].length() > 8) {

                        textOut.setText(String.format("%9.3E", result));

                    } else {
                        textOut.setText("" + result);
                    }
                    ;

                } else if (sp1.getSelectedItem().toString() == "oz"
                        && sp2.getSelectedItem().toString() == "gram") {

                    result = input * 28.3495;

                    String length = "" + result;
                    String[] split = length.split("\\.");

                    if (split[0].length() + split[1].length() > 8) {

                        textOut.setText(String.format("%9.3E", result));

                    } else {
                        textOut.setText("" + result);
                    }
                    ;

                } else if (sp1.getSelectedItem().toString() == "oz"
                        && sp2.getSelectedItem().toString() == "ton(metric)") {

                    result = input / 35274;

                    String length = "" + result;
                    String[] split = length.split("\\.");

                    if (split[0].length() + split[1].length() > 8) {

                        textOut.setText(String.format("%9.3E", result));

                    } else {
                        textOut.setText("" + result);
                    }
                    ;

                } else if (sp1.getSelectedItem().toString() == "gram"
                        && sp2.getSelectedItem().toString() == "lb") {

                    result = input * 0.00220462;

                    String length = "" + result;
                    String[] split = length.split("\\.");

                    if (split[0].length() + split[1].length() > 8) {

                        textOut.setText(String.format("%9.3E", result));

                    } else {
                        textOut.setText("" + result);
                    }
                    ;

                } else if (sp1.getSelectedItem().toString() == "gram"
                        && sp2.getSelectedItem().toString() == "kg") {

                    result = input * 0.001;

                    String length = "" + result;
                    String[] split = length.split("\\.");

                    if (split[0].length() + split[1].length() > 8) {

                        textOut.setText(String.format("%9.3E", result));

                    } else {
                        textOut.setText("" + result);
                    }
                    ;

                } else if (sp1.getSelectedItem().toString() == "gram"
                        && sp2.getSelectedItem().toString() == "oz") {

                    result = input * 0.035274;

                    String length = "" + result;
                    String[] split = length.split("\\.");

                    if (split[0].length() + split[1].length() > 8) {

                        textOut.setText(String.format("%9.3E", result));

                    } else {
                        textOut.setText("" + result);
                    }
                    ;

                } else if (sp1.getSelectedItem().toString() == "gram"
                        && sp2.getSelectedItem().toString() == "ton(metric)") {

                    result = input * 0.000001;

                    String length = "" + result;
                    String[] split = length.split("\\.");

                    if (split[0].length() + split[1].length() > 8) {

                        textOut.setText(String.format("%9.3E", result));

                    } else {
                        textOut.setText("" + result);
                    }
                    ;

                } else if (sp1.getSelectedItem().toString() == "ton(metric)"
                        && sp2.getSelectedItem().toString() == "oz") {

                    result = input * 35274;

                    String length = "" + result;
                    String[] split = length.split("\\.");

                    if (split[0].length() + split[1].length() > 8) {

                        textOut.setText(String.format("%9.3E", result));

                    } else {
                        textOut.setText("" + result);
                    }
                    ;

                } else if (sp1.getSelectedItem().toString() == "ton(metric)"
                        && sp2.getSelectedItem().toString() == "gram") {

                    result = input * 1000000;

                    String length = "" + result;
                    String[] split = length.split("\\.");

                    if (split[0].length() + split[1].length() > 8) {

                        textOut.setText(String.format("%9.3E", result));

                    } else {
                        textOut.setText("" + result);
                    }
                    ;

                } else if (sp1.getSelectedItem().toString() == "ton(metric)"
                        && sp2.getSelectedItem().toString() == "kg") {

                    result = input * 1000;

                    String length = "" + result;
                    String[] split = length.split("\\.");

                    if (split[0].length() + split[1].length() > 8) {

                        textOut.setText(String.format("%9.3E", result));

                    } else {
                        textOut.setText("" + result);
                    }
                    ;

                } else if (sp1.getSelectedItem().toString() == "ton(metric)"
                        && sp2.getSelectedItem().toString() == "lb") {

                    result = input * 2204.62;

                    String length = "" + result;
                    String[] split = length.split("\\.");

                    if (split[0].length() + split[1].length() > 8) {

                        textOut.setText(String.format("%9.3E", result));

                    } else {
                        textOut.setText("" + result);
                    }
                    ;

                } else {

                    result = input;

                    String length = "" + result;
                    String[] split = length.split("\\.");

                    if (split[0].length() + split[1].length() > 8) {

                        textOut.setText(String.format("%9.3E", result));

                    } else {
                        textOut.setText("" + result);
                    }
                    ;
                }
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
        MainActivity.redirectActivity(this, Calculator.class);
    }

    public void ClickCalculator2(View view){
        recreate();
    }


    public void ClickHistory(View view) {
        //recreate activty
        MainActivity.redirectActivity(this, History.class);
    }


    public void ClickDashboard(View view){
        //recreate activty
        MainActivity.redirectActivity(this,Dashboard.class);

    }

    public void ClickHelp(View view) {
        //recreate activty
        MainActivity.redirectActivity(this, Help.class);
    }

    public void ClickAbout(View view){
        //redirect activty to about us
        MainActivity.redirectActivity(this,AboutUs.class);

    }




    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }


    public void onNothingSelected(AdapterView<?> parent) {

    }
}
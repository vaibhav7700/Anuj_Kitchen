package com.example.cravrrkakhaanapeena.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.cravrrkakhaanapeena.R;

public class AddOrderActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner EmployeeNameSpinner;
    EditText OrderItem_ET,TotalAmount_ET;
    Button addBtn,homeBtn;

    // create array of Strings
    // and store name of courses
    String[] Employees = { "Choose Employee","Rajnish","Sandeep","Narmata","Arpan","Shambhavi","Vaivhav","Ishika","Nidhi","Shiwangi","Rishav Yadav","Shashank","Rishi","Arvind","Shreya","Vishal" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_order);

        OrderItem_ET = findViewById(R.id.itemOrder_ET);
        TotalAmount_ET = findViewById(R.id.totalAmount_ET);
        addBtn = findViewById(R.id.addBtn);
        homeBtn = findViewById(R.id.homeBtn);


        EmployeeNameSpinner = findViewById(R.id.employeeNameSpinner);
        EmployeeNameSpinner.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);


        // Create the instance of ArrayAdapter
        // having the list of courses
        ArrayAdapter ad
                = new ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item,
                Employees);

        // set simple layout resource file
        // for each item of spinner
        ad.setDropDownViewResource(
                android.R.layout
                        .simple_spinner_dropdown_item);

        // Set the ArrayAdapter (ad) data on the
        // Spinner which binds data to spinner
        EmployeeNameSpinner.setAdapter(ad);

        if (OrderItem_ET.getText().toString()=="null"&&TotalAmount_ET.getText().toString()=="0"){
            startActivity(new Intent(AddOrderActivity.this,MainActivity.class));
        }
    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        // make toastof name of course
        // which is selected in spinner
        if(i!=0) {
            Toast.makeText(getApplicationContext(),
                    "You are Ordering"+ OrderItem_ET.getText().toString() + " for " + Employees[i],
                    Toast.LENGTH_LONG)
                    .show();
        }
        else {
            Toast.makeText(getApplicationContext(),
                            "Select an Employee for Ordering",
                            Toast.LENGTH_LONG)
                    .show();
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
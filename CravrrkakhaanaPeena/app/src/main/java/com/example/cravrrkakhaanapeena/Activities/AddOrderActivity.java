package com.example.cravrrkakhaanapeena.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.cravrrkakhaanapeena.R;

public class AddOrderActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner EmployeeNameSpinner;
    EditText OrderItem,TotalAmount;

    // create array of Strings
    // and store name of courses
    String[] Employees = { "Arpan","Vaivhav","Ishika","Nidhi","Shiwangi" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_order);

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
    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        // make toastof name of course
        // which is selected in spinner
        Toast.makeText(getApplicationContext(),
                        Employees[i],
                        Toast.LENGTH_LONG)
                .show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
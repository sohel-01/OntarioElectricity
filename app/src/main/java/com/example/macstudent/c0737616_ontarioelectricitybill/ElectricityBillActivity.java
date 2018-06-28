package com.example.macstudent.c0737616_ontarioelectricitybill;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class ElectricityBillActivity extends AppCompatActivity {
TextView txtViewCustName;
TextView txtViewAccNum;
TextView txtMeterNum;
EditText edtMonthlyUsage;
RadioButton rbprice,rbtereid;
RadioGroup rgplan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electricity_bill);

    }
}

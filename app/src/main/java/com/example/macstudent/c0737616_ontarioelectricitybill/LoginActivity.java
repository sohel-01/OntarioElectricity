package com.example.macstudent.c0737616_ontarioelectricitybill;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText edtEmail;
    private EditText edtPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = edtEmail.getText().toString();
                String password = edtPassword.getText().toString();
                if(userName.equals("user1@oeb.com") && password.equals("s3cr3t")){
                    Toast.makeText(getApplicationContext(), "Login Success", Toast.LENGTH_SHORT).show();
                    Intent mIntent = new Intent(LoginActivity.this,ElectricityBillActivity.class);
                    startActivity(mIntent);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Login Failed-Enter Correct Details", Toast.LENGTH_SHORT).show();
                }
                
            }
        });

    }

    private void initView() {
        edtEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);
    }
}

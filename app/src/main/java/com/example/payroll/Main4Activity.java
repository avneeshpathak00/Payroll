package com.example.payroll;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class Main4Activity extends AppCompatActivity {

    private long onBackpress;
    private Toast Backtoast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


        Button addemp = findViewById(R.id.addemp_ui4);
        addemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main4Activity.this,Main5Activity.class));
                finish();

            }
        });


        Button payslip = findViewById(R.id.payslip_ui4);
        payslip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main4Activity.this,Main6Activity.class));
                finish();

            }
        });


        Button viewemp = findViewById(R.id.viewemp_ui4);
        viewemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main4Activity.this,Main7Activity.class));
                finish();
            }
        });


        Button transaction = findViewById(R.id.transactions_ui4);
        transaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main4Activity.this,Main8Activity.class));
                finish();
            }
        });

    }


    public void logout(View view) {
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(getApplicationContext(),Main2Activity.class));
        Toast.makeText(Main4Activity.this, "Logged Out !!!", Toast.LENGTH_SHORT).show();
        finish();
    }


    @Override
    public void onBackPressed() {


        if (onBackpress + 2000 > System.currentTimeMillis()){
            Backtoast.cancel();
            super.onBackPressed();
            return;
        } else {
            Backtoast = Toast.makeText(getBaseContext(), "Press Back again to Exit !", Toast.LENGTH_SHORT);
            Backtoast.show();
        }

        onBackpress = System.currentTimeMillis();

    }


}

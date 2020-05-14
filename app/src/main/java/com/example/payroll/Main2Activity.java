package com.example.payroll;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Main2Activity extends AppCompatActivity {

    Button signup_pg, login_btn;
    EditText iemail,ipassword;
    FirebaseAuth mAuth;
    ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        iemail = findViewById(R.id.email_input_ui2);
        ipassword = findViewById(R.id.password_input_ui2);
        signup_pg = findViewById(R.id.signup_pg_btn_ui2);
        login_btn = findViewById(R.id.login_btn_ui2);

        mAuth = FirebaseAuth.getInstance();
        progressBar = findViewById(R.id.progressBar_ui2);


        if (mAuth.getCurrentUser() != null){
            startActivity(new Intent(getApplicationContext(),Main4Activity.class));
            finish();
        }


        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = iemail.getText().toString().trim();
                String password = ipassword.getText().toString().trim();

                if (TextUtils.isEmpty(email)){
                    iemail.setError("Email is Required");
                    return;
                }

                if (TextUtils.isEmpty(password)){
                    ipassword.setError("Password is Required");
                    return;
                }

                progressBar.setVisibility(View.VISIBLE);


                mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(Main2Activity.this, "Login Successful ! ", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(),Main4Activity.class));
                            finish();
                        } else {
                            Toast.makeText(Main2Activity.this, "Error" + task.getException(), Toast.LENGTH_SHORT).show();
                            progressBar.setVisibility(View.GONE);
                        }

                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {

                        Toast.makeText(Main2Activity.this, "User Not Found !", Toast.LENGTH_SHORT).show();
                    }
                });


            }
        });


        Button signup_pg = findViewById(R.id.signup_pg_btn_ui2);
        signup_pg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main2Activity.this,Main3Activity.class));
                finish();
            }
        });


    }
}

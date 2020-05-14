package com.example.payroll;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


public class Main3Activity extends AppCompatActivity {

    public static final String TAG = "TAG";
    EditText ifullname,imobile,iemail,ipassword;
    Button submit_btn;
    private FirebaseAuth mAuth;
    ProgressBar progressBar;
    FirebaseFirestore fStore;
    String userID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);



        ifullname = findViewById(R.id.fullname_input_ui3);
        imobile = findViewById(R.id.mobile_input_ui3);
        iemail = findViewById(R.id.email_input_ui3);
        ipassword = findViewById(R.id.password_input_ui3);
        submit_btn = findViewById(R.id.submit_btn_ui3);

        mAuth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();
        progressBar = findViewById(R.id.progressBar_ui3);



        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String email = iemail.getText().toString().trim();
                String password = ipassword.getText().toString().trim();
                final String fullname = ifullname.getText().toString().trim();
                final String mobile = imobile.getText().toString().trim();

                if (TextUtils.isEmpty(email)){
                    iemail.setError("Email is Required");
                    return;
                }

                if (TextUtils.isEmpty(password)){
                    ipassword.setError("Password is Required");
                    return;
                }

                progressBar.setVisibility(View.VISIBLE);

                mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(Main3Activity.this, "User Created ", Toast.LENGTH_SHORT).show();
                            userID = Objects.requireNonNull(mAuth.getCurrentUser()).getUid();
                            DocumentReference documentReference2 = fStore.collection("Users").document(userID);
                            startActivity(new Intent(getApplicationContext(),Main4Activity.class));
                            finish();
                            Map<String, Object> user = new HashMap<>();
                            user.put("FullName",fullname);
                            user.put("Email",email);
                            user.put("Mobile",mobile);
                            documentReference2.set(user).addOnSuccessListener(new OnSuccessListener<Void>() {
                                @Override
                                public void onSuccess(Void aVoid) {
                                    Log.d(TAG, "onSuccess: user profile created for :"+ userID);
                                }
                            });
                        } else {
                            Toast.makeText(Main3Activity.this, "Error" + task.getException(), Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(),Main2Activity.class));
                            progressBar.setVisibility(View.GONE);
                        }
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(Main3Activity.this, "Error !", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(Main3Activity.this,Main2Activity.class));
        finish();
    }
}

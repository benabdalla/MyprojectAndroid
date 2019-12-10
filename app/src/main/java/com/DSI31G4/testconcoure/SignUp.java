package com.DSI31G4.testconcoure;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SignUp extends AppCompatActivity {

    private FirebaseAuth mAuth;
    EditText userEmail;
    EditText passWord1;
    EditText passWord2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        userEmail = findViewById(R.id.signInEmail);
        passWord1 = findViewById(R.id.signInPassword1);
        passWord2 = findViewById(R.id.signInPassword2);


        mAuth = FirebaseAuth.getInstance();

        findViewById(R.id.signInButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = userEmail.getText().toString();
                String password = passWord1.getText().toString();
                String confirmPassword = passWord2.getText().toString();

                if (!isValidEmail(email)) {
                    Toast.makeText(SignUp.this, "Email not valid", Toast.LENGTH_SHORT).show();
                } else if (password.length() < 8) {
                    Toast.makeText(SignUp.this, "MotPass too short", Toast.LENGTH_SHORT).show();
                } else if (!password.equals(confirmPassword) ) {
                    Toast.makeText(SignUp.this, "Password does not match", Toast.LENGTH_SHORT).show();
                } else {
                    addUser(email, password);
                }
            }
        });

    }

    public void addUser(String email, String password) {
        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        String TAG = "addclient";
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            //Log.d(TAG, "createUserWithEmail:success");
                            FirebaseUser user = mAuth.getCurrentUser();
                            //updateUI(user);
                            //Toast.makeText(SignUp.this, "succ add", Toast.LENGTH_SHORT).show();
                            goToMain();

                        } else {
                            // If sign in fails, display a message to the user.
                           // Log.w(TAG, "createUserWithEmail:failure", task.getException());
                            Toast.makeText(SignUp.this, "failed to add", Toast.LENGTH_SHORT).show();
                            //updateUI(null);
                        }

                        // ...
                    }
                });
    }

    private void goToMain() {
        Intent myIntent = new Intent(this, MainActivity.class);
        startActivity(myIntent);
        finish();
    }

    public static boolean isValidEmail(CharSequence target) {
        return (!TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches());
    }
}

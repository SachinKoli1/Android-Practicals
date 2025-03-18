package com.example.androidpro;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    private EditText etName, etEmail, etPassword, etConfirmPassword;
    private Button btnSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Initialize views
        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        etConfirmPassword = findViewById(R.id.etConfirmPassword);
        btnSignUp=findViewById(R.id.btnSignUp);
        // Set up the signup button click listener
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Capture user input
                String name = etName.getText().toString().trim();
                String email = etEmail.getText().toString().trim();
                String password = etPassword.getText().toString().trim();
                String confirmPassword =
                        etConfirmPassword.getText().toString().trim();
                // Simple validation for empty fields
                if (name.isEmpty() || email.isEmpty() || password.isEmpty() ||
                        confirmPassword.isEmpty()) {
                    Object fields;
                    Toast.makeText(MainActivity.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                } else if (!password.equals(confirmPassword)) {
                    // Check if password and confirm password match
                    Toast.makeText(MainActivity.this, "Passwords do not match", Toast.LENGTH_SHORT).show();
                } else {
                    // Simulate a signup action (you can replace this with actual logic)
                    Toast.makeText(MainActivity.this, "Sign up successful",
                            Toast.LENGTH_SHORT).show();
                    // Clear the fields after successful signup
                    etName.setText("");
                    etEmail.setText("");
                    etPassword.setText("");
                    etConfirmPassword.setText("");
                }
            }
        });
    }
}

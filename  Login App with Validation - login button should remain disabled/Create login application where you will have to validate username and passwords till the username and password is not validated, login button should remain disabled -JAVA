package com.example.androidpro;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.androidpro.R;

public class MainActivity extends AppCompatActivity {
    EditText etUsername, etPassword;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);
        // Enable button only if both fields are not empty
        TextWatcher textWatcher = new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before,
                                      int count) {
                // Enable login button only if both fields are filled
                String usernameInput = etUsername.getText().toString().trim();
                String passwordInput = etPassword.getText().toString().trim();
                btnLogin.setEnabled(!usernameInput.isEmpty() &&
                        !passwordInput.isEmpty());
            }
            @Override public void beforeTextChanged(CharSequence s, int start,
                                                    int count, int after) {}
            @Override public void afterTextChanged(Editable s) {}
        };
        etUsername.addTextChangedListener(textWatcher);
        etPassword.addTextChangedListener(textWatcher);
        btnLogin.setOnClickListener(v -> {
            if (etUsername.getText().toString().equals("admin") &&
                    etPassword.getText().toString().equals("1234")) {
                Toast.makeText(MainActivity.this, "Login Successful",
                        Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this, "Invalid Credentials",
                        Toast.LENGTH_SHORT).show();
                btnLogin.setEnabled(false);
            }
        });
    }
}

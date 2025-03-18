package com.example.androidpro;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    EditText etNumber1, etNumber2;
    Button btnAdd, btnSubtract, btnMultiply, btnDivide;
    TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNumber1 = findViewById(R.id.etNumber1);
        etNumber2 = findViewById(R.id.etNumber2);
        btnAdd = findViewById(R.id.btnAdd);
        btnSubtract = findViewById(R.id.btnSubtract);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        tvResult = findViewById(R.id.tvResult);
        btnAdd.setOnClickListener(v -> calculate('+'));
        btnSubtract.setOnClickListener(v -> calculate('-'));
        btnMultiply.setOnClickListener(v -> calculate('*'));
        btnDivide.setOnClickListener(v -> calculate('/'));
    }
    private void calculate(char operation) {
        String num1Str = etNumber1.getText().toString();
        String num2Str = etNumber2.getText().toString();
        if (num1Str.isEmpty() || num2Str.isEmpty()) {
            Toast.makeText(this, "Please enter both numbers",
                    Toast.LENGTH_SHORT).show();
            return;
        }
        double num1 = Double.parseDouble(num1Str);
        double num2 = Double.parseDouble(num2Str);
        double result = 0;
        switch (operation) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/':
                if (num2 == 0) {
                    Toast.makeText(this, "Cannot divide by zero",
                            Toast.LENGTH_SHORT).show();
                    return;
                }
                result = num1 / num2;
                break;
        }
        tvResult.setText("Result: " + result);
    }
}

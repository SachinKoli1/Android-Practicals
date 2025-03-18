package com.example.androidpro;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    private ProgressBar progressCircular, progressHorizontal;
    private Button btnStart;
    private int progressStatus = 0;
    private Handler handler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Initialize UI elements
        progressCircular = findViewById(R.id.progress_circular);
        progressHorizontal = findViewById(R.id.progress_horizontal);
        btnStart = findViewById(R.id.btn_start);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show progress bars
                progressCircular.setVisibility(View.VISIBLE);
                progressHorizontal.setVisibility(View.VISIBLE);
                progressStatus = 0;

                // Simulate progress update
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while (progressStatus < 100) {
                            progressStatus += 10;
                            handler.post(new Runnable() {
                                @Override
                                public void run() {

                                    progressHorizontal.setProgress(progressStatus);
                                }
                            });
                            try {
                                Thread.sleep(500); // Simulate work being done
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
// Hide circular progress bar when done
                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                progressCircular.setVisibility(View.GONE);
                            }
                        });
                    }
                }).start();
            }
        });
    }
}
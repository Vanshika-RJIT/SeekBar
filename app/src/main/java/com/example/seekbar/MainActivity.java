package com.example.seekbar;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView t;
    private ProgressBar p;
    private SeekBar s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t=findViewById(R.id.textView);
        p=findViewById(R.id.progressBar);
        s=findViewById(R.id.seekBar);
        s.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                p.setProgress(progress);
                t.setText(""+progress+"");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}

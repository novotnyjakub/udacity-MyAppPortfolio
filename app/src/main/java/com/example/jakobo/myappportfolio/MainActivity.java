package com.example.jakobo.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void appButtonClick(View view) {
        Button button = (Button)view;
        String toastText = "This will eventually launch the '" + button.getText() + "' app. Please be patient!";

        Toast.makeText(this, toastText, Toast.LENGTH_SHORT).show();
    }
}

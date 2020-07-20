package com.padaayi.PunjabiMatching;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_splash_screen);
    }
    public void onStart() {
        super.onStart();
        startActivity(new Intent(this, MainActivity.class));
    }
}


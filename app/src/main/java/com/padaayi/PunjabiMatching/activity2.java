package com.padaayi.PunjabiMatching;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class activity2 extends AppCompatActivity {
    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView textView6;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_activity2);
        String score = Integer.toString(getIntent().getIntExtra("score", 0));
        this.textView1 = (TextView) findViewById(R.id.textView21);
        this.textView2 = (TextView) findViewById(R.id.textView22);
        this.textView3 = (TextView) findViewById(R.id.textView3);
        this.textView4 = (TextView) findViewById(R.id.textView4);
        this.textView5 = (TextView) findViewById(R.id.textView5);
        this.textView6 = (TextView) findViewById(R.id.textView6);
        TextView textView = this.textView2;
        StringBuilder sb = new StringBuilder();
        sb.append(score);
        sb.append("/10");
        textView.setText(sb.toString());
    }

    public void buclick(View view) {
        startActivity(new Intent(this, lastlayout.class));
    }
}

package com.padaayi.PunjabiMatching;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog.Builder;
import androidx.appcompat.app.AppCompatActivity;

public class lastlayout extends AppCompatActivity {
    TextView textView28;
    TextView textView29;
    TextView textView30;
    TextView textView31;
    TextView textView32;
    TextView textView33;
    TextView textView34;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_lastlayout);
        this.textView28 = (TextView) findViewById(R.id.textView28);
        this.textView29 = (TextView) findViewById(R.id.textView29);
        this.textView30 = (TextView) findViewById(R.id.textView30);
        this.textView31 = (TextView) findViewById(R.id.textView31);
        this.textView32 = (TextView) findViewById(R.id.textView32);
        this.textView33 = (TextView) findViewById(R.id.textView33);
        this.textView34 = (TextView) findViewById(R.id.textView34);
    }

    public void buclick(View view) {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((TextView) view).getText().toString())));
    }

    public void onBackPressed() {
        Builder alertDialogBuilder = new Builder(this);
        alertDialogBuilder.setTitle((CharSequence) "बाहर जाएं");
        alertDialogBuilder.setMessage((CharSequence) "क्या तुम सच में बाहर निकलना चाहते हो?").setCancelable(false).setPositiveButton((CharSequence) "हाँ", (OnClickListener) new OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                MainActivity.mediaPlayer.stop();
                lastlayout.this.finish();
                Intent intent = new Intent("android.intent.action.MAIN");
                intent.addCategory("android.intent.category.HOME");
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                lastlayout.this.startActivity(intent);
            }
        }).setNegativeButton((CharSequence) "नहीं", (OnClickListener) new OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        });
        alertDialogBuilder.create().show();
    }
}

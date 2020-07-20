package com.padaayi.PunjabiMatching;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog.Builder;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    protected static MediaPlayer mediaPlayer;
    TextView TextView10;
    String[] ans1;
    String[] ans2;
    String[] ans3;
    Integer[] option1;
    Integer[] option2;
    Integer[] option3;
    String[] ques1;
    String[] ques2;
    String[] ques3;
    Random random = new Random();
    int score;
    Spinner spinner1;
    Spinner spinner10;
    Spinner spinner2;
    Spinner spinner3;
    Spinner spinner4;
    Spinner spinner5;
    Spinner spinner6;
    Spinner spinner7;
    Spinner spinner8;
    Spinner spinner9;
    int temp;
    TextView textView1;
    TextView textView11;
    TextView textView12;
    TextView textView13;
    TextView textView14;
    TextView textView15;
    TextView textView16;
    TextView textView17;
    TextView textView18;
    TextView textView19;
    TextView textView2;
    TextView textView20;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView textView6;
    TextView textView7;
    TextView textView8;
    TextView textView9;

    public MainActivity() {
        Integer valueOf = Integer.valueOf(10);
        String str = "शुभ रात्रि";
        Integer valueOf2 = Integer.valueOf(1);
        Integer valueOf3 = Integer.valueOf(2);
        Integer valueOf4 = Integer.valueOf(3);
        Integer valueOf5 = Integer.valueOf(4);
        String str2 = "धन्यवाद";
        Integer valueOf6 = Integer.valueOf(5);
        Integer valueOf7 = Integer.valueOf(6);
        Integer valueOf8 = Integer.valueOf(7);
        Integer valueOf9 = Integer.valueOf(8);
        Integer valueOf10 = Integer.valueOf(9);
        this.ques1 = new String[]{"सत श्री अकाल", str, "हाँ", "नहीं", "आपका स्वागत है", str2, "मुझे माफ कर दो", "मेरा नाम है....", "मैं से हूँ", "मेरी उम्र है"};
        String str3 = "ਗੁਡ ਨਾਇਟ";
        String str4 = "ਸਤ ਸੀ੍ ਅਕਾਲ";
        String str5 = "ਧੰਨਵਾਦ";
        this.ans1 = new String[]{str3, str4, "ਮੇਰਾ ਨਾਂ", "ਮੈਂ  ਤੋਂ ਆਇਆ ਹਾਂ", "ਮੈਂ... ਸਾਲ ਦਾ ਹਾਂ", "ਨਹੀ", "ਮੈਨੂ ਮਾਫ ਕਰੋ", "!!ਪਲੀਜ਼", str5, "ਆਹੋ/ ਹਾੰਜੀ"};
        this.option1 = new Integer[]{valueOf3, valueOf2, valueOf, valueOf7, valueOf9, valueOf10, valueOf8, valueOf4, valueOf5, valueOf6};
        String str6 = "ठीक है";
        String str7 = "क्या हाल है?";
        String str8 = "आप कहाँ हैं?";
        String str9 = "इक्कीस";
        this.ques2 = new String[]{"शायद", "अलविदा", str, "शुभ प्रभात", "दस", str2, str6, str7, str8, str9};
        String str10 = "ਇਕਿ";
        String str11 = "ਤੁਸੀ ਕਿਵੇਂ ਹੋ?";
        this.ans2 = new String[]{"ਦਸ", str4, str10, str3, str11, "ਫਿਰ ਮਿਲਾੰਗੇ", "ਠੀਕ ਹੈ", str5, "ਤੁਸੀ ਕਿੱਥੋ ਹੋ?", "ਸ਼ਾਇਦ"};
        this.option2 = new Integer[]{valueOf, valueOf7, valueOf5, valueOf3, valueOf2, valueOf9, valueOf8, valueOf6, valueOf10, valueOf4};
        this.ques3 = new String[]{str7, "मैं ठीक हूँ", str8, "खा", "ये कितना है?", str9, str6, "बस एक मिनट", "पिता", "मां"};
        this.ans3 = new String[]{"ਠੀਕ ਹੈ", "ਇਕ ਮਿਨਟ ਪਲੀਜ", "ਪਿਤਾ", "ਮੈਂ ਠੀਕ ਹਾਂ", "ਮਾਂ", str11, "ਖਾਓ", "ਤੁਸੀ ਕਿੱਥੋ ਹੋ?", "ਇਹ ਕਿੰਨਾ ਹੈ?", str10};
        this.option3 = new Integer[]{valueOf7, valueOf5, valueOf9, valueOf8, valueOf10, valueOf, valueOf2, valueOf3, valueOf4, valueOf6};
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main);
        this.score = 0;
        MediaPlayer create = MediaPlayer.create(this, R.raw.audio);
        mediaPlayer = create;
        create.start();
        this.textView1 = (TextView) findViewById(R.id.textView);
        this.textView2 = (TextView) findViewById(R.id.textView2);
        this.textView3 = (TextView) findViewById(R.id.textView3);
        this.textView4 = (TextView) findViewById(R.id.textView4);
        this.textView5 = (TextView) findViewById(R.id.textView5);
        this.textView6 = (TextView) findViewById(R.id.textView6);
        this.textView7 = (TextView) findViewById(R.id.textView7);
        this.textView8 = (TextView) findViewById(R.id.textView8);
        this.textView9 = (TextView) findViewById(R.id.textView9);
        this.TextView10 = (TextView) findViewById(R.id.textView10);
        this.textView11 = (TextView) findViewById(R.id.textView11);
        this.textView12 = (TextView) findViewById(R.id.textView12);
        this.textView13 = (TextView) findViewById(R.id.textView13);
        this.textView14 = (TextView) findViewById(R.id.textView14);
        this.textView15 = (TextView) findViewById(R.id.textView15);
        this.textView16 = (TextView) findViewById(R.id.textView16);
        this.textView17 = (TextView) findViewById(R.id.textView17);
        this.textView18 = (TextView) findViewById(R.id.textView18);
        this.textView19 = (TextView) findViewById(R.id.textView19);
        this.textView20 = (TextView) findViewById(R.id.textView20);
        this.spinner1 = (Spinner) findViewById(R.id.spinner1);
        this.spinner2 = (Spinner) findViewById(R.id.spinner2);
        this.spinner3 = (Spinner) findViewById(R.id.spinner3);
        this.spinner4 = (Spinner) findViewById(R.id.spinner4);


        this.spinner5 = (Spinner) findViewById(R.id.spinner5);
        this.spinner6 = (Spinner) findViewById(R.id.spinner6);
        this.spinner7 = (Spinner) findViewById(R.id.spinner7);
        this.spinner8 = (Spinner) findViewById(R.id.spinner8);
        this.spinner9 = (Spinner) findViewById(R.id.spinner9);
        this.spinner10 = (Spinner) findViewById(R.id.spinner10);
        ArrayList<String> kk = new ArrayList<>();
        for(int i = 1;i<=10;i++)
            kk.add(Integer.toString(i));
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, kk);
        arrayAdapter.setDropDownViewResource(android.R.layout
                .simple_spinner_dropdown_item);
        this.spinner1.setAdapter(arrayAdapter);
        this.spinner2.setAdapter(arrayAdapter);
        this.spinner3.setAdapter(arrayAdapter);
        this.spinner4.setAdapter(arrayAdapter);
        this.spinner5.setAdapter(arrayAdapter);
        this.spinner6.setAdapter(arrayAdapter);
        this.spinner7.setAdapter(arrayAdapter);
        this.spinner8.setAdapter(arrayAdapter);
        this.spinner9.setAdapter(arrayAdapter);
        this.spinner10.setAdapter(arrayAdapter);
        int nextInt = this.random.nextInt(3) + 1;
        this.temp = nextInt;
        if (nextInt == 1) {
            fun1();
        } else if (nextInt == 2) {
            fun2();
        } else if (nextInt == 3) {
            fun3();
        }
    }

    public void fun1() {
        ArrayList<TextView> tvarrayList = new ArrayList<>(Arrays.asList(new TextView[]{this.textView1, this.textView2, this.textView3, this.textView4, this.textView5, this.textView6, this.textView7, this.textView8, this.textView9, this.TextView10}));
        for (int i = 0; i < 10; i++) {
            ((TextView) tvarrayList.get(i)).setText(this.ques1[i]);
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(new TextView[]{this.textView11, this.textView12, this.textView13, this.textView14, this.textView15, this.textView16, this.textView17, this.textView18, this.textView19, this.textView20}));
        for (int i2 = 0; i2 < 10; i2++) {
            ((TextView) arrayList.get(i2)).setText(this.ans1[i2]);
        }
    }

    public void fun2() {
        ArrayList<TextView> tvarrayList = new ArrayList<>(Arrays.asList(new TextView[]{this.textView1, this.textView2, this.textView3, this.textView4, this.textView5, this.textView6, this.textView7, this.textView8, this.textView9, this.TextView10}));
        for (int i = 0; i < 10; i++) {
            ((TextView) tvarrayList.get(i)).setText(this.ques2[i]);
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(new TextView[]{this.textView11, this.textView12, this.textView13, this.textView14, this.textView15, this.textView16, this.textView17, this.textView18, this.textView19, this.textView20}));
        for (int i2 = 0; i2 < 10; i2++) {
            ((TextView) arrayList.get(i2)).setText(this.ans2[i2]);
        }
    }

    public void fun3() {
        ArrayList<TextView> tvarrayList = new ArrayList<>(Arrays.asList(new TextView[]{this.textView1, this.textView2, this.textView3, this.textView4, this.textView5, this.textView6, this.textView7, this.textView8, this.textView9, this.TextView10}));
        for (int i = 0; i < 10; i++) {
            ((TextView) tvarrayList.get(i)).setText(this.ques3[i]);
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(new TextView[]{this.textView11, this.textView12, this.textView13, this.textView14, this.textView15, this.textView16, this.textView17, this.textView18, this.textView19, this.textView20}));
        for (int i2 = 0; i2 < 10; i2++) {
            ((TextView) arrayList.get(i2)).setText(this.ans3[i2]);
        }
    }

    public void ishan(View view) {
        int count;
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(Integer.parseInt(this.spinner1.getSelectedItem().toString())));
        arrayList.add(Integer.valueOf(Integer.parseInt(this.spinner2.getSelectedItem().toString())));
        arrayList.add(Integer.valueOf(Integer.parseInt(this.spinner3.getSelectedItem().toString())));
        arrayList.add(Integer.valueOf(Integer.parseInt(this.spinner4.getSelectedItem().toString())));
        arrayList.add(Integer.valueOf(Integer.parseInt(this.spinner5.getSelectedItem().toString())));
        arrayList.add(Integer.valueOf(Integer.parseInt(this.spinner6.getSelectedItem().toString())));
        arrayList.add(Integer.valueOf(Integer.parseInt(this.spinner7.getSelectedItem().toString())));
        arrayList.add(Integer.valueOf(Integer.parseInt(this.spinner8.getSelectedItem().toString())));
        arrayList.add(Integer.valueOf(Integer.parseInt(this.spinner9.getSelectedItem().toString())));
        arrayList.add(Integer.valueOf(Integer.parseInt(this.spinner10.getSelectedItem().toString())));
        int i = this.temp;
        if (i == 1) {
            count = -1 + 1;
            for (int i2 = 0; i2 < 10; i2++) {
                if (arrayList.get(i2) == this.option1[i2]) {
                    count++;
                }
            }
        } else if (i == 2) {
            count = -1 + 1;
            for (int i3 = 0; i3 < 10; i3++) {
                if (arrayList.get(i3) == this.option2[i3]) {
                    count++;
                }
            }
        } else {
            count = -1 + 1;
            for (int i4 = 0; i4 < 10; i4++) {
                if (arrayList.get(i4) == this.option3[i4]) {
                    count++;
                }
            }
        }
        Intent intent = new Intent(this, activity2.class);
        intent.putExtra("score", count);
        startActivity(intent);
    }

    public void onBackPressed() {
        Builder alertDialogBuilder = new Builder(this);
        alertDialogBuilder.setTitle((CharSequence) "बाहर जाएं");
        alertDialogBuilder.setMessage((CharSequence) "क्या तुम सच में बाहर निकलना चाहते हो?").setCancelable(false).setPositiveButton((CharSequence) "हाँ", (OnClickListener) new OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                MainActivity.this.finish();
                MainActivity.mediaPlayer.stop();
                Intent intent = new Intent("android.intent.action.MAIN");
                intent.addCategory("android.intent.category.HOME");
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                MainActivity.this.startActivity(intent);
            }
        }).setNegativeButton((CharSequence) "नहीं", (OnClickListener) new OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        });
        alertDialogBuilder.create().show();
    }
}
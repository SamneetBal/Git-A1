package com.example.admin.texttospeech;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    TextToSpeech tto_s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextToSpeech.OnInitListener Listener = new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
            }
        };
        tto_s = new TextToSpeech(MainActivity.this , Listener);

        tto_s.setPitch((float) 1.0);
        tto_s.setSpeechRate((float) 1.0);
        tto_s.setLanguage(Locale.ENGLISH);
    }
     public void spk_txt(View view){

         EditText text_et = findViewById(R.id.speak);
         String txt = text_et.getText().toString();
         tto_s.speak(txt , TextToSpeech.QUEUE_FLUSH , null);
     }

}

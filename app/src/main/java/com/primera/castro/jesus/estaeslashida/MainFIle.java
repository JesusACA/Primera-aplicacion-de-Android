package com.primera.castro.jesus.estaeslashida;

import android.hardware.camera2.params.BlackLevelPattern;
import android.media.AudioManager;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.media.MediaPlayer;

import static com.primera.castro.jesus.estaeslashida.R.*;

public class MainFIle extends AppCompatActivity {

    EditText ed1;
    TextView tv1;
    int i;
    Button b1;
    MediaPlayer[] mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        i = 0;
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main_file);
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        mp =  new MediaPlayer[]{MediaPlayer.create(this, raw.wildw)};
        b1 = (Button) findViewById(id.btns2);
        b1.setVisibility(View.INVISIBLE);
        tv1 = (TextView) findViewById(id.ET1);
    }

    public void verValor(View v){
        ed1 = (EditText) findViewById(id.EditText1);
        Editable a = ed1.getText();
        tv1.setText(a);
        b1.setVisibility(View.VISIBLE);
        mp[0].start();
    }

    public void defendersAhora(View v){
        mp[0].pause();
        b1.setVisibility(View.INVISIBLE);
        tv1.setText("");
    }
}

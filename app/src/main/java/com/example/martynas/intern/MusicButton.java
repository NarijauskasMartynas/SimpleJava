package com.example.martynas.intern;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.Toast;

import java.io.IOException;

/**
 * Created by Martynas on 1/16/2018.
 */

public class MusicButton extends AppCompatButton {
    public Uri audioFileUri;
    public MediaPlayer mediaPlayer= new MediaPlayer();
    public Context context;
    public MusicButton(Context context) {
        super(context, null);
        this.context = context;
    }

    public MusicButton(Context context, AttributeSet attrs) {
        super(context, attrs, 0);
        this.context = context;
    }

    public MusicButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
    }
    public void play(){
       mediaPlayer.start();

    }

    public void setAudioFileUri(Uri audioFileUris){
        audioFileUri = audioFileUris;
        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
       try {
            mediaPlayer.setDataSource(context, audioFileUris);
            mediaPlayer.prepare();
        }
        catch(IOException x){
           Log.e("exceptionas", "lalala");
        }
    }

}

package com.example.martynas.intern;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatButton;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.martynas.intern.MusicButton;

import java.util.ArrayList;

/**
 * Created by Martynas on 1/17/2018.
 */

public class ButtonAdapter extends BaseAdapter {
    private Context mContext;
    MusicButton button;

    public MusicButton[] arrayButtons = new MusicButton[MainActivity.AudioFile.values().length+1];

    public int getCount() {
        return MainActivity.AudioFile.values().length;
    }

    public ButtonAdapter(Context c) {
        mContext = c;
    }

    public MusicButton getItem(int position) {
        return null;
    }

    public MusicButton getSelectedItem(int position){
        return arrayButtons[position];
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        button = new MusicButton(mContext, null, 0);
        button.setText(MainActivity.AudioFile.values()[position].text);
        button.setAudioFileUri(MainActivity.AudioFile.values()[position].link);
        button.setLayoutParams(new GridView.LayoutParams( ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        button.setPadding(8, 8, 8, 8);
        arrayButtons[position] = button;
        return button;
    } {
}}

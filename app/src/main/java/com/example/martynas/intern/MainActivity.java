package com.example.martynas.intern;


import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;


import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    public enum AudioFile{
        One("Hello", Uri.parse("android.resource://com.example.martynas.intern/" + R.raw.awful)),
        Two("Yes", Uri.parse("android.resource://com.example.martynas.intern/" + R.raw.hit_the_bar)),
        Three("Yes2",  Uri.parse("android.resource://com.example.martynas.intern/" + R.raw.bench_press)),
        Four("Yes I am",  Uri.parse("android.resource://com.example.martynas.intern/" + R.raw.fat_chicks)),
        Five("What is your name",  Uri.parse("android.resource://com.example.martynas.intern/" + R.raw.fifty_box)),
        Six("What's ur name",  Uri.parse("android.resource://com.example.martynas.intern/" + R.raw.giggidi)),
        Seven("First ", Uri.parse("android.resource://com.example.martynas.intern/" + R.raw.girly_magazines)),
        Eight("asdasd", Uri.parse("android.resource://com.example.martynas.intern/" + R.raw.going)),
        Nine("Hello",  Uri.parse("android.resource://com.example.martynas.intern/" + R.raw.heard_that)),
        Ten("Yes",  Uri.parse("android.resource://com.example.martynas.intern/" + R.raw.hit_the_bar)),
        Eleven("Hello", Uri.parse("android.resource://com.example.martynas.intern/" + R.raw.awful)),
        Twelve("Yes", Uri.parse("android.resource://com.example.martynas.intern/" + R.raw.hit_the_bar)),
        Thirteen("Yes2",  Uri.parse("android.resource://com.example.martynas.intern/" + R.raw.bench_press)),
        Fourteen("Yes I am",  Uri.parse("android.resource://com.example.martynas.intern/" + R.raw.fat_chicks)),
        Fifteen("What is your name",  Uri.parse("android.resource://com.example.martynas.intern/" + R.raw.fifty_box)),
        Sixteen("What's ur name",  Uri.parse("android.resource://com.example.martynas.intern/" + R.raw.giggidi)),
        Seventeen("First ", Uri.parse("android.resource://com.example.martynas.intern/" + R.raw.girly_magazines)),
        Eighteen("asdasd", Uri.parse("android.resource://com.example.martynas.intern/" + R.raw.going));

        public String text;
        public Uri link;
        private AudioFile(String text, Uri link){
            this.text = text;
            this.link = link;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final GridView gridview = (GridView) findViewById(R.id.gridview);
        final ButtonAdapter adapter = new ButtonAdapter(this);
        gridview.setAdapter(adapter);

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
            adapter.getSelectedItem(position).play();
                //adapter.musicButtonLists.get(position).play();
            Log.e("adapteris", position + adapter.getSelectedItem(position).audioFileUri.toString());
                Toast.makeText(MainActivity.this, MainActivity.AudioFile.values()[position].link.toString() , Toast.LENGTH_SHORT).show();

            }
        });
    }


}

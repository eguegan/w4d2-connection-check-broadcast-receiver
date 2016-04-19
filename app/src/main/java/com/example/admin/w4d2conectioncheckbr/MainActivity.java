package com.example.admin.w4d2conectioncheckbr;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "TAG_";
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageView = (ImageView) findViewById(R.id.connect_img);
        checkNet();
    }

    public void checkNet(){
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();

        if (activeNetwork != null) {
            if (activeNetwork.getType() == ConnectivityManager.TYPE_WIFI) {
//                Picasso.with(this).load("http://i.imgur.com/DvpvklR.png").into(mImageView);
                Log.d(TAG, "checkInternet: " + "Connected to WIFI");
            } else if (activeNetwork.getType() == ConnectivityManager.TYPE_MOBILE) {
//                Picasso.with(this).load("http://i.imgur.com/DvpvklR.png").into(mImageView);
                Log.d(TAG, "checkInternet: " + "Connected to Mobile data");
            }
        } else {
//            Picasso.with(this).load("http://i.imgur.com/DvpvklR.png").into(mImageView);
            Log.d(TAG, "checkInternet: " + "Not connected");
        }
    }
}

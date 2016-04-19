package com.example.admin.w4d2conectioncheckbr;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by admin on 4/19/2016.
 */
public class NetworkCheck extends BroadcastReceiver {
    private static final String TAG = "TAG_";
    private ImageView mImageView;

    public NetworkCheck() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "onReceive: " + intent.getAction());

    }
}

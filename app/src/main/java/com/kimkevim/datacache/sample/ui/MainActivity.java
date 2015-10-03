package com.kimkevim.datacache.sample.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import com.kimkevim.datacache.KimchiDataCache;
import com.kimkevim.datacache.R;
import com.kimkevim.datacache.sample.model.User;
import com.kimkevim.datacache.sample.util.NaviUtil;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG, "onCreate");

        setContentView(R.layout.activity_main);

        User userItem = new User(1, "KimKevin");

        /**
         * Put your Obejct to DataCache
         */
        KimchiDataCache.getInstance().put(userItem);

        NaviUtil.initFragment(this, new MainFragment());
    }
}

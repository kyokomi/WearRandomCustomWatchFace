package com.ptrprograms.wearcustomwatchface;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextClock;

import java.util.Random;

public class WatchFaceActivity extends Activity {

    public static final String SHARED_PREFERENCE = "shared_preference";

    private ImageView mBackground;
    private TextClock mClock;
    private LinearLayout mContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watch_face);

        mBackground = (ImageView) findViewById( R.id.watch_background );
        mContainer = (LinearLayout) findViewById( R.id.watch_container );
        mClock = (TextClock) findViewById( R.id.watch_time );
    }

    @Override
    protected void onPause() {
        super.onPause();
        mBackground.setImageDrawable( null );
        mClock.setTextColor( getResources().getColor( android.R.color.white ) );
        mContainer.setBackgroundColor( getResources().getColor( android.R.color.black ) );
    }

    @Override
    protected void onResume() {
        super.onResume();
        loadSchoolWatchFace();
    }

    private void loadSchoolWatchFace() {
        int randInt = new Random().nextInt(10);
        switch (randInt) {
            case 1:
                mBackground.setImageResource(R.drawable.icon1);
                break;
            case 2:
                mBackground.setImageResource(R.drawable.icon2);
                break;
            case 3:
                mBackground.setImageResource(R.drawable.icon3);
                break;
            case 4:
                mBackground.setImageResource(R.drawable.icon4);
                break;
            case 5:
                mBackground.setImageResource(R.drawable.icon5);
                break;
            case 6:
                mBackground.setImageResource(R.drawable.icon6);
                break;
            case 7:
                mBackground.setImageResource(R.drawable.icon7);
                break;
            case 8:
                mBackground.setImageResource(R.drawable.icon8);
                break;
            case 9:
                mBackground.setImageResource(R.drawable.icon9);
                break;
            case 10:
                mBackground.setImageResource(R.drawable.icon10);
                break;
            default:
               break;
        }
        mClock.setTextColor(getResources().getColor(android.R.color.white));
        mContainer.setBackgroundColor(getResources().getColor(android.R.color.black));
    }

}

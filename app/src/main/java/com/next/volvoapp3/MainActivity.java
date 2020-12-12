package com.next.volvoapp3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements HeadlinesFragment.OnHeadlineClickListener {
public static String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"activity oncreate");
       // addHeadlineFrag();


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"activity onstart");
    }

    private void addHeadlineFrag() {
        /*HeadlinesFragment fragment = HeadlinesFragment.newInstance();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction =
                fragmentManager.beginTransaction();
        fragmentTransaction
                .add(R.id.fragment_container, fragment)
                .addToBackStack(null)
                .commit();*/
    }

    @Override// sunil is implementing the tubelight
    public void onHeadlineClick(String headline) {
        NewsArticleFragment newsArticleFragment = (NewsArticleFragment) getSupportFragmentManager().findFragmentById(R.id.newarticlefrag);
        newsArticleFragment.updateTextView(headline);
    }
}
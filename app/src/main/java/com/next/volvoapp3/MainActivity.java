package com.next.volvoapp3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements HeadlinesFragment.OnHeadlineClickListener {//3a
public static String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HeadlinesFragment headlinesFragment = (HeadlinesFragment) getSupportFragmentManager().findFragmentById(R.id.headlinesfrag);
        if (headlinesFragment != null) {//it means the app is on tablet
        }
        else{ //app is on a phone
            HeadlinesFragment headlinesFragment1 = HeadlinesFragment.newInstance();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction =
                    fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.fragment_container,headlinesFragment1).commit();
        }


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
    public void onHeadlineClick(String headline) {//3b
        NewsArticleFragment newsArticleFragment = (NewsArticleFragment) getSupportFragmentManager().findFragmentById(R.id.newarticlefrag);//5
        if (newsArticleFragment != null) {//it means the app is on tablet
            newsArticleFragment.updateTextView(headline);//5a
        }


        else{ //if its null it means my app is running on a phone
            NewsArticleFragment fragment = NewsArticleFragment.newInstance();//creating frag dynamically
            Bundle arguments = new Bundle();
            arguments.putString("hl",headline);
            fragment.setArguments(arguments);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction =
                fragmentManager.beginTransaction();
        fragmentTransaction
                .replace(R.id.fragment_container, fragment)
                .addToBackStack(null)
                .commit();
        }

        }
}
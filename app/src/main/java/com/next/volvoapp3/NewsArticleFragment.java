package com.next.volvoapp3;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class NewsArticleFragment extends Fragment {

TextView newsTextView;

    public static String TAG = NewsArticleFragment.class.getSimpleName();
    public static NewsArticleFragment newInstance() {
        return new NewsArticleFragment();
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.i(TAG,"onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG,"oncreate");

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        Log.i(TAG,"oncreateview");

        View fragmentView = inflater.inflate(R.layout.fragment_newsarticle,container,false);
        newsTextView = fragmentView.findViewById(R.id.textViewnewsArticle);//7
        if (getArguments().containsKey("hl")) {
            newsTextView.setText(getArguments().getString("hl"));
        }
            return fragmentView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i(TAG,"onactivitycreated");

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i(TAG,"ondestroyview");


    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"ondestroy");

    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i(TAG,"ondetach");

    }

    public void updateTextView(String headline) {//6
        newsTextView.setText(headline);//8
    }
}

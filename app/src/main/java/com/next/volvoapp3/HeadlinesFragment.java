package com.next.volvoapp3;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HeadlinesFragment extends Fragment {
    public static String TAG = HeadlinesFragment.class.getSimpleName();
    public static HeadlinesFragment newInstance() {
        return new HeadlinesFragment();
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

        View fragmentView = inflater.inflate(R.layout.fragment_headlines,container,false);
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
}

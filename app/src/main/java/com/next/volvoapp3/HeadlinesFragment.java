package com.next.volvoapp3;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HeadlinesFragment extends Fragment implements AdapterView.OnItemClickListener {
    ListView headlinesListView;
    public static String TAG = HeadlinesFragment.class.getSimpleName();
    public static HeadlinesFragment newInstance() {
        return new HeadlinesFragment();
    }

    OnHeadlineClickListener onHeadlineClickListener;//2. declaration

    public  interface  OnHeadlineClickListener{    //1.switchboard
        public void onHeadlineClick(String headline);  //1a. switches
    }


    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.i(TAG,"onAttach");
        onHeadlineClickListener = (MainActivity)getActivity();  //3. wiring behind switchboard to mainacticity--punith

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
        headlinesListView = fragmentView.findViewById(R.id.headlines_listview);
        headlinesListView.setOnItemClickListener(this);
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

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getActivity(), parent.getAdapter().getItem(position).toString(), Toast.LENGTH_SHORT).show();
        onHeadlineClickListener.onHeadlineClick(parent.getAdapter().getItem(position).toString());//4. rachita who's playing with the switch --on
    }
}

package com.example.amit.demo.fragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.amit.demo.R;

import java.util.zip.Inflater;

/**
 * Created by amit on 25/11/16.
 */

public class FragmentOne extends Fragment {

    public static FragmentOne fragmentOne = null;

    public static FragmentOne getInstance(){
        if(fragmentOne==null){
            fragmentOne = new FragmentOne();
        }
        return fragmentOne;
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e("onAttach","1-fragment");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("onCreate","2-fragment");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.e("onCreateView","3-fragment");

//        return super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.fragment_fragment_one, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e("onActivityCreated","4-fragment");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e("onStart","5-fragment");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("onResume","6-fragment");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("onPause","7-fragment");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("onStop","8-fragment");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("onDestroyView","9-fragment");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy","10-fragment");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("onDetach","11-fragment");
    }
}

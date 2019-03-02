package com.sinister.alaa.fragmentdemo.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.sinister.alaa.fragmentdemo.Activitities.MainActivity;
import com.sinister.alaa.fragmentdemo.Activitities.SecondActivity;
import com.sinister.alaa.fragmentdemo.R;

public class Fragment3 extends Fragment {
    private Button btnNavFrag1;
    private Button btnNavFrag2;
    private Button btnNavFrag3;
    private Button btnNavSecondActivity;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment3_layout,container, false);
        btnNavFrag1 = view.findViewById(R.id.btnNavFrag1);
        btnNavFrag2 = view.findViewById(R.id.btnNavFrag2);
        btnNavFrag3 = view.findViewById(R.id.btnNavFrag3);
        btnNavSecondActivity = view.findViewById(R.id.btnNavSecondActivity);

        btnNavFrag1.setOnClickListener(new View.OnClickListener() {
            /*
            To reference the context in a fragment you cannot use MainActivity.this you have to use getActivity()
            The fragment context is main activity because the fragment is running off of MainActivity.
            */
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Going to Fragment1.", Toast.LENGTH_SHORT).show();
                //This will give us access to any of the methods in the MainActivity
                ((MainActivity)getActivity()).setViewPager(0);
            }
        });
        btnNavFrag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Going to Fragment2.", Toast.LENGTH_SHORT).show();
                ((MainActivity)getActivity()).setViewPager(1);
            }
        });
        btnNavFrag3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Going to Fragment3.", Toast.LENGTH_SHORT).show();
                ((MainActivity)getActivity()).setViewPager(2);
            }
        });
        btnNavSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Going to second activity.", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), SecondActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }
}

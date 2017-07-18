package com.example.vengeance.hotdog;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


import com.example.vengeance.hotdog.R;
import com.google.firebase.auth.FirebaseAuth;

public class OneFragment extends Fragment {

    //firebase auth object
    private FirebaseAuth firebaseAuth;
    //view objects
    private TextView textViewUserEmail;
    private Button buttonLogout;


    public OneFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_one, container, false);

    }
}
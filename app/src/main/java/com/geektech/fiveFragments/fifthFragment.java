package com.geektech.fiveFragments;

import static com.geektech.fiveFragments.OneFragment.USERNAME_KEY;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.textfield.TextInputEditText;

public class fifthFragment extends Fragment {
    private TextInputEditText et_username;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fifth, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        et_username = view.findViewById(R.id.et_username);
        Bundle bundle = getArguments();
        if (bundle != null) {
            String username = bundle.getString(USERNAME_KEY);
            et_username.setText(username);
        }
    }
}
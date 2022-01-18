package com.geektech.fiveFragments;

import static com.geektech.fiveFragments.OneFragment.USERNAME_KEY;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;


public class fourthFragment extends Fragment {
    private TextInputEditText et_username;
    private Button btn_go;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fourth, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        et_username = view.findViewById(R.id.et_username);
        btn_go = view.findViewById(R.id.btn_black_GO);
        Bundle bundle = getArguments();
        if (bundle != null) {
            String username = bundle.getString(USERNAME_KEY);
            et_username.setText(username);
        }
        btn_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                Fragment fragment = new fifthFragment();
                if (et_username.getText() != null) {
                    bundle.putString(USERNAME_KEY, et_username.getText().toString());
                }
                fragment.setArguments(bundle);
                requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
            }
        });

    }

}
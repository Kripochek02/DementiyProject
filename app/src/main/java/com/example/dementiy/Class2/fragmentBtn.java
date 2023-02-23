package com.example.dementiy.Class2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.dementiy.R;

public class fragmentBtn extends Fragment {
    Button btn1, btn2;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View mylayout = inflater.inflate(R.layout.fragmentbtn, container, false);
        btn1 = mylayout.findViewById(R.id.btn1);
        btn2 = mylayout.findViewById(R.id.btn2);
        return mylayout;
    }
}

package com.Kratos.gossipapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.Kratos.gossipapplication.databinding.ActivitySignInBinding;
import com.Kratos.gossipapplication.databinding.ActivityStatusBinding;

public class StatusActivity extends AppCompatActivity {

    ActivityStatusBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityStatusBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}
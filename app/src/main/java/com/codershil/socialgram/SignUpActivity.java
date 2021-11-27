package com.codershil.socialgram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.codershil.socialgram.databinding.ActivitySignUpBinding;

public class SignUpActivity extends AppCompatActivity {
    ActivitySignUpBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.txtLogin.setOnClickListener(v -> startActivity(new Intent(SignUpActivity.this,LoginActivity.class)));

        binding.btnSignUp.setOnClickListener(v -> startActivity(new Intent(SignUpActivity.this,MainActivity.class)));
    }
}
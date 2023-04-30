package com.dfg.easylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.dfg.easyutil.EasyToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EasyToast.show(this, "EasyLibrary");

    }
}
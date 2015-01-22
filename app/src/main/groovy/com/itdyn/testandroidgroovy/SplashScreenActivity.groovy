package com.itdyn.testandroidgroovy

import android.os.Bundle
import android.support.v7.app.ActionBarActivity
import android.util.Log
import groovy.transform.CompileStatic

@CompileStatic
public class SplashScreenActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        def test=new Test();
        test.speakerId=5
        Log.d("test",test.toString());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy()

    }

}
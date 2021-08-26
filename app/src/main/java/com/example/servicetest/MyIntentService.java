package com.example.servicetest;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import androidx.annotation.Nullable;

import java.io.File;

public class MyIntentService extends IntentService{
    /**
     * @deprecated
     */
    public MyIntentService(){
        super("name");

    }



    @Override
    protected void onHandleIntent(@Nullable Intent intent) {

        Log.d("MyIntentService", "Thread id is: " + Thread.currentThread().getName());

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("MyIntentService", "onDestroy executed");
    }
}

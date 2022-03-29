package com.example.exerccio;

import android.app.IntentService;
import android.content.Intent;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.RequiresApi;

public class MyIntentService extends IntentService {

    public MyIntentService() { super("MyIntentService"); }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onHandleIntent(Intent intent) {
        if (intent != null) {
            String name = intent.getStringExtra("TELA");
            Toast.makeText(this, "nome da" + name, Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d("DTU", "Service onDestroy");
    }
}
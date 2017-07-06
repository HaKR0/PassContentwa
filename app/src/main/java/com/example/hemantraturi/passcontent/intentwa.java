package com.example.hemantraturi.passcontent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class intentwa extends AppCompatActivity {
    public final static String MESSAGE_KEY="com.example.hemantraturi.passcontent.message_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_intentwa);
        Intent intent=getIntent();
        String msg=intent.getStringExtra(MESSAGE_KEY);
        TextView tv=new TextView(this);
        tv.setText(msg);
        tv.setTextSize(45);
        setContentView(tv);

    }
}

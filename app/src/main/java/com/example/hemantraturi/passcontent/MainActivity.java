package com.example.hemantraturi.passcontent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class  MainActivity extends AppCompatActivity {
    public final static String MESSAGE_KEY="com.example.hemantraturi.passcontent.message_key";
    EditText t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void send(View view)
    {
        t=(EditText)findViewById(R.id.et);
        String s=t.getText().toString();
        Intent intent=new Intent(this,intentwa.class);
        intent.putExtra(MESSAGE_KEY,s);
        startActivity(intent);
    }
}

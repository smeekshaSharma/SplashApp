package com.example.splashapp;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import org.w3c.dom.Text;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
       Thread thread=new Thread(){
           public void run(){
               try {
                   sleep(4000);
               }catch (Exception e){
                   e.printStackTrace();
               }
               finally {
                   Intent intent=new Intent(splash.this,MainActivity.class);
                   startActivity(intent);
               }
           }
       };thread.start();
    }
}
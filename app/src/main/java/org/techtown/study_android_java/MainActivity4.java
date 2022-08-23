package org.techtown.study_android_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        listener.onEvent();
    }

    MyEventListener listener = new MyEventListener() {
        @Override
        public void onEvent() {
            Toast.makeText(MainActivity4.this,"onEvent",Toast.LENGTH_SHORT).show();
        }
    };
}
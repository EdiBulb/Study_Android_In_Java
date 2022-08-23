package org.techtown.study_android_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Test1Activity extends AppCompatActivity {

    /*뷰 선언*/
    TextView test1;
    TextView test2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);

        /*id 매핑*/
        test1 = (TextView) findViewById(R.id.test1);
        test2 = (TextView) findViewById(R.id.test2);

        test1.setText("연습용1");


        test2.setText("연습용2");


    }
}
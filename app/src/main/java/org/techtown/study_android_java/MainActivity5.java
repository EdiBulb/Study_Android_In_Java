package org.techtown.study_android_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {

    Button btn = findViewById(R.id.btn2);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = findViewById(R.id.txtName);
                textView.setText("클립되었습니다22");
            }
        });
    }

    public void button_OnClick(View view){
        TextView textView = findViewById(R.id.txtName);
        textView.setText("클릭되었습니다.");
    }
}
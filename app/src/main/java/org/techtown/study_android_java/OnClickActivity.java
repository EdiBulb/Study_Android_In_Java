package org.techtown.study_android_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class OnClickActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_click);

        Button button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"버튼을 눌렀습니다.",Toast.LENGTH_LONG).show();
            }
        });


    }

    /*첫번째 방법은 뷰 속성으로 onclick값을 줘서 만드는 건데, 훨씬 간단하다.*/
    public void ClickButton1(View view){
        Toast.makeText(getApplicationContext(),"버튼을 눌렀습니다.",Toast.LENGTH_LONG).show();
    }
}
package org.techtown.study_android_java;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    LinearLayout listview;// 레이아웃 객체 생성
    Button createTextView; //버튼 객체 생성

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //리니어 레이아웃 객체 listView에 id가 listview인 리니어레이아웃을 연결해준다.
        listview = findViewById(R.id.listview);

        //버튼 객체 createTextViewdp id가 createTextView인 버튼을 연결해준다.
        createTextView = findViewById(R.id.createTextView);
        createTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createTextView();
            }
        });
    }
    //createTextView() 메소드 작성
    private void createTextView(){
        //1. 텍스트뷰 객체 생성
        TextView textViewNm = new TextView(getApplicationContext());

        //2. 텍스트 뷰에 들어갈 문자 설정
        textViewNm.setText("텍스트 생성");

        //3. 텍스트뷰 글자 크기 설정
        textViewNm.setTextSize(12);

        //4. 텍스트뷰 글자 타입 설정
        textViewNm.setTypeface(null, Typeface.BOLD);

        //5. 텍스트뷰 ID설정
        textViewNm.setId(0);

        //6. 레이아웃 설정
        LinearLayout.LayoutParams param = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);
        param.leftMargin = 30;

        //7. 설정한 레이아웃 텍스트뷰에 적용한다.
        textViewNm.setLayoutParams(param);

        //8. 텍스트뷰 백그라운드 색상 설정
        textViewNm.setBackgroundColor(Color.rgb(184,236,184));

        //9. 생성 및 설정된 텍스트뷰 레이아웃에 적용
        listview.addView(textViewNm);
    }
}
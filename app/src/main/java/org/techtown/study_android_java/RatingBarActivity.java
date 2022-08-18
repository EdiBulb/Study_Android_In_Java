package org.techtown.study_android_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;


public class RatingBarActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //toolbar
        Toolbar toolbar = findViewById(R.id.toolbar_main3);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(" ");




        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar);

        /*레이팅 바와 텍스트 뷰 가져오기*/
        final TextView textView = (TextView) findViewById(R.id.textView);
        RatingBar ratingBar = (RatingBar) findViewById(R.id.ratingBar);

        /*로직 짜기*/
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener(){

            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                textView.setText("Rating" + rating);
            }
        });
    }
    //toolbar
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case android.R.id.home:{
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intent);
                finish();
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }


}
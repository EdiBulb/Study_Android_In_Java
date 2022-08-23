package org.techtown.study_android_java;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TimePicker;

public class TimePickerDialogActivity extends AppCompatActivity {

    Button alarmButton;
    int alarmHour =0;
    int alarmMinute =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker_dialog);

        /*id 매핑*/

        alarmButton = (Button) findViewById(R.id.alarmButton);

        /*이벤트 처리*/
        alarmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*타임피커를 만든다.*/
                TimePickerDialog timePickerDialog = new TimePickerDialog(
                        TimePickerDialogActivity.this,android.R.style.Theme_Holo_Light_Dialog,new TimePickerDialog.OnTimeSetListener(){

                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

                    }
                },alarmHour,alarmMinute,false);
                timePickerDialog.show();




                alarmButton.setText(alarmHour +"시" + alarmMinute +"분");
            }
        });
    }
}
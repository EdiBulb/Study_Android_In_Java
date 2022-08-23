package org.techtown.study_android_java;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DialogActivity extends AppCompatActivity {

    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);

        btn1 = (Button) findViewById(R.id.btn);

        btn1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                final EditText editText = new EditText(DialogActivity.this);

                AlertDialog.Builder dig = new AlertDialog.Builder(DialogActivity.this);
                dig.setTitle("제목");
                dig.setView(editText);
                dig.setIcon(R.drawable.ic_launcher_background);
                dig.setPositiveButton("입력", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), editText.getText().toString(),Toast.LENGTH_LONG).show();
                    }
                });
                dig.show();
            }
        });
    }
}
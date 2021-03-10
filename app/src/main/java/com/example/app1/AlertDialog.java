package com.example.app1;


import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AlertDialog extends AppCompatActivity {
    private TextView button1text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog);
        button1text=(TextView)findViewById(R.id.button1text);
    }
    public void show(View v) {
        android.app.AlertDialog.Builder builder=new android.app.AlertDialog.Builder(AlertDialog.this);

        builder.setTitle("Title").
                setMessage("Message").
                setPositiveButton("Yes",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(),"Yes is pressed", Toast.LENGTH_LONG).show();
                    }
                }).
                setNegativeButton("No",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "No is pressed", Toast.LENGTH_LONG).show();
                    }
                }).
                setNeutralButton("May be",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "May be is pressed", Toast.LENGTH_LONG).show();
                    }
                });
        android.app.AlertDialog alert=builder.create();
        alert.show();
    }
}
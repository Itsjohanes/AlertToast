package com.example.message;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button alert;
    Button toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alert = findViewById(R.id.alert);
        alert.setOnClickListener(this);
        toast = findViewById(R.id.toast);
        toast.setOnClickListener(this);

    }
    public void onClick(View view){
        if(view == alert){
            new AlertDialog.Builder(this)
                    .setTitle("Message Title")
                    .setMessage("Ini adalah Alert")
                    .setNeutralButton("Close", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    })
                    .show();

        }else{
            Toast.makeText(this,"Ini toast ya",Toast.LENGTH_SHORT)
                    .show();
        }

    }
}
package com.example.android.putri_1202154293_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_screen);
    }

    public void onClick (View view){
        if (((RadioButton)findViewById(R.id.radioMakanDiTempat)).isChecked()){
            Intent intent = new Intent(this, DineInScreen.class);
            startActivity(intent);
        }else if (((RadioButton)findViewById(R.id.radioBungkus)).isChecked()){
            Intent intent = new Intent(this, TakeAwayScreen.class);
            startActivity(intent);
        }else{
            Toast.makeText(this,"Pilih dahulu",Toast.LENGTH_SHORT).show();
        }
    }
}

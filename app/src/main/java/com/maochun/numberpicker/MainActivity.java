package com.maochun.numberpicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    NumberPickerDialog dialog = new NumberPickerDialog();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickButton(View v){

        dialog.show(this);
    }

    public void onCancelButtonClick(View v){
        dialog.dismiss();
    }

    public void onOKButtonClick(View v){
        dialog.dismiss();
    }
}

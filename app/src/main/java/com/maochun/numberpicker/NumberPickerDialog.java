package com.maochun.numberpicker;

import android.content.Context;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;

import androidx.appcompat.app.AlertDialog;


/**
 * Created by maochuns.sun@gmail.com on 2020/7/9
 */
public class NumberPickerDialog {

    private AlertDialog mAlertDialog;
    private View mLoadView;

    public int mMax = 100;
    public int mMin = 0;
    public int mCurrent = 5;

    public void show(Context context) {
        mAlertDialog = new AlertDialog.Builder(context).create();
        mLoadView = LayoutInflater.from(context).inflate(R.layout.dialog_number_picker, null);
        mAlertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mAlertDialog.setView(mLoadView, 0, 0, 0, 0);
        mAlertDialog.setCanceledOnTouchOutside(true);

        Button btnCancel = mLoadView.findViewById(R.id.button_common_alert_cancel);
        Button btnOk = mLoadView.findViewById(R.id.button_common_alert_ok);

        NumberPicker numPicket = mLoadView.findViewById(R.id.numberPicker);
        numPicket.setMaxValue(mMax);
        numPicket.setMinValue(mMin);
        numPicket.setValue(mCurrent);



        numPicket.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                mCurrent = newVal;
            }
        });

        try {
            mAlertDialog.show();
        }catch (Exception e){
            e.printStackTrace();

        }
    }

    public void dismiss(){
        if (mAlertDialog != null) {
            mAlertDialog.dismiss();
        }
    }

}

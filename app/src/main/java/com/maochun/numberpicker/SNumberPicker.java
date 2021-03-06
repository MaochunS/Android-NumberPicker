package com.maochun.numberpicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.NumberPicker;

import androidx.core.content.ContextCompat;

/**
 * Created by maochuns.sun@gmail.com on 2020/7/9
 */
public class SNumberPicker extends NumberPicker {

    public SNumberPicker(Context context) {
        super(context);
    }

    public SNumberPicker(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SNumberPicker(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void addView(View child) {
        super.addView(child);
        setNumberPickerView(child);
    }

    @Override
    public void addView(View child, int index) {
        super.addView(child, index);
        setNumberPickerView(child);
    }

    @Override
    public void addView(View child, int width, int height) {
        super.addView(child, width, height);
        setNumberPickerView(child);
    }

    @Override
    public void addView(View child, ViewGroup.LayoutParams params) {
        super.addView(child, params);
        setNumberPickerView(child);
    }

    @Override
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        super.addView(child, index, params);
        setNumberPickerView(child);
    }

    public void setNumberPickerView(View view) {
        if (view instanceof EditText) {
            ((EditText) view).setTextColor(ContextCompat.getColor(getContext(), R.color.colorPrimary));
            ((EditText) view).setTextSize(20f);
        }
    }


}

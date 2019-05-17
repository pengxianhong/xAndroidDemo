package com.example.mutidemo.ui;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.mutidemo.R;
import com.jzxiang.pickerview.TimePickerDialog;
import com.jzxiang.pickerview.data.Type;
import com.jzxiang.pickerview.listener.OnDateSetListener;
import com.pengxh.app.multilib.base.BaseNormalActivity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import butterknife.BindView;


/**
 * Created by Administrator on 2018/1/7.
 * https://github.com/JZXiang/TimePickerDialog
 */

public class DatePikerDialogActivity extends BaseNormalActivity {

    @BindView(R.id.mBtnDatePicker)
    Button mBtnDatePicker;
    @BindView(R.id.mEtShow)
    EditText mEtShow;

    @Override
    public void initView() {
        setContentView(R.layout.activity_datepicker);
    }

    @Override
    public void init() {

    }

    @Override
    public void initEvent() {
        mBtnDatePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog.Builder builder = new TimePickerDialog.Builder();
                builder.setThemeColor(getRandomColor())
                        .setType(Type.YEAR_MONTH_DAY)
                        .setCallBack(new OnDateSetListener() {
                            @Override
                            public void onDateSet(TimePickerDialog timePickerView, long millseconds) {
                                String text = getDateToString(millseconds);
                                mEtShow.setText(text);
                            }
                        })
                        .build().show(getSupportFragmentManager(), "year_month_day");
            }
        });
    }

    public String getDateToString(long time) {
        @SuppressLint("SimpleDateFormat") SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = new Date(time);
        return sf.format(d);
    }

    private int getRandomColor() {
        Random random = new Random();
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);
        return Color.rgb(red, green, blue);
    }
}
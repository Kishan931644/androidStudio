package com.example.budgettracker;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class myLIstViewModel extends ArrayAdapter<String> {
    public String money, expenseDate, desc;
    public Context context;

    public myLIstViewModel(@NonNull Context context, String money, String description, String expenseDate) {
        super(context, R.layout.mylayout);

        this.money = money;
        this.desc = description;
        this.expenseDate = expenseDate;
        this.context =  context;
    }

    @Nullable
    @Override
    public String getItem(int position) {
        return super.getItem(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.mylayout, parent, false);

        TextView money, expenseDate, desc;
        money = convertView.findViewById(R.id.money);
        expenseDate = convertView.findViewById(R.id.expensedate);
        desc = convertView.findViewById(R.id.desc);

        money.setText(this.money);
        expenseDate.setText(this.expenseDate);
        desc.setText(this.desc);

        return convertView;
    }
}

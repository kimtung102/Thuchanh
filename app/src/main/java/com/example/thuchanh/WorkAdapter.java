package com.example.thuchanh;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.List;

public class WorkAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Work> workList;

    public WorkAdapter(Context context, int layout, List<Work> workList) {
        this.context = context;
        this.layout = layout;
        this.workList = workList;
    }


    @Override
    public int getCount() {
        return workList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout,null);

        CheckBox checkBox = view.findViewById(R.id.work_checkBox);
        TextView txtName = view.findViewById(R.id.work_name);
        TextView txtPhone = view.findViewById(R.id.work_time);

        Work work = workList.get(i);

        checkBox.setChecked(work.isChecked());
        txtName.setText(work.getWorkName());
        txtPhone.setText(work.getWorkTime());

        return view;
    }
}

package com.example.thuchanh;

public class Work {
    private boolean checked;
    private String workName;
    private String workTime;

    public Work(String workName, String workTime) {
        this.workName = workName;
        this.workTime = workTime;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }
}

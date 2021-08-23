package com.js.jsfunction.decimal;

public class DurationTime {

    private static final int MAX_TABLE_VALUE = 20;
    private String[] name;

    public DurationTime(String[] name) {
        this.name = name;
    }

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }
}

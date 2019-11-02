package com.rajkumarrajan.rxjavawithretrofit.model;

public class Note extends BaseResponse{
    private int id;
    private String note;
    private String timestamp;

    public int getId() {
        return id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getTimestamp() {
        return timestamp;
    }
}

package com.example.doomchit_doomchit;

public class RecordList {
    private String time;    //시간
    private String title;   //제목
    private String name;    //작곡가

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RecordList(String time, String title, String name) {
        this.time = time;
        this.title = title;
        this.name = name;
    }
}

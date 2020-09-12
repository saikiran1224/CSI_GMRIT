package com.gmrit.csigmrit.modals;

public class NewsData {
    private int newsImage;
    private String newsName, date, month, year;

    public NewsData(int newsImage, String newsName, String date, String month, String year) {
        this.newsImage = newsImage;
        this.newsName = newsName;
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public int getNewsImage() {
        return newsImage;
    }

    public void setNewsImage(int newsImage) {
        this.newsImage = newsImage;
    }

    public String getNewsName() {
        return newsName;
    }

    public void setNewsName(String newsName) {
        this.newsName = newsName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}

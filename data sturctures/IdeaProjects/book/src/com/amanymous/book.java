package com.amanymous;

public class book {
    private String title;
    private int pages;
    public book(String title, int pages) {
        super();
        this.title = title;
        this.pages = pages;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
}
 class Textbook extends book {
 private String gradeLevel;
 private String courseName;
 public Textbook(String title, int pages, String gradeLevel,
                 String courseName) {
        super(title, pages);
        this.gradeLevel = gradeLevel;
        this.courseName = courseName;
    }
    public String getGradeLevel() {
        return gradeLevel;
    }
    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;}
}

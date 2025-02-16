package com.example.GetPostForm.model;


public class Student {
    private int rno;
    private String name;
    private String technology;

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technoloogy) {
        this.technology = technoloogy;
    }

    public Student(int rno,String name,String technology) {
        this.rno = rno;
        this.name = name;
        this.technology = technology;
    }
}

package com.example.demo.Student.bean;

public class Student {

    private Integer stuId;
    private String strName;
    private String stuSex;
    private String stuExpression;
    private String stuDesc;

    public Student() {
    }

    public Student(Integer stuId, String strName, String stuSex, String stuExpression, String stuDesc) {
        this.stuId = stuId;
        this.strName = strName;
        this.stuSex = stuSex;
        this.stuExpression = stuExpression;
        this.stuDesc = stuDesc;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStrName() {
        return strName;
    }

    public void setStrName(String strName) {
        this.strName = strName;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    public String getStuExpression() {
        return stuExpression;
    }

    public void setStuExpression(String stuExpression) {
        this.stuExpression = stuExpression;
    }

    public String getStuDesc() {
        return stuDesc;
    }

    public void setStuDesc(String stuDesc) {
        this.stuDesc = stuDesc;
    }
}

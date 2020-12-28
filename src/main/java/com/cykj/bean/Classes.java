package com.cykj.bean;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Classes {

    private int classId;
    private String classname;
    private List<student> studentList;

    public Classes() {

    }

    public Classes(int classId, String classname, List<student> studentList) {
        this.classId = classId;
        this.classname = classname;
        this.studentList = studentList;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public List<student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<student> studentList) {
        this.studentList = studentList;
    }
}

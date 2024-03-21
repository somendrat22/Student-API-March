package com.student.api.Student.API.models;

public class Student {
    String id;
    String name;
    int rollNumber;

    public Student() {
    }

    public Student(String id, String name, int rollNumber) {
        this.id = id;
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                '}';
    }
}

package com.company.task2;

public class university {

    private int foundationYear;
    private String name;
    private student[] students;

    public university(int foundationYear, String name, student[] students) {
        this.foundationYear = foundationYear;
        this.name = name;
        this.students = students;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(int foundationYear) {
        this.foundationYear = foundationYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public student[] getStudents() {
        return students;
    }

    public void setStudents(student[] students) {
        this.students = students;
    }
}


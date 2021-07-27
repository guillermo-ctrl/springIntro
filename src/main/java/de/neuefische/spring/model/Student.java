package de.neuefische.spring.model;

import java.util.Objects;

public class Student {

    private String name;
    private String matNum;

    public Student(String name, String matNum) {
        this.name = name;
        this.matNum = matNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMatNum() {
        return matNum;
    }

    public void setMatNum(String matNum) {
        this.matNum = matNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(matNum, student.matNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, matNum);
    }
}

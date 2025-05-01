package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Table(name="Student-Table")
public class Student {

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    @Id
    @Column(name = "Roll no")
    private int rollNo;
    private String name;
    private int age;


}

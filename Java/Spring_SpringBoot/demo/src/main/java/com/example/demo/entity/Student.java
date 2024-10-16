package com.example.demo.entity;

public class Student {
    private String id;
    private String name;
    private String city;

    public Student(){}
    public Student(String id, String name, String city)
    {
        this.name=name;
        this.id=id;
        this.city=city;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

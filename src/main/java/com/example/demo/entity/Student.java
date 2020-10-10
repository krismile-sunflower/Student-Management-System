package com.example.demo.entity;

public class Student {
    private String id;
    private String name;
    private String sex;
    private String college;
    private String profession;
    private Integer grade;
    private Integer classes;
    private Integer age;
    private String hobby;

    public Student() {
    }

    public Student(String id, String name, String sex, String college, String profession, Integer grade, Integer classes, Integer age, String hobby) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.college = college;
        this.profession = profession;
        this.grade = grade;
        this.classes = classes;
        this.age = age;
        this.hobby = hobby;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getClasses() {
        return classes;
    }

    public void setClasses(Integer classes) {
        this.classes = classes;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", college='" + college + '\'' +
                ", profession='" + profession + '\'' +
                ", grade=" + grade +
                ", classes=" + classes +
                ", age=" + age +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}


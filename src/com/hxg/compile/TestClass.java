package com.hxg.compile;

import java.util.Objects;

public class TestClass {
    private String name;
    private Integer age;
    private String sex;

    public TestClass() {
    }

    public TestClass(String name, Integer age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public static void main(String[] args) {
        TestClass testClass = new TestClass("ZhangSan", 20, "F");
        System.out.println(testClass.toString());
        System.out.println(testClass.hashCode());
        System.out.printf("Hello world!!!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestClass testClass = (TestClass) o;
        return Objects.equals(name, testClass.name) && Objects.equals(age, testClass.age) && Objects.equals(sex, testClass.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex);
    }

    @Override
    public String toString() {
        return "TestClass{" + "name='" + name + '\'' + ", age=" + age + ", sex='" + sex + '\'' + '}';
    }
}

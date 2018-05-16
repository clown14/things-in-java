package com.how2java;

public class Person {
    private String name;
    private Integer age;

    public Person(String name) {
        this.name = name;
    }

    public boolean isSame(Person person) {
        if (this.name.equals(person.name)) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null) {
            return false;
        }
        if (other instanceof Person) {
            Person otherPerson = (Person) other;
            return name.equals(otherPerson.name) && this.age.equals(((Person) other).age);
        }

        return false;
    }

    public Person(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

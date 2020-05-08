package com.company;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

//    Setters
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAge(int age){
        if (age < 0 || age > 100) {
            this.age = 0;
        }
        this.age = age;
    }

//    Getters
    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getFullName(){
        if (getFirstName().isEmpty() && getLastName().isEmpty()){
            return "";
        } else if (getFirstName().isEmpty()){
            return getLastName();
        } else if (getLastName().isEmpty()){
            return getFirstName();
        } else
            return getFirstName() + " " + getLastName();
    }

    public int getAge(){
        return this.age;
    }

    public boolean isTeen(){
        return this.age >= 12 && this.age < 20;
    }



}

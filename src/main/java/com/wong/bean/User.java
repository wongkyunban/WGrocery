package com.wong.bean;

public class User {
    private String firstName;
    private String lastName;
    private String nationality;

    public User(){
    }
    public User(String firstName,String lastName,String nationality){
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public boolean isAdmin(){
        return true;
    }
}

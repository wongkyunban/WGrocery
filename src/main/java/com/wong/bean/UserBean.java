package com.wong.bean;

public class UserBean {
    private String name;
    private String job;
    private String hobby;

    public UserBean() {
    }

    public UserBean(String name, String job, String hobby) {
        this.name = name;
        this.job = job;
        this.hobby = hobby;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package com.wong.bean;

public class Comment {
    private Integer id = null;
    private String text = null;

    public Comment(){}
    public Comment(Integer id,String text){
        this.id = id;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

package com.gl.java.oop.access;

public class AccessBestPracticeDemo {
    // 一般属性用private
    private int id;
    private String name;

    //构造器用public
    public AccessBestPracticeDemo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //想给别人用就用public
    // getter and setter
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
}

package com.yeonsik.databindingsample.databindingsample.datas;

import java.util.Date;

/**
 * Created by yeonsik on 2017-03-04.
 */

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String imageUrl;
    private Date createdDate;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User(String firstName, String lastName, int age, String imageUrl) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.imageUrl = imageUrl;
        createdDate = new Date();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}

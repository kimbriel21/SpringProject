package com.ciachurch.project.model;

public class User
{
    private Integer userId;
    private String emailId;
    private String password;
    private String firstName;
    private String lastName;

    @Override
    public String toString() {
        return "User [userId=" + userId + ", emailId=" + emailId
                + ", password=" + password + ", firstName=" + firstName
                + ", lastName=" + lastName + "]";
    }
    //setters and getters
}


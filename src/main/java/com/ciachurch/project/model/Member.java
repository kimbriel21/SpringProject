package com.ciachurch.project.model;

public class Member {
    private Long id;
    private String firstName;
    private String lastName;
    private String mobtel;
    private String address;
    private String birthday;

    Member(){}

    public Member(Long id, String firstName, String lastName, String mobtel, String address, String birthday) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobtel = mobtel;
        this.address = address;
        this.birthday = birthday;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getMobtel() {
        return mobtel;
    }

    public void setMobtel(String mobtel) {
        this.mobtel = mobtel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}

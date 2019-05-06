package com.syafiq.managementsystem.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name = "System_management")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank(message = "Name is mandatory")
    private String name;

//    @Column(name = "Gender")
    private Character gender;

//    @Column(name = "Address")
    private String address;

//    @Column(name = "DOB")
    private String dob;

//    @Column(name = "Email")
    private String email;

//    @Column(name = "Phone No")
    private long phone;

//    @Column(name = "Mobile no")
    private long mobile;

    public Student() {}

    public Student (String name,Character gender,String address,String dob,String email,long phone, long mobile ){
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.dob = dob;
        this.email = email;
        this.phone = phone;
        this.mobile = mobile;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", email=" + email + ", gender =" + gender + ", address=" + address + ", DOB =" + dob + ", Phone No =" + phone +",Mobile No =" + mobile +'}';
    }

}

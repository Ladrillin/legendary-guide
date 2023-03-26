package com.example.demoing.entity;

import jakarta.persistence.*;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "age")
    private Integer age;

    @Column(name = "buyer")
    private Boolean buyer;

    public User() {

    }

    public User(String firstName, Integer age, Boolean buyer) {
        this.firstName = firstName;
        this.age = age;
        this.buyer = false;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBuyer() {
        return buyer;
    }

    public void setBuyer(Boolean buyer) {
        this.buyer = buyer;
    }
}

package com.example.SpringBoot.Hibernate.OnetoMany.Mapping.model;

import javax.persistence.*;

@Entity
@Table(name="bike")
public class Bike {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    public Bike(){

    }
    public Bike(String name) {
        this.name = name;
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
}

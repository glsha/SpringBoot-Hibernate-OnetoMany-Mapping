package com.example.SpringBoot.Hibernate.OnetoMany.Mapping.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "honda")
public class Honda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name="description")
    private String description;

    @OneToMany(cascade = CascadeType.ALL)
            @JoinColumn(name="pc_fid", referencedColumnName = "id")
    List<Bike> bike = new ArrayList<>();

    public Honda(){

    }

    public Honda(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Bike> getBike() {
        return bike;
    }

    public void setBike(List<Bike> bike) {
        this.bike = bike;
    }
}

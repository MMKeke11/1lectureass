package entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;



@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String model;


    @ManyToMany(mappedBy = "cars")
    private List<Driver> drivers = new ArrayList<>();

    // Getters and Setters


    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setDriver(Driver driver) {
        drivers.add(driver);
    }




}
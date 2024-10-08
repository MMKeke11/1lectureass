package entity;

import jakarta.persistence.*;



@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String model;


    @ManyToOne
    @JoinColumn(name = "driver_id")
    private Driver driver;

    // Getters and Setters


    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Driver getDriver() {
        return driver;
    }


}
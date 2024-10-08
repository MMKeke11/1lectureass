package dao;

import entity.Car;
import entity.Driver;

import jakarta.persistence.*;

import java.util.List;

public class Dao {
    //Write a service that persists both a Car and a Driver object into the database, ensuring the one-to-one relationship is enforced.

    private static EntityManagerFactory emff = Persistence.createEntityManagerFactory("lecass");

    public void persistCarAndDriver(List<Car> cars, List<Driver> drivers) {
        EntityManager em = emff.createEntityManager();
        em.getTransaction().begin();
        for (Car car : cars) {
            em.persist(car);
        }
        for (Driver driver : drivers) {
            em.persist(driver);
        }

        for (Driver driver : drivers) {
            for (Car car : cars) {
                driver.setCar(car);
                car.setDriver(driver);
            }
        }
        em.getTransaction().commit();
        em.close();
    }


}

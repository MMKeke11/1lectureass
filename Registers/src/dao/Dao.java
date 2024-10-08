package dao;

import entity.Car;
import entity.Driver;

import jakarta.persistence.*;

import java.util.List;

public class Dao {
    //Write a service that persists both a Car and a Driver object into the database, ensuring the one-to-one relationship is enforced.

    private static EntityManagerFactory emff = Persistence.createEntityManagerFactory("lecass");

    public void persistCarAndDriver(List<Car> cars, Driver driver) {
        EntityManager em = emff.createEntityManager();
        em.getTransaction().begin();

        for (Car car : cars) {
            car.setDriver(driver);
            em.persist(car);
        }
        em.persist(driver);
        em.getTransaction().commit();
        em.close();
    }


}

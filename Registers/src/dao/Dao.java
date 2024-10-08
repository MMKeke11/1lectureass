package dao;

import entity.Car;
import entity.Driver;

import jakarta.persistence.*;
public class Dao {
    //Write a service that persists both a Car and a Driver object into the database, ensuring the one-to-one relationship is enforced.

    private static EntityManagerFactory emff = Persistence.createEntityManagerFactory("lecass");

    public void persistCarAndDriver(Car car, Driver driver) {

        EntityManager emf = emff.createEntityManager();

        EntityTransaction transaction = emf.getTransaction();
        transaction.begin();

        emf.persist(car);
        emf.persist(driver);

        transaction.commit();

        emf.close();

    }

    public void persistCarAndDriver2(CarManyToOne car, DriverOneToMany driver) {

        EntityManager emf = emff.createEntityManager();

        EntityTransaction transaction = emf.getTransaction();
        transaction.begin();

        emf.persist(car);
        emf.persist(driver);

        transaction.commit();

        emf.close();

    }
}

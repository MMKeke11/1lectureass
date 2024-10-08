package application;

import dao.Dao;
import entity.Car;
import entity.Driver;

public class app {


    public static void main(String[] args) {
        Dao dao = new Dao();
        Car car = new Car();
        Driver driver = new Driver();
        car.setDriver(driver);
        driver.setCar(car);

        dao.persistCarAndDriver(car, driver);

        


    }
}

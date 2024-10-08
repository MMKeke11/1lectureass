package application;

import dao.Dao;
import entity.Car;
import entity.Driver;

import java.util.List;

public class app {


    public static void main(String[] args) {
        Dao dao = new Dao();
        Car car = new Car();
        Car car2 = new Car();

        car.setModel("Toyota");
        car2.setModel("Honda");

        Driver driver = new Driver();
        Driver driver2 = new Driver();

        driver.setName("John");
        driver2.setName("Doe");

        List<Car> cars = List.of(car, car2);
        List<Driver> drivers = List.of(driver, driver2);

        dao.persistCarAndDriver(cars, drivers);










    }
}

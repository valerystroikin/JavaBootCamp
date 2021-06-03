package sef.module7.activity;

public class DrivingActivity {
    public static void main(String arg[]){
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();

        Driver driver = new Driver("Valery");

        driver.setDriversMoving(car);
        driver.driverStartDriving();

        driver.setDriversMoving(motorcycle);
        driver.driverStartDriving();

        driver.setDriversMoving(car);
        driver.driverStartDriving();
    }
}

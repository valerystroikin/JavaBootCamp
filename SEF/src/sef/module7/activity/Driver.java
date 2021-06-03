package sef.module7.activity;

public class Driver {
    private String name;
    private Moving driversMoving;

    public Driver(String name) {
        this.name = name;
    }

    public void setDriversMoving(Moving driversMoving) {
        this.driversMoving = driversMoving;
    }

    public void driverStartDriving() {
        System.out.print("Driver " + this.name + " ");
        this.driversMoving.drive();
    }
}

package dev.lpa;

public class Bird extends Animal implements FlightEnabled, Trackable{


    @Override
    public void move() {
        System.out.println("Flaps wins");
    }

    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName() + "is taking off");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() + "is lznding");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + "is flying");
    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + "coordinates recorded");
    }
}

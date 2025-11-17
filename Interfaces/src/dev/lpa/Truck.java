package dev.lpa;

public class Truck implements Trackable{

    public void track() {
        System.out.println(getClass().getSimpleName() + "coordinates recorded");
    }
}

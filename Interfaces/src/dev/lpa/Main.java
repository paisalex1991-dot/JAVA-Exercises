package dev.lpa;

public class Main {

    public static void main (String[] args){

        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        animal.move();
//        flier.move();
//        tracked.move();

//        flier.takeOff();
//        flier.fly();
//        tracked.track();
//        flier.land();

        inFlight(flier);
        inFlight(new Jet());

        Trackable truck = new Truck();
        truck.track();

        double kmTraveled = 100;
        double milesTraveled = kmTraveled * FlightEnabled.KM_TO_MILES;
        System.out.printf("Truck traveled %.2f km or %.2f miles %n",
                kmTraveled, milesTraveled);

    }

    private static void inFlight(FlightEnabled flier){

        flier.takeOff();
        flier.fly();
        if(flier  instanceof Trackable tracked){
            tracked.track();
        }
        flier.land();
    }
}

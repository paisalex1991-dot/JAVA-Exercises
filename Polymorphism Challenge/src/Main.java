public class Main {

    public static void main (String[] args){

        Car car = new Car("Gas powered car", "Audi");
        runRace(car);

        Car honda = new GasPoweredCar("Gas powered", "honda",40.40,6,"180");
        runRace(honda);

        Car tesla = new Car("electric car", "tesla");
        runRace(tesla);
        
        Car toyota = new HybridCar("Hybrid car", "Toyota", 80.85, 87, 4, "210");
        runRace(toyota);

    }

    public static void runRace(Car car){
        car.drive();
        car.startEngine();


    }
}

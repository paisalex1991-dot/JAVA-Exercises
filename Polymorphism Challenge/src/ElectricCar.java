public class ElectricCar extends Car{

    private double avgKmPerKwPerHour;
    private int batterysize;
    private String topSpeed;

    public ElectricCar(String description, String name, double avgKmPerKwPerHour,
                       int batterysize, String topSpeed){
        super(description, name);
        this.avgKmPerKwPerHour = avgKmPerKwPerHour;
        this.batterysize = batterysize;
        this.topSpeed = topSpeed;
    }

    @Override
    public void drive() {
        super.drive();
    }

    @Override
    public void startEngine() {
                System.out.println("The parameters for the gas powered car are " +
                "avg " + avgKmPerKwPerHour +
                " batterysize " + batterysize +
                " topspeed " + topSpeed);
    }
}


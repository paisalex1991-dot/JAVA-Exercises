public class HybridCar extends Car{

    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;
    private String topSpeed;



    public HybridCar(String description, String name, double avgKmPerLitre, int batterySize,
                     int cylinders, String topSpeed){
        super(description, name);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
        this.topSpeed = topSpeed;
    }

    @Override
    protected void runEngine() {
        super.runEngine();
    }

    @Override
    public void startEngine() {
                System.out.println("The parameters for the gas powered car are " +
                "avg " + avgKmPerLitre +
                " batterysize " + batterySize +
                " topspeed " + topSpeed +
                " cylinders " + cylinders);
    }




}

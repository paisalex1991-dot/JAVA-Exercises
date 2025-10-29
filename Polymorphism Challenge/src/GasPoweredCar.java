public class GasPoweredCar extends Car{

    private double avgKmPerLitre;
    private int cylinders;
    private String topSpeed;

    public GasPoweredCar(String description, String name, double avgKmPerLitre,
                         int cylinders, String topSpeed){
        super(description, name);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
        this.topSpeed = topSpeed;

    }

    @Override
    public void startEngine() {
               System.out.println("The parameters for the gas powered car are " +
                "avg " + avgKmPerLitre +
                " cylinders " + cylinders +
                " topspeed " + topSpeed);
    }
}

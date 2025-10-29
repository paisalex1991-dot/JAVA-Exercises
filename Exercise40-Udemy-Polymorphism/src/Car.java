public class Car {

    private boolean engine = true;
    private int cylinders;
    private String name;
    private int wheels = 4;

    public Car(int cylinders, String name){
        this.cylinders = cylinders;
        this.name = name;
    }

    String instanceType = this.getClass().getSimpleName();

    public String startEngine(){
        return (instanceType + " engine is starting!");
    }

    public String accelerate(){

        return (instanceType + " is starting!");
    }

    public String brake(){

        return (instanceType + "  is breaking!");
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName(){
        return name;
    }
}

public class Holden extends Car{

    public Holden(int cylinders, String name) {
        super(cylinders, name);
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

}

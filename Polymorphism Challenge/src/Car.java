public class Car {

    private String description;
    private String name;
    private String type;

    public Car(String description, String name){
        this.description = description;
        this.name = name;
    }


    public void startEngine(){
        System.out.println("Start engine of " + this.name + " that is " + this.description);

    }

    public void drive(){
        System.out.println("------------");
        System.out.println("Drive " + this.name + " that is " + this.description);

    }

    protected void runEngine(){
        System.out.println("Engine running of " + this.name + " that is " + this.description);
        runEngine();

    }

}

public class Dog extends AnimalGeneric{

    private String eraShape;
    private String tailShape;

    public Dog(){
        super("mutt", "big", 50);
    }

    public Dog(String type, double weight){
        this(type, weight, "Perky", "Curled");
    }

    public Dog(String type, double weight, String eraShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"),
                weight);
        this.eraShape = eraShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "eraShape='" + eraShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise(){

        if(type == "Wolf"){
            System.out.print("ow wooooo");

        }
        bark();
        System.out.println();

    }

    @Override
    public void move(String speed) {
        super.move(speed);
        //System.out.println("Dogs walk, run and wag their tail");
        if(speed == "slow"){
            walk();
            wagTail();
        }
        else{
            run();
            bark();
        }

        System.out.println();
    }

    private void bark(){
        System.out.print("Woof!");
    }

    private void run(){
        System.out.print("Dog running!");
    }

    private void walk(){
        System.out.print("Dog walking!");
    }

    private void wagTail(){
        System.out.print("Tail Wagging!");
    }
}

public class Car {

    private String make = "Tesla";
    private String model= "x";
    private String color = "Grey";
    private int doors = 5;
    private boolean conv = true;

    public String getMake(){
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConv() {
        return conv;
    }

    public void setMake(String make){
       this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConv(boolean conv) {
        this.conv = conv;
    }

    public void describeCar(){

        System.out.println(doors + "-Doors " +
                color + " " +
                make + " " +
                model + " " +
                (conv ? "convertible" : ""));


    }


}

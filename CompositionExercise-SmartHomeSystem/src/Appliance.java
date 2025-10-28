public class Appliance {

    private String brand;
    private boolean isOn;

    public Appliance(String brand, boolean isOn){
        this.brand = brand;
        this.isOn = isOn;
    }

    public void turnOn(){
        this.isOn = true;
        System.out.println("Appliance has been turned " + this.isOn);
    }

    public void turnOff(){
        this.isOn = false;
        System.out.println("Appliance has been turned " + this.isOn);

    }

    public boolean isOn() {
        return isOn;
    }

    public String getBrand() {
        return brand;
    }
}

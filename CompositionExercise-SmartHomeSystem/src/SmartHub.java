import java.util.ArrayList;

public class SmartHub{

    private ArrayList<Appliance> devices;

    public SmartHub() {
        devices = new ArrayList<>();
    }

   public void addDevice(Appliance device){

       devices.add(device);
       System.out.println(device.getBrand() + " added to SmartHub.");
       System.out.println("All the added devices are " + devices);

   }

    public void turnAllOn() {
        System.out.println("\nTurning all devices ON...");
        for (Appliance device : devices) {
            device.turnOn();
        }
    }

    public void turnAllOff() {
        System.out.println("\nTurning all devices OFF...");
        for (Appliance device : devices) {
            device.turnOff();
        }
    }


}

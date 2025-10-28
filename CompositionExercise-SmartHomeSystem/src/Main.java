public class Main {

    public static void main(String[] args){

        SmartHub smartHub = new SmartHub();

        Light bedromLight = new Light("Philips", false, 5);
        Thermostat bedroomThermostat = new Thermostat("Honeyweel", false, 0);

        smartHub.addDevice(bedromLight);
        smartHub.addDevice(bedroomThermostat);

        smartHub.turnAllOn();

        bedromLight.dim(10);
        bedroomThermostat.setTemperature(25);


    }
}

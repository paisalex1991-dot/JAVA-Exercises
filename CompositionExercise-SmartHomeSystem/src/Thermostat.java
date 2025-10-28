public class Thermostat extends Appliance{

    private double temperature;

    public Thermostat(String brand, boolean isOn, double temperature){
        super(brand, isOn);
        this.temperature = temperature;

    }

    public void setTemperature(double temp) {
        temperature = temp;
        System.out.println(getBrand() + " thermostat adjusted to " + temperature + "°C.");
    }
}

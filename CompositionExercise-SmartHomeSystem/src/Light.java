public class Light extends Appliance{

    private int brightLevel;

    public Light(String brand, boolean isOn, int brightLevel){
        super(brand, isOn);
        this.brightLevel = brightLevel;
    }

    public void dim(int level) {
        brightLevel = level;
        System.out.println(getBrand() + " light dimmed to " + brightLevel + "%.");
    }

}

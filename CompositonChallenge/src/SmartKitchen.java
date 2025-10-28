public class SmartKitchen {

    private CofeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen(){
        brewMaster = new CofeeMaker();
        iceBox = new Refrigerator();
        dishWasher = new DishWasher();

    }

    public CofeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public boolean addWater(){
        return true;
    }

    public boolean pourMilk(){
        return true;
    }

    public boolean loadDishWasher(){
        return true;
    }



}

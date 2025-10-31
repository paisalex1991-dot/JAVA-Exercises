public class Prices {

    private double deluxeBruger = 50.00;
    private double Basic_burger  = 20.00;
    private double Cheeseburger = 35.00;
    private double Chicken_burger = 38.00;
    private double Pork_burger = 35.00;


    private double Onions = 2.00;
    private double Bacon = 5.00;
    private double Tomato = 3.00;
    private double Mayo = 2.00;
    private double Pesto = 5.00;


    private double Salad_small = 2.00;
    private double Salad_medium = 8.00;
    private double Salad_large = 12.00;
    private double Fries_small = 5.00;
    private double Fries_medium = 8.00;
    private double Fries_large = 10.00;
    private double Onion_small = 4.00;
    private double Onion_medium = 6.00;
    private double Onion_large = 8.00;


    private double Cola_small = 8.00;
    private double Cola_medium = 12.00;
    private double Pepsi_small = 2.00;
    private double Pepsi_medium = 4.00;
    private double Mirinda_small = 5.00;
    private double Mirinda_medium = 7.00;




    public double priceSelect(String option) {

        return switch (option){
            case "DELUXE" -> getDeluxeBruger();
            case "BASIC" -> getBasic_burger();
            case "CHEESEBURGER" -> getCheeseburger();
            case "CHICKEN" -> getChicken_burger();
            case "PORK" -> getPork_burger();

            case "ONIONS" -> getOnions();
            case "BACON" -> getBacon();
            case "TOMATO" -> getTomato();
            case "MAYO" -> getMayo();
            case "PESTO" -> getPesto();

            case "SALADSMALL" -> getSalad_small();
            case "SALADMEDIUM" -> getSalad_medium();
            case "SALADLARGE" -> getSalad_large();
            case "FRIESSMALL" -> getFries_small();
            case "FRIESMEDIUM" -> getFries_medium();
            case "FRIESLARGE" -> getFries_large();
            case "ONION RINGS_SMALL" -> getOnion_small();
            case "ONION RINGSMEDIUM" -> getOnion_medium();
            case "ONION RINGSLARGE" -> getOnion_large();

            case "COLASMALL" -> getCola_small();
            case "COLAMEDIUM" -> getCola_medium();
            case "PEPSISMALL" -> getPepsi_small();
            case "PEPSIMEDIUM" -> getPepsi_medium();
            case "MIRINDASMALL" -> getMirinda_small();
            case "MIRINDAMEDIUM" -> getMirinda_medium();

            default -> 0.00;
        };
    }



    public double getDeluxeBruger() {
        return deluxeBruger;
    }

    public double getBasic_burger() {
        return Basic_burger;
    }

    public double getCheeseburger() {
        return Cheeseburger;
    }

    public double getChicken_burger() {
        return Chicken_burger;
    }

    public double getPork_burger() {
        return Pork_burger;
    }

    public double getOnions() {
        return Onions;
    }

    public double getBacon() {
        return Bacon;
    }

    public double getTomato() {
        return Tomato;
    }

    public double getMayo() {
        return Mayo;
    }

    public double getPesto() {
        return Pesto;
    }

    public double getSalad_small() {
        return Salad_small;
    }

    public double getSalad_medium() {
        return Salad_medium;
    }

    public double getSalad_large() {
        return Salad_large;
    }

    public double getFries_small() {
        return Fries_small;
    }

    public double getFries_medium() {
        return Fries_medium;
    }

    public double getFries_large() {
        return Fries_large;
    }

    public double getOnion_small() {
        return Onion_small;
    }

    public double getOnion_medium() {
        return Onion_medium;
    }

    public double getOnion_large() {
        return Onion_large;
    }

    public double getCola_small() {
        return Cola_small;
    }

    public double getCola_medium() {
        return Cola_medium;
    }

    public double getPepsi_small() {
        return Pepsi_small;
    }

    public double getPepsi_medium() {
        return Pepsi_medium;
    }

    public double getMirinda_small() {
        return Mirinda_small;
    }

    public double getMirinda_medium() {
        return Mirinda_medium;
    }
}


public class Main {

    public static void main(String[] args){

        int feet = 6;
        int inches = 45;

        System.out.println("In case the given height is in feet an inches " + convertToCentimeters(feet, inches) + " cm");
        System.out.println("In case the given height is only in inches " + convertToCentimeters(inches)+ " cm");

    }

    public static double convertToCentimeters(int heightInInches){
        double result = 0;

        result = heightInInches * 2.54;

        return result;

    }
    public static double convertToCentimeters(int heightInFeet, int restInInches){
        double result = 0;
        int totalHeightInInches = (heightInFeet * 12) + restInInches;

        result = convertToCentimeters(totalHeightInInches);

        return result;
    }

}

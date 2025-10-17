public class Main {

    public static void main(String[] args){

        int value = 5;

        switch (value)
        {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Value was a 3 a 4 or a 5");
                System.out.println("Acrual case was: " + value);
            }
            default -> System.out.println("Value was not 1 or 2");


        }
        String month = "May";
        System.out.println(month + " is in the " + qetQuater(month) + " quater");

    }

    public static String qetQuater(String month){

        return switch (month) {
            case "January", "February", "March" -> "1";
            case "April", "May", "June" -> "2";
            case "July", "August", "September" -> "3";
            case "October", "November", "December" -> "4";
            default -> "bad";
        };

    }
}

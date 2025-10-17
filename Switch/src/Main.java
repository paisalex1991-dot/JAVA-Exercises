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
    }
}

public class Main {

    public static void main(String[] args){

        int value = 5;

        switch (value)
        {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Value was a 3 a 4 or a 5");
                System.out.println("Acrual case was: " + value);
                break;

            default:
                System.out.println("Value was not 1 or 2");


        }
    }
}

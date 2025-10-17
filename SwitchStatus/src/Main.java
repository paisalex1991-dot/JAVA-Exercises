public class Main {

    public static void main (String[] args){

        int i = 0;
        char[] letters = {'A','B','C','D','E'};

        for (i=0; i<5; i++){

           System.out.println("Correspondig keyword for " + letters[i] + " is " + getKeyword(letters[i]));

        }

    }

    public static String getKeyword(char letter)
    {
        return switch (letter)
        {
            case 'A' ->"Able";
            case 'B' -> "Baker";
            case 'C' -> "Charlie";
            case 'D' -> "Dog";
            case 'E' -> "Easy";
            default -> "Letter was not found!";

        };
    }
}

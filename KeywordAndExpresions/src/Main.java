public class Main {
    public static void main(String[] args) {
        double kilometers = (100 * 1.6093444);

        int highScore = 50;

        if (highScore > 25)
        {

            highScore = 1000 + highScore; //add bonus points
        }


        int health = 100;

        if ((health < 25) && (highScore > 1000))
        {
            highScore = highScore - 1000;
        }

    }
}

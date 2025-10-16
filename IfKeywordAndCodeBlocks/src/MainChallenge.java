public class MainChallenge {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelComplete =5;
        int bonus = 100;

        int finalScore = score;

        if (gameOver == true)
        {
            finalScore += (levelComplete *bonus);
            System.out.println("Your final score was " + finalScore);
        }




    }


}


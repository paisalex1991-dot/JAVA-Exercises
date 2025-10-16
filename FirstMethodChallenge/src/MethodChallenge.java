public class MethodChallenge {

    public static void main (String[] args){

        int inputData[] = {1500,1000, 500, 100, 25};
        int highScorePosition = 0;

        for (int i=0; i<5; i++)
        {
            highScorePosition = calculateHighScorePosition(inputData[i]);
            displayHighScorePosition("Tim", highScorePosition);
        }


    }

    public static void displayHighScorePosition (String playerName, int position){

        System.out.println(playerName + " managed to get into position " + position + " on the high score list !");
    }

    public static int calculateHighScorePosition(int score){

        int result = 0;

        if(score >= 1000)
        {
            result = 1;
        }
        else if((score >= 500) && (score < 1000))
        {
            result = 2;
        }
        else if((score >= 100) && (score < 500))
        {
            result = 3;
        }
        else
        {
            result = 4;
        }
        return result;
    }

}



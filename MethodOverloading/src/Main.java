public class Main {
    public static void main(String[] args){

        System.out.println("NewScore is " + calulateScore("Tim", 500));
        System.out.println("NewScore is " + calulateScore(10));

    }
    public static int calulateScore(String playerName, int score){

        System.out.println("Player " + playerName + " scored " + score + " ponts");
        return score * 1000;
    }

    public static int calulateScore(int score){

        return calulateScore("Anonymous", score);
    }

    public static int calulateScore(){

        System.out.println("Player scored 0 ponts");
        return 0;
    }

}

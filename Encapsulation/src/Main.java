public class Main {

    public static void main (String[] args){

//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Brisca";
//
//        int damage = 10;
//        player.loseHealth(damage);
//      damage = 40;
//       player.loseHealth(damage);
//        int extraHealth = 120;
//        player.restoreHealth(extraHealth);

        EnhancedPlayer tim = new EnhancedPlayer("Tim");
        System.out.println("Initial health is "+ tim.healthRemaining());
    }
}

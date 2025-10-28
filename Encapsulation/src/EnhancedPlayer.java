public class EnhancedPlayer {

    private String fullName;
    private int healthProcent;
    private String weapon;

    public EnhancedPlayer(String fullName){
        this(fullName, 100, "Sword");

    }

    public EnhancedPlayer(String fullName, int health, String wepon){
        this.fullName = fullName;
        if(health <= 0){
            this.healthProcent = 1;
        }
        else if (health > 100){
            this.healthProcent = 100;
        }
        else{
            this.healthProcent = health;
        }

        this.weapon = wepon;
    }

    public void loseHealth(int damage){

        healthProcent = healthProcent - damage;
        if(healthProcent <= 0) {
            System.out.println("Fatality try again ");
        }
    }

    public int healthRemaining(){
        return healthProcent;
    }

    public void restoreHealth(int extraHealth){

        healthProcent = healthProcent + extraHealth;

        if (healthProcent > 100){

            healthProcent = 100;
            System.out.println("Player has full health");
        }
    }
}

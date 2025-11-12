public class Main {

    public static void main (String[] args){

        Customer bob = new Customer("Bob s", 1000.0);
        System.out.println(bob);

        Bank bank = new Bank("ING");
        bank.addCustomer("Adi", 200);
        System.out.println(bank);

        bank.addTransaction("Adi", -78.33);
        bank.addTransaction("Adi", -7.33);
        bank.printStatement("Adi");




    }
}

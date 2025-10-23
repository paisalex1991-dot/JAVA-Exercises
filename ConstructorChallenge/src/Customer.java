public class Customer {

    private String name;
    private double creditLimit;
    private String emailAdress;

    public String getName(){
        return name;
    }

    public double getCreditLimit(){
        return creditLimit;
    }

    public String getEmailAdress(){
        return emailAdress;
    }

    public Customer(String name, double creditLimit, String emailAdress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAdress = emailAdress;

        System.out.println("All parameter constructer was called ");
    }

    public Customer(){

        this("John Doe", 1000.00, "email@emil.com");
        System.out.println("No parameter constructer was called ");

    }

    public Customer(String name, String emailAdress){
        this("John Doe", 1000.00, "email@emil.com");

        System.out.println("Two parameter constructer was called ");
    }
}

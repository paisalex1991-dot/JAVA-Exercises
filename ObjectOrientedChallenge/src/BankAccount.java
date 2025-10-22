import java.util.Scanner;

public class BankAccount {

    private int accountNumber = 123;
    private double accountBlance = 1000.0;
    private String customerName = "John Doe";
    private String email = "j@mail.com";
    private String phoneNumber = "123";

    Scanner scanner = new Scanner(System.in);

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBlance() {
        return accountBlance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
        return accountNumber;
    }

    public double setAccountBalance(double accountBlance){
        this.accountBlance = accountBlance;
        return accountBlance;
    }

    public String setCustomerName(String customerName){
        this.customerName = customerName;
        return customerName;
    }

    public String setEmail(String email){
        this.email = email;
        return email;
    }

    public String setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
        return phoneNumber;
    }

    public void describeBankAccount(){

        System.out.println("Account number is " +  accountNumber +
        "\nAccount balance is " + accountBlance +
        "\nCustomer name is " + customerName +
        "\nEmail is " +  email +
        "\nPhone number is " + phoneNumber);

    }

    public void depositFunds(){

        System.out.println("Enter your account number: ");
        setAccountNumber(scanner.nextInt());

        System.out.println("Enter balance you want to add to your deposit: ");
        setAccountBalance(scanner.nextDouble());

        System.out.println("Enter your name: ");
        setCustomerName(scanner.nextLine());

        System.out.println("Enter your email: ");
        setEmail(scanner.nextLine());

        System.out.println("Enter your phone number: ");
        setPhoneNumber(scanner.nextLine());


        System.out.println("Your account balance is: " + getAccountBlance());

    }

    public void withdrawFunds() {

        double amount;

        System.out.println("Enter the amount you want to withdraw: ");
        amount = scanner.nextDouble();
        if ((getAccountBlance() - amount) < 0) {

            System.out.println("You cannot withdraw " + amount + "Insufficient funds!!!");
        } else {

            setAccountBalance(getAccountBlance() - amount);
            System.out.println("You have withdrawn " + amount);
            System.out.println("Your remaining balance is " + getAccountBlance());

        }
    }




}

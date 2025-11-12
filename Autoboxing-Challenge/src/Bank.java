import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Customer> customers = new ArrayList<>(5000);


    public Bank (String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }

    public Bank (String name, ArrayList<Customer> customers){
        this.name = name;
        this.customers = customers;
    }


   private Customer getCustomer(String customerName){

        for(var customer : customers){
            if(customer.getName().equalsIgnoreCase(customerName)){
                return customer;
            }
        }

        System.out.printf("Customer (%s) wasn't found %n", customerName);
        return null;
   }

    public void addCustomer(String  customerName, double amountToAdd){

        if(getCustomer(customerName) == null){
            Customer customer = new Customer(customerName, amountToAdd);
            customers.add(customer);
            System.out.println("New Cusotmer added : " +customer);

        }

    }

    public void addTransaction(String name, double amountToAdd) {

        Customer customer = getCustomer(name);
        if (customer != null) {
            customer.getTransaction().add(amountToAdd);
        }
    }

    public void printStatement(String customerName){
        Customer customer = getCustomer(customerName);
        if(customer == null){
            System.out.println("Customer : " + customerName + " does not exist!");
                        return;
        }
        System.out.println("-".repeat(30));
        System.out.println("Customer Name: " + customerName);
        System.out.println("Transactions: ");
        for(double d : customer.getTransaction()){
            System.out.printf("$%10.2f (%s)%n", d, d < 0 ? "debit" : "credit");
        }
    }



}

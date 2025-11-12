import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Customer> customers = new ArrayList<>(5000);


    public Bank (String name){
        this.name = name;
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
            System.out.println("New Cusotmer added : " +customer)

        }

    }

    public void addTransaction(Customer client){

        if(!customers.contains(client)){
            System.out.println("Client was not found in database");

        }
        else{

            customers.add(client);

        }
    }


}

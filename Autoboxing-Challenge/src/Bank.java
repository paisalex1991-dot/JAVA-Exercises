import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Customer> customers;

    public Bank (String name, ArrayList<Customer> customers){
        this.name = name;
        this.customers = customers;
    }

    public void addCustomer(Customer customer){

        if(customers.contains(customer)){
            System.out.println("Client " + customer + "already exist in database" );
        }
        else{
            customers.add(customer);
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

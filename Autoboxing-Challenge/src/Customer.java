import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, ArrayList<Double> transactions){
        this.name = name;
        this.transactions = transactions;
    }

    public Customer(String name, double initialDeposit){
        this(name.toUpperCase(), new ArrayList<Double>(500));
        transactions.add(initialDeposit);
    }

    @Override
    public String toString() {
        return "Customer{name='" + name + "', transactions=" + transactions + "}";
    }

    public String getName(){
        return name;
    }
    public ArrayList<Double>  getTransaction(){
        return transactions;
    }
}

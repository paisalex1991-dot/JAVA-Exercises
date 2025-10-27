public class Main {

    public static void main(String[] args){


        Employee tim = new Employee("Tim","1995",  "2020");

        System.out.println(tim);
        System.out.println("Age equals: " + tim.getAge());
        System.out.println("Pay is: "+ tim.collectPay());

        SalariedEmployee joe = new SalariedEmployee("Joe","1999",  "2021", 35000);

        System.out.println(joe);
        //System.out.println("Age equals: " + joe.getAge());
        System.out.println("Joe's Pay is: "+ joe.collectPay());

        HourlyEmployee alex = new HourlyEmployee("alex", "1975", "2020", 9.90);
        System.out.println(alex);
        System.out.println(alex.getName() + "'s salaries is :" +alex.getDoublePay(10));


    }
}

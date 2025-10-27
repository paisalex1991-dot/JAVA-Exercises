public class Main {

    public static void main(String[] args){


        Employee tim = new Employee("Tim","1995",  "2020");

        System.out.println(tim);
        System.out.println("Age equals: " + tim.getAge());
        System.out.println("Pay is: "+ tim.collectPay());

        Employee joe = new Employee("Joe","1999",  "2021");

        System.out.println(joe);
        System.out.println("Age equals: " + joe.getAge());
        System.out.println("Pay is: "+ joe.collectPay());

  ;
    }
}

public class HourlyEmployee extends Employee{

    private double hourlyPayRate;

    public HourlyEmployee(){
    }

    public HourlyEmployee(double hourlyPayRate){
        this.hourlyPayRate = hourlyPayRate;
    }

    public void getDoublePay(){

    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }
}

public class HourlyEmployee extends Employee{

    private double hourlyPayRate = 8.45;
    private double extraHoursPerWeek;

    public HourlyEmployee(){
    }

    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyPayRate){
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getDoublePay(int extraHoursPerWeek){
        this.extraHoursPerWeek = extraHoursPerWeek;

        return ((40 * this.hourlyPayRate) + (this.extraHoursPerWeek * this.hourlyPayRate * 2));
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }
}

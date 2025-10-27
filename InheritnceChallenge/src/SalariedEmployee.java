public class SalariedEmployee extends Employee{

    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(){}

    public SalariedEmployee(double annualSalary, boolean isRetired){

        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public void retire(){

    }

    public double getAnnualSalary(){
        return annualSalary;
    }
    public boolean isRetired(){
        return isRetired;
    }

}

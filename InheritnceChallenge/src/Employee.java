public class Employee extends Worker{
    private long employeeld;
    private String hireDate;
    private static int employeeNo = 1;

    public Employee(){}

    public Employee(String name, String birthDate, String hireDate){
        super(name, birthDate);
        this.employeeld = Employee.employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeld=" + employeeld +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }

    public long isEmployeeld(){
        return employeeld;
    }
    public String getHireDate(){
        return hireDate;
    }
}

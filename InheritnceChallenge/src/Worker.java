public class Worker {

    private String name;
    private String birthDate;
    protected String endDate;

    public Worker(){}

    public Worker(String name, String birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    public Worker(String name, String birthName, String endDate){
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }



    public int getAge(){
        int age;
        return age = 2025 - Integer.parseInt(birthDate);

    }

    public double collectPay(){
        double pay = 0.0;
        return pay;
    }

    public void terminate(String endDate){
    this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }

    public String getName(){
        return name;
    }
    public String getBirthDate(){
        return birthDate;
    }
    public String getEndDate(){
        return endDate;
    }
}

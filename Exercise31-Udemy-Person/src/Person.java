public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {

        if((age < 0) || (age > 100)){
            this.age = 0;
        }
        else{
            this.age = age;
        }

    }

    public boolean isTeen(){

        if ((getAge() > 12) && (getAge() < 20)){
            return true;
        }
        else{
            return false;
        }
    }

    public String getFullName (){

        if((getFirstName() == "") && (getLastName() == "")){
            return "";
        }
        else if((getFirstName() == "") && (getLastName() != "")) {
            return getLastName();
        }
        else if((getFirstName() != "") && (getLastName() == "")) {
            return getFirstName();
        }
        else{
            return getFirstName() + " " +getLastName();
        }
    }
}

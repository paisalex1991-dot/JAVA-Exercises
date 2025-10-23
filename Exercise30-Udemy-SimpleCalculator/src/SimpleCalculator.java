public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
        //return firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
       // return secondNumber;
    }

    public double getAdditionResult(){

        double sum = getFirstNumber() + getSecondNumber();
        return sum;
    }

    public double getSubtractionResult() {

        double rez = getFirstNumber() - getSecondNumber();
        return rez;
    }

    public double getMultiplicationResult() {

        double rez = getFirstNumber() * getSecondNumber();
        return rez;
    }

    public double getDivisionResult () {

        if(secondNumber == 0){
            return 0;
        }
        else {
            double rez = getFirstNumber() / getSecondNumber();
            return rez;
        }
    }
}

public class StringMethods {

    public static void main(String[] args) {

        String birthDate = "25/11/1829";
        int startingIndex = birthDate.indexOf("1829");
        System.out.println("Starting index = " + startingIndex);
        System.out.println("Birth year = " + birthDate.substring(startingIndex));
        System.out.println("Extract month :" + birthDate.substring(3, 5)); //prints the substring from index 3 to 4!

        String newDate = String.join("-","12", "12", "1990");// 12/12/1990
        System.out.println(newDate);

    }
}

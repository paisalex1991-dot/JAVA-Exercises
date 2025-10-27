public class Main {

    public static void main (String[] args){

        String textBlock = """
                Print a bulleted list:
                    \u2022 First Point
                    \u2022 Second point""";

        System.out.println(textBlock);

        int age = 54;

        System.out.printf("Your age is %d", age);

        String fortattedString = String.format("Your age is %d", age);





    }
}

public class Main {

    public static void main(String[] arg){

        String helloWorld = "Hello" + "World";
        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + "World");

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);

    }

    public static void printInformation(String string){

        System.out.println("String = " + string);
        System.out.println("lenght = " + string.length());
    }
    public static void printInformation(StringBuilder builder){

        System.out.println("StringBuilder = " + builder);
        System.out.println("lenght = " + builder.length());
    }
}

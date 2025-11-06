import java.util.LinkedList;
import java.util.Scanner;

record Place(String name, int dist){
    @Override
    public String toString(){

        return String.format("%s (%d)", name, dist);
    }
}

public class Main {

    public static void main(String[] args){


        LinkedList<Place> listOfPlaces = new LinkedList<>();
        Actions.seeMenu();

        Boolean flag = true;
        Scanner scanner = new Scanner(System.in);

        while(flag){
            var input = scanner.nextLine();
            switch(input){
                case "F", "Forward" -> Actions.moveForward(listOfPlaces);
                case "B", "Backward" -> Actions.moveBackward(listOfPlaces);
                case "A", "Add" -> Actions.addPlaces(listOfPlaces);
                case "R", "Remove" -> Actions.removePlaces(listOfPlaces);
                case "L", "List" -> Actions.listPlaces(listOfPlaces);
                case "M", "Menu" -> Actions.seeMenu();
                case "Q", "Quit" -> flag = false;
                default -> System.out.println("Wrong option!");
            };
            Actions.seeMenu();
        }


    }
}



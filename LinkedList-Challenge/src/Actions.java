import java.util.LinkedList;
import java.util.Scanner;

public class Actions {
    private static Scanner scanner = new Scanner(System.in);

    public static void seeMenu(){

        System.out.println("""
                Available actions (select word or letter)
                (F)orward
                (B)ackward
                (A)dd places
                (R)emove places
                (L)ist Palces
                (M)enu
                (Q)uit""");
        System.out.println();
    }

    public static void addPlaces(LinkedList<Place> list){
        System.out.println("Add a place followed by the distance from referince point");
        var place = scanner.nextLine();
        var dist = Integer.parseInt(scanner.nextLine());

        Place destination =  new Place(place,dist);

            if(list.contains(destination)){
                System.out.println("Place you try to add already exists");
                return;
            }
            for(Place p : list){
                if(p.name().equalsIgnoreCase(destination.name())){
                    System.out.println("Place you try to add already exists");
                    return;
                }
            }

               list.add(destination);
    }

    public static void removePlaces(LinkedList<Place> list){
        System.out.println("Enter the name of the place you want to remove : ");
        var place = scanner.nextLine();
        var dist = Integer.parseInt(scanner.nextLine());

        Place destination =  new Place(place,dist);

        if(list.contains(destination)){

            list.remove(destination);
            return;
        }
        else{

            System.out.println("The place you have entered does not exist!");

        }



    }

    public static void moveForward(LinkedList<Place> list){

        var iterator = list.listIterator();

        System.out.println("Enter the number of positions you want to move Forward : ");
        var positions = Integer.parseInt(scanner.nextLine());

        while ((positions >= 0) && (iterator.hasNext())){
            iterator.next();
            positions -- ;
        }

        System.out.println("You are at position: " + iterator.next());

    }

    public static void moveBackward(LinkedList<Place> list){

        var iterator = list.listIterator();
        System.out.println("Enter the number of positions you want to move Backward : ");
        var positions = Integer.parseInt(scanner.nextLine());

        while ((positions >= 0) && (iterator.hasPrevious())){
            iterator.previous();
            positions -- ;
        }

        System.out.println("You are at position: " + iterator.next());

    }

    public static void listPlaces(LinkedList<Place> list){
        System.out.println(list);
    }


}

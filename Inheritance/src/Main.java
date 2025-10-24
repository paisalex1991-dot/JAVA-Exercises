public class Main {

    public static void main (String[] args){

    AnimalGeneric animal = new AnimalGeneric("Gneric animal", "huge", 400);
        doAnimalStuff(animal,"slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");

        Dog yorkie = new Dog("Yorkie", 15);
        doAnimalStuff(yorkie,"fast");

        Dog retreiver = new Dog("Labrador retreiver", 65, "Floppy", "Swimmer");
        doAnimalStuff(retreiver, "Slow");


    }

    public static void doAnimalStuff(AnimalGeneric animal, String speed){

        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("__________");
    }
}

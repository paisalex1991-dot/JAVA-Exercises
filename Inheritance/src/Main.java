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

        Dog wolf = new Dog("Wolf", 40);
        doAnimalStuff(wolf, "slow");

        Fish goldie = new Fish("Goldfish", 0.25, 2, 3);
        doAnimalStuff(goldie, "fast");


    }

    public static void doAnimalStuff(AnimalGeneric animal, String speed){

        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("__________");
        Fish.fortest();
    }
}

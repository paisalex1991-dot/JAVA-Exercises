public class Main {

    public static void main(String[] args){

        Car car = new Car();
        car.setMake("porsche");
        car.setModel("carrera");
        car.setDoors(2);

        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();

        Car targa = new Car();
        targa.setMake("porsche");
        targa.setModel("targa");
        targa.setDoors(2);

        targa.describeCar();

    }
}


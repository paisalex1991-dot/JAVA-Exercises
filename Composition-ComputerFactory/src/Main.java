public class Main {

    public static void main (String[] args){

    ComputerCase theCase = new ComputerCase("2208", "Dell", "240");

    Monitor monitor = new Monitor("27inch beast", "Acer", 27,"1280 x 1024");

    Motherboard theMotherboard = new Motherboard("bj-200", "Asus", 4,5,"v2.44");

    PC newPc = new PC("2208", "dell", monitor, theMotherboard, theCase);

//    newPc.getMonitor().drawPixelAt(10, 10, "red");
//    newPc.getMotherboard().loadProgram("Windows OS");
//    newPc.getComputerCase().pressPowerButton();

        newPc.powerUp();

    }
}

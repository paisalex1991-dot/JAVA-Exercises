public class PC extends Product{

    private Monitor monitor;
    private Motherboard motherboard;
    private ComputerCase computerCase;

    public PC (String model, String manufacturer,
               Monitor monitor, Motherboard motherboard, ComputerCase computerCase){
        super(model, manufacturer);
        this.monitor = monitor;
        this.motherboard = motherboard;
        this.computerCase = computerCase;
    }

    private void drawLogo(){
        monitor.drawPixelAt(1200, 50, "green");
    }

    public void powerUp(){
        computerCase.pressPowerButton();
        drawLogo();
    }

//    public ComputerCase getComputerCase(){
//        return computerCase;
//    }
//    public Monitor getMonitor(){
//        return monitor;
//    }
//    public Motherboard getMotherboard(){
//        return motherboard;
//    }



}

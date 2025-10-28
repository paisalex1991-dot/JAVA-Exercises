public class CofeeMaker {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCofee(){
        if(this.hasWorkToDo){
            System.out.println("Brewing Coffee");
            hasWorkToDo = false;
        }

    }
}

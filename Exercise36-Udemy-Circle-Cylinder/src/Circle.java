public class Circle {

    private double radius;



    public Circle(double radius){

        if(radius < 0){
            radius = 0;
        }
        this.radius = radius;
    }

    public double getArea() {
        double area;

        return area = radius * radius * Math.PI;

    }

    public double getRadius() {
        return radius;
    }
}

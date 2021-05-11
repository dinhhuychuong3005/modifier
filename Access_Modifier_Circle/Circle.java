package Access_Modifier_Circle;

public class Circle {
    private double radius;
    private String color;
    public Circle(){
        this.radius = 1;
        this.color = "red";
    }
    public Circle(double radius,String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }
}

package StaticProperty;

public class Car {
    private String name;
    private String engine;
    public static int numberofcar;
public Car(String name,String engine){
    this.name = name;
    this.engine = engine;
    numberofcar++;
}
public void display(){
    System.out.println(name + " , " + engine + " , " + Car.numberofcar);
}
}

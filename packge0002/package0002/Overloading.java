package package0002;


public class Overloading{
    public String company= "hyundai";
    public String model;
    public String color= "silver";
    public int maxSpeed;

    public Overloading(){

    }

    public Overloading(String model) {
        this.model=model;
    }

    public Overloading(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public Overloading(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
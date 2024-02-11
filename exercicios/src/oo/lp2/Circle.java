package oo.lp2;

public class Circle {
    private double radius;
    private Color color;

    public Circle(){
        this.radius = 1.0;
        this.color = Color.RED;
    }

    public Circle(double radius, Color color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius(){
        return radius;
    }

    public Color getColor(){
        return color;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
}

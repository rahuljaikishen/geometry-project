package fr.tbr.exercises.geometry;
import java.lang.*;

public class Triangle {
    private Double side1;
    private Double side2;
    private Double side3;

    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getArea(){
        Double semiperimeter = (this.getPerimeter()/2);
        return Math.sqrt(semiperimeter*(semiperimeter - this.side1)*(semiperimeter - this.side2)*(semiperimeter - this.side3));
    }
    public double getPerimeter(){
        return this.side1 + this.side2 + this.side3;
    }
}

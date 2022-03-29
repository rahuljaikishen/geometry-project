package fr.tbr.exercises.geometry;

/**
 * Define a Circle class, which has 2 methods for calculating its perimeter and area
 * @author Tom
 *
 */
public class Circle {

    //the way to define a private constant : private static final
    private static final double PI = Math.PI;

    //this is the radius of the circle
    private double radius;

    /**
     * The constructor to create a circle with a radius equal to the given parameter
     * @param r the radius of the circle to be created
     */
    public Circle (double r){
        this.radius = r;
    }

    /**
     * compute the area of the circle
     * @return the area
     */
    public double getArea(){
        return PI * this.radius * this.radius;
    }

    /**
     * compute the perimeter of the circle
     * @return the perimeter
     */
    public double getPerimeter(){
        return 2 * PI * this.radius;
    }
}
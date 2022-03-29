package fr.tbr.exercises.geometry;

public class Square extends Quadrilateral{
    /**
     * The constructor to create a square with a length and breadth equal to the given parameter using the Quadrilateral abstract class
     * @param r the radius of the circle to be created
     */
    public Square (double length,double breadth){
        super(length,breadth);
    }
    public double getArea(){
        return this.length * this.breadth;
    }
    public double getPerimeter(){
        return 2 * (this.length + this.breadth);
    }
}

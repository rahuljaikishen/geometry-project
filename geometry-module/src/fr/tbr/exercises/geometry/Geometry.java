package fr.tbr.exercises.geometry;

public class Geometry {

    public static void main(String[] args) {
        Circle smallCircle = new Circle(20);
        Circle bigCircle = new Circle(60);

        System.out.println("Small circle perimeter : " + smallCircle.getPerimeter() + "...");
        System.out.println("Big circle perimeter : " + bigCircle.getPerimeter() + "...");

        Square Square = new Square(20,40);

        System.out.println("Square area : " + Square.getArea() + "...");
        System.out.println("Square perimeter : " + Square.getPerimeter() + "...");

        Triangle Triangle = new Triangle(20,30,40);

        System.out.println("Triangle area : " + Triangle.getArea() + "...");
        System.out.println("Triangle perimeter : " + Triangle.getPerimeter() + "...");

    }
}

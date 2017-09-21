public class ShapeCalculator {
    public static void main(String[] args) {

        Square square1 = new Square(7);

        double squarearea = square1.squareArea(7);{
            System.out.println("The area of the square1 = " + squarearea +"cm2");
        }

        Circle circle1 = new Circle(5);

        double circleArea = circle1.circleArea(4);
        System.out.println("The area of the circle1 = " + circleArea +"♊ cm2" );
    }}

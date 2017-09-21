class Square {
    double sideA;

    Square(double a){
        sideA = a;
    }

    double squareArea(double a) {return a*a;}
}

class Rectangle {
    int sideA;
    int sideB;

    Rectangle(int a, int b){
        sideA = a;
        sideB = b;
    }
}

    class Circle {
        int radius;

    Circle(int r) {
        radius = r;
    }

        double circleArea(int r) {
            return r*r;


    }

    class Triangle {
        int sideA;
        int sideB;

        Triangle(int a, int b) {
            sideA = a;
            sideB = b;
        }

        }
        double trianglePerimeter(int a, int b){
            return 0.5*a*b;
        }
        double rectPerimeter(int a, int b){
            return  a*b;
        }
    }
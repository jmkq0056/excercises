import java.util.Date;
import one.*;
import two.*;
import three.*;
import four.*;
import five.*;
import six.*;
import seven.*;
import eight.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // problem 1
/*
        // Create a 2D point
        Point2D point2D = new Point2D(1, 2);
        point2D.display();

        // Create a 3D point
        Point3D point3D = new Point3D(3, 4, 5);
        point3D.display();

        // Create a 3D colored point
        ColoredPoint3D coloredPoint3D = new ColoredPoint3D(6, 7, 8, "Red");
        coloredPoint3D.display();
*/
        // problem 2
/*
        Color red = new Red();
        Color green = new Green();
        Color blue = new Blue();
        Color black = new Black();
        Color white = new White();
        Color gray = new Gray();
        Color cyan = new Cyan();

        // Display the RGB values of each color
        System.out.println("Red Color:");
        red.displayColor();

        System.out.println("Green Color:");
        green.displayColor();

        System.out.println("Blue Color:");
        blue.displayColor();

        System.out.println("Black Color:");
        black.displayColor();

        System.out.println("White Color:");
        white.displayColor();

        System.out.println("Gray Color:");
        gray.displayColor();

        System.out.println("Cyan Color:");
        cyan.displayColor();
*/
        // problem 3
/*
        Shape square = new Square(5);
        System.out.println("Square Area: " + square.getArea());
        System.out.println("Square Circumference: " + square.getCircumference());
        System.out.println("Square Edges: " + square.getNumberOfEdges());

        Shape rectangle = new Rectangle(4, 6);
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Circumference: " + rectangle.getCircumference());
        System.out.println("Rectangle Edges: " + rectangle.getNumberOfEdges());

        Shape triangle = new Triangle(3, 4, 3, 4, 5);
        System.out.println("Triangle Area: " + triangle.getArea());
        System.out.println("Triangle Circumference: " + triangle.getCircumference());
        System.out.println("Triangle Edges: " + triangle.getNumberOfEdges());

        Shape circle = new Circle(7);
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Circumference: " + circle.getCircumference());
        System.out.println("Circle Edges: " + circle.getNumberOfEdges());

        Shape line = new Line(10);
        System.out.println("Line Area: " + line.getArea());
        System.out.println("Line Circumference: " + line.getCircumference());
        System.out.println("Line Edges: " + line.getNumberOfEdges());
*/
        // problem 4
/*
        // Create a Person
        Person person = new Person("John Doe", 30);
        System.out.println(person);

        // Create an Employee
        Employee employee = new Employee("Jane Smith", 28, "Software Engineer", 85000);
        System.out.println(employee);

        // Create a Manager
        Manager manager = new Manager("Alice Johnson", 40, "Team Lead", 95000, 15000);
        System.out.println(manager);
*/
        // problem 5
/*
        // Weekday parking rate
        ParkingRate weekdayRate = new WeekdayRate();
        // Weekend parking rate
        ParkingRate weekendRate = new WeekendRate();

        // Parking meter with weekday rate
        ParkingMeter parkingMeter = new ParkingMeter(weekdayRate);

        System.out.println("Weekday Parking:");
        parkingMeter.insertCoins(30); // Pay for 30 minutes on a weekday
        parkingMeter.insertCoins(60); // Pay for 60 minutes on a weekday

        // Switch to weekend rate
        parkingMeter.setParkingRate(weekendRate);
        System.out.println("Weekend Parking:");
        parkingMeter.insertCoins(30); // Pay for 30 minutes on a weekend
        parkingMeter.insertCoins(60); // Pay for 60 minutes on a weekend

        // Total amount collected
        System.out.println("Total Amount Collected: DKK" + parkingMeter.getTotalAmount());
*/
        // problem 6
/*
        RegularFile file1 = new RegularFile("file1.txt", new Date(1672502400000L), 500); // 2023-01-01
        RegularFile file2 = new RegularFile("file2.txt", new Date(1675080800000L), 300); // 2023-02-01
        RegularFile file3 = new RegularFile("file3.txt", new Date(1677759200000L), 700); // 2023-03-01

        Directory dir1 = new Directory("dir1", new Date());
        dir1.addFile(file1);
        dir1.addFile(file2);

        Directory root = new Directory("root", new Date());
        root.addFile(dir1);
        root.addFile(file3);

        System.out.println("Oldest file: " + root.getOldestRegularFile().getName());
        System.out.println("Newest file: " + root.getNewestRegularFile().getName());
*/
        // problem 7
/*
        // Create a PizzaTruck instance
        PizzaTruck pizzaTruck = new PizzaTruck("Ford", "PizzaMaster 3000", 2023, 4);

        // Display truck details
        System.out.println(pizzaTruck.getTruckDetails());

        // Use pizza-making methods
        System.out.println(pizzaTruck.makeMargheritaPizza());
        System.out.println(pizzaTruck.makePepperoniPizza());
        System.out.println(pizzaTruck.makeVegetarianPizza());
*/
        // problem 8
/*
        ChessBoard chessBoard = new ChessBoard();

        // Display initial board
        System.out.println("Initial Board:");
        chessBoard.displayBoard();

        // Try to move the White King
        System.out.println("\nMoving White King to (1, 4):");
        chessBoard.movePiece(0, 4, 1, 4);
        chessBoard.displayBoard();

        // Try to move the Black King
        System.out.println("\nMoving Black King to (6, 4):");
        chessBoard.movePiece(7, 4, 6, 4);
        chessBoard.displayBoard();

        // Invalid move for White King
        System.out.println("\nInvalid move for White King:");
        chessBoard.movePiece(1, 4, 3, 4);
        chessBoard.displayBoard();
*/
    }
}
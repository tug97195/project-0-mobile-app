import java.util.Scanner;

//MAIN CLASS
public class project0 {
	public static void main(String[] args) {
		System.out.println("Hello Welcome to Project 0 Assignment for Mobile App. This app has been created by Kevin Levitz");
		System.out.println("Please enter the dimensions for each shape.");
		
		//Square
		System.out.println("SQUARE: Length [1/2]");
		System.out.print("Please enter a number > ");
		Scanner input = new Scanner(System.in);
		double square_length = input.nextDouble();
		System.out.println("SQUARE: Height [2/2]");
		System.out.print("Please enter an integer number > ");
		input = new Scanner(System.in);
		double square_height = input.nextDouble();
		
		//Make a new square and set values then print name, dimension, and area.
		Square newSquare = new Square ("Square");
		newSquare.setDimensions(square_length, square_height);
		System.out.println("Name: " + newSquare.name);
		System.out.print("Dimensions: "); newSquare.printDimensions();
		System.out.println("Area: " + String.valueOf(newSquare.getArea()));
		System.out.println("------------------------------");
		
		//Circle
		System.out.println("CIRLE: RADIUS [1/1]");
		System.out.print("Please enter an integer number > ");
		input = new Scanner(System.in);
		double circle_radius = input.nextDouble();
		
		//Make a new circle and set values then print name, dimension, and area.
		Circle newCircle = new Circle ("Circle");
		newCircle.setDimensions(circle_radius);
		System.out.println("Name: " + newCircle.name);
		System.out.print("Dimensions: "); newCircle.printDimensions();
		System.out.println("Area: " + String.valueOf(newCircle.getArea()));
		System.out.println("------------------------------");
		
		//Triangle
		System.out.println("TRIANGLE: Hypotenuse [1/3]");
		System.out.print("Please enter an integer number > ");
		input = new Scanner(System.in);
		double tri_hypotenuse = input.nextDouble();
		System.out.println("TRIANGLE: Opposite [2/3]");
		System.out.print("Please enter an integer number > ");
		input = new Scanner(System.in);
		double tri_opposite = input.nextDouble();
		System.out.println("TRIANGLE: Adjacent [3/3]");
		System.out.print("Please enter an integer number > ");
		input = new Scanner(System.in);
		double tri_adjacent = input.nextDouble();
		
		//Make a new Triangle and set values then print name, dimension, and area.
		Triangle newTriangle = new Triangle ("Triangle");
		newTriangle.setDimensions(tri_hypotenuse, tri_opposite, tri_adjacent);
		System.out.println("Name: " + newTriangle.name);
		System.out.print("Dimensions: "); newTriangle.printDimensions();
		System.out.println("Area: " + String.valueOf(newTriangle.getArea()));
		System.out.println("------------------------------");
		
		//Equilateral Triangle
		System.out.println("EQUILATERAL TRIANGLE: Side [1/1]");
		System.out.print("Please enter an integer number > ");
		input = new Scanner(System.in);
		double tri_side = input.nextDouble();
		
		//Make a new EquilateralTriangle and set values then print name, dimension, and area.
		EquilateralTriangle newEquilateralTriangle = new EquilateralTriangle ("Equilateral Triangle");
		newEquilateralTriangle.setDimensions(tri_side, tri_side, tri_side);
		System.out.println("Name: " + newEquilateralTriangle.name);
		System.out.print("Dimensions: "); newEquilateralTriangle.printDimensions();
		System.out.println("Area: " + String.valueOf(newEquilateralTriangle.getArea()));
		System.out.println("------------------------------");
		
		System.out.println("Thank you! Good bye");
		
	}
	
}


public class Square extends Shape {

	public double length;
	public double height;
	public String dimensions;
	
	public Square(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void setDimensions(double l, double h) {
		length = l;
		height = h;
		dimensions = String.valueOf(length) + " x " + String.valueOf(height);
	}
	
	@Override
	public void printDimensions() {
		System.out.println("Dimensions = " + dimensions);
		
	}
	
	@Override
	public double getArea() {
		return length * height;
	}
	
}

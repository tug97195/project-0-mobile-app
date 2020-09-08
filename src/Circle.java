
public class Circle extends Shape{
	public double radius;
	public String dimensions;
	
	public Circle(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void setDimensions(double r) {
		radius = r;
		dimensions = String.valueOf(radius);
	}
	
	@Override
	public void printDimensions() {
		System.out.println("Dimensions = " + dimensions);
		
	}
	
	@Override
	public double getArea() {
		return 3.14159265358979 * (radius * radius);
	}
}


public class Triangle extends Shape {
	
	public double hypotenuse;
	public double opposite;
	public double adjacent;
	public String dimensions;
	
	public Triangle(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void setDimensions(double h, double o, double a) {
		hypotenuse = h;
		opposite = o;
		adjacent = a;
		dimensions = String.valueOf(hypotenuse) + " x " + String.valueOf(opposite) + " x " + String.valueOf(adjacent);
	}
	
	@Override
	public void printDimensions() {
		System.out.println("Dimensions = " + dimensions);
		
	}
	
	@Override
	public double getArea() {
		double perimeter = (hypotenuse + opposite + adjacent) / 2;
		return Math.sqrt( perimeter * (perimeter - hypotenuse) * (perimeter - opposite) * (perimeter - adjacent) );
	}

	
}

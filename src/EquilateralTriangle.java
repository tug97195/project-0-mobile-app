
public class EquilateralTriangle extends Triangle {
	
	public EquilateralTriangle(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
		
	@Override
	public double getArea() {
		
		return (Math.sqrt(3) / 4) * (hypotenuse * hypotenuse);
	}

	
}

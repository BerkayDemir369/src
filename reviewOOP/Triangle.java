package reviewOOP;

public class Triangle extends Shape{
	
	public double side,height;
	
	public Triangle(double side,double height) {
		super("Triangle");
		this.side=side;
		this.height=height;
		area=calculateArea();
		perimeter=calculatePerimeter();
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return (height*side)/2;
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return 3*side;
	}

}

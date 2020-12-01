package day34_Constructors;

public class Floor {

	double width;
	double lenght;

	public Floor(double width, double lenght) {
		if (width < 0) {
			this.width = 0;
		} else {
			this.width = width;
		}
		if (lenght < 0) {
			this.lenght = 0;
		} else {
			this.lenght = lenght;
		}

	}

	public double getArea() {
		
		return  width * lenght;
	}
}

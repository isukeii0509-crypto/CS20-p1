package skillbuilder;

public class Rectangle {
	private double length;
	private double width;

	public Rectangle() {
		length = 1;
		width = 1;
	}

	public Rectangle(double l, double w) {

	}

	public void setLength(double newLength) {
		length = newLength;
	}

	public void setWidth(double newWidth) {
		width = newWidth;
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public double area() {
		return length * width;
	}

	public double perimeter() {
		return (2 * length) + (2 * width);
	}

}

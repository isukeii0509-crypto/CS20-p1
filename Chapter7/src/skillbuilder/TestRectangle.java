package skillbuilder;

public class TestRectangle {

	public static void main(String[] args) {

		Rectangle box1 = new Rectangle();
		Rectangle box2 = new Rectangle(4, 5);

		System.out.println("Box 1 area: " + box1.area());
		System.out.println("Box 1 perimeter: " + box1.perimeter());

		box1.setLength(3);
		box1.setWidth(2);
		System.out.println("Updated Box 1 dimensions: " + box1.getLength() + " x " + box1.getWidth());

		System.out.println("Box 2 area: " + box2.area());
		System.out.println("Box 2 perimeter: " + box2.perimeter());
	}
}
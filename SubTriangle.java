package Interface.Student;

public class SubTriangle implements Shape {

	@Override
	public void Draw() {
		
		System.out.println("Triangle has three sides.");
		
	}

	@Override
	public void GetArea(int intHeight, int intBase) {

		int intArea;
		intArea = (intHeight * intBase)/2;
		System.out.println("The triangle with length " + intHeight + " & " + " breadth " + intBase + " has an area of " + intArea + ".");
		
		
	}

}

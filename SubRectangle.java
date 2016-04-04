package Interface.Student;

public class SubRectangle implements Shape {

	@Override
	public void Draw() {
		
		System.out.println("Rectangle has four sides.");
		
	}

	@Override
	public void GetArea(int intLength, int intBreadth) {
		int intArea;
		intArea = intLength * intBreadth;
		System.out.println("The rectangle with length " + intLength + " & " + " breadth " + intBreadth + " has an area of " + intArea + ".");
		
	}

	
	
}

package Assignment01;

public class TriangleTester{

	public static void main(String args[]){
		Triangle tri = Triangle.makeTriangleWithRadians(Math.PI/3,25,Math.PI/6,7,60,0);
		
		double area = tri.area();
		double x1 = tri.findX1();
		double x2 = tri.findX2();
		double x = tri.findX();
		double y1 = tri.findY1();
		double y2 = tri.findY2();
		double y = tri.findY();
		double c = tri.findC();
		Rectangle newRectangle = tri.doubleAreaRectangle();
		System.out.println(area);
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x);
		System.out.println(y1);
		System.out.println(y2);
		System.out.println(y);
		System.out.println(c);
		System.out.println(newRectangle);

	}
}
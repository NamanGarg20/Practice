package Assignment01;

public class RectangleTester{
	public static void main(String args[]){
		Rectangle rec = new Rectangle(60,25,7,60,0);
		double area = rec.area();
		double x1 = rec.findX1();
		double x2 = rec.findX2();
		double x3 = rec.findX3();
		double y1 = rec.findY1();
		double y2 = rec.findY2();
		double y3 = rec.findY3();
		double c = rec.findC();
		double a = rec.findA();
		Triangle newtriangle = rec.extractTriangle();
		System.out.println("Area:"+" "+area);
		System.out.println("X1:"+x1);
		System.out.println("X2:"+x2);
		System.out.println("X3: "+x3);
		System.out.println("Y1:"+y1);
		System.out.println("Y2:"+y2);
		System.out.println("Y3:"+y3);
		System.out.println("C:"+c);
		System.out.println("alpha:"+a);
		System.out.println("New Triangle: " + newtriangle);
		








	}
}
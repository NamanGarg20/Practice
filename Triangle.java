package Assignment01;

public class Triangle{
	private double refAngle;
	private double sideA;
	private double angle;
	private double sideB;
	private double xBase;
	private double yBase;

   private	Triangle(double angl1, double aSide, double angl2, double bSide, double x, double y){
		this.refAngle = angl1;
		this.sideA = aSide;
		this.angle= angl2;
		this.sideB = bSide;
		this.xBase = x;
		this.yBase = y;
	}
	public static Triangle makeTriangleWithRadians(double angl1, double aSide, double angl2, double bSide, double x, double y) {
		return new Triangle(angl1, aSide, angl2, bSide, x, y);
	}
	
	public static Triangle makeTriangleWithDegrees(double angl1, double aSide, double angl2, double bSide, double x, double y){
		angl1 = Math.toRadians(angl1);
		angl2 = Math.toRadians(angl2);

		return new Triangle(angl1, aSide, angl2, bSide, x, y);
	}
	public double area (){
		double area = (sideA*sideB*Math.sin(angle))/2.0;
		return area;
	}	

	public double findX1(){
		double x1= xBase + sideA*Math.cos(refAngle);
		return x1;
	}

	public double findY1(){
		double y1= yBase + sideB*Math.sin(refAngle);
		return y1;
	}
	public double findX2(){
		double x2= xBase + sideB*Math.cos(refAngle+angle);
		return x2;
			}
	public double findY2(){
		double y2= yBase + sideB*Math.sin(refAngle+angle);
		return y2;
	}
	public double findX(){
		double x1=findX1();
		double x2=findX2();
		double x = x1 - x2;
		return x;

	}

	public double findY(){
		double y1=findY1();
		double y2=findY2();
		double y = y1 - y2;
		return y;

	}
	public double findC(){
		double x=findX();
		double y=findY();

		double c = Math.sqrt(x*x + y*y);
		return c;

	}

	public Rectangle doubleAreaRectangle(){

		sideB = sideB*Math.sin(angle);
		return new Rectangle(refAngle, sideA, sideB, xBase, yBase);
		
	}


}
	

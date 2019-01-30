package Assignment01; 

public class Rectangle{
	private double refAngle;
	private double sideA;
	private double sideB;
	private double xBase;
	private double yBase;

	public Rectangle(double angl1, double aSide, double bSide, double x, double y){
		this.refAngle = angl1;
		this.sideA = aSide;
		this.sideB = bSide;
		this.xBase = x;
		this.yBase = y;
	}

	public double area (){
		double area = sideA*sideB;
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
		double x2= xBase + sideB*Math.cos(refAngle+Math.PI/2);
		return x2;
			}
	public double findY2(){
		double y2= yBase + sideB*Math.sin(refAngle+Math.PI/2);
		return y2;
	}
	public double findX3(){
		double x1=findX1();
		double x2=findX2();
		double x3 = x1 + x2 - xBase;
		return x3;

	}

	public double findY3(){
		double y1=findY1();
		double y2=findY2();
		double y3 = y1 + y2 - yBase;
		return y3;

	}
	public double findC(){
		double x3=findX3();
		double y3=findY3();
		double x = x3 - xBase;
		double y = y3 - yBase;

		double c = Math.sqrt(x*x + y*y);
		return c;

	}

	public double findA(){
		double a = Math.atan(sideB/sideA);
		return a;
	}

	public Triangle extractTriangle(){
		double a=findA();
		double c=findC();
		refAngle= Math.toRadians(refAngle);
		a =Math.toRadians(a);
		sideB = sideB*Math.sin(a);
		Triangle ti = Triangle.makeTriangleWithRadians(refAngle, sideA,a, c, xBase, yBase);
		return ti;
		


		
	}



}


	

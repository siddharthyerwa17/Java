package Overloading;

class Triangle {
	double base;
	double height;
	//constructor is used when all dimensiotion is specified
	
	Triangle(double b,double h) {
		base = b;
		height = h;
	}
	
	Triangle() {
		this.base = 10;
		this.height = 5;
	}
	
	double Area() {
		double area = (base*height)/2;
		return area;
	}
	
	double Area (double base, double height) {
		double area = (base*height)/2;
		return area;
	}
}
public class MyTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t = new Triangle();
		System.out.println("Area with default constuctor and method with no parameters "+t.Area());
		
		Triangle t1 = new Triangle(11.8,56.2);
		System.out.println("Area with parameterized constuctor and method with  parameters"+t1.Area(t1.base,t1.height));
	}

}

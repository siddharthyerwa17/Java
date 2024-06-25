package pack_overload_demo;

class OverloadDemo{
	void test () {
		System.out.println("No parameter");
	}
	void test(int a) {
		System.out.println("a :"+a);
	}
	void test (int a,int b) {
		System.out.println("a and b: " +a+ " " +b);
	}
	double test (double a) {
		System.out.println("double a" +a);
		return a*a;
	}
}

public class Overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadDemo od = new OverloadDemo();
		double result;
		
		//call all the test
		od.test();
		od.test(10);
		od.test(20);
		result = od.test(125.25);
		System.out.println("result " +result);
	}

}

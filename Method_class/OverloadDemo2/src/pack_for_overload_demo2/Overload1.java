package pack_for_overload_demo2;


class OverloadDemo2{
	void test() {
		System.out.println("No parameters ");
	}
	
	void test(int a, int b) {
		System.out.println("a and b: "+a+" "+b );
	}
	
	void test(double a) {
		System.out.println("Inside test (double a) :"+a);
	}
	
}

public class Overload1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadDemo2 od= new OverloadDemo2 ();
		int i =88;
		od.test();
		od.test(20, 30);
		
		od.test(i);
		od.test(125.25);
		
	}

}

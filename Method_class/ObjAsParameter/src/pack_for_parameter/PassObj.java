package pack_for_parameter;

class Test {
	int a,b;
	Test (int i, int j){
		a = i;
		b = j;
	}
	
	boolean equals (Test o) {
		if (o.a == a && o.b == b) {
			return true;
		}else {
			return false;
		}
	}
}
public class PassObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test obj1 = new Test(145,25);
		Test obj2 = new Test(145,25);
		Test obj3 = new Test(-1,-1);
		
		System.out.println("ob1 == obj2 "+obj1.equals(obj2));
		
		System.out.println("0bj1 == 0bj3 "+obj1.equals(obj3));
	}

}

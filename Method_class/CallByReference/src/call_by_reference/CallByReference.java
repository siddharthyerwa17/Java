package call_by_reference;

class Test {
	int a,b;
	
	Test (int i, int j) {
		a = i;
		b = j;
	}
	
	void meth(Test o) {
		o.a*= 2;
		o.b/=2;
		
		System.out.println("o.a = "+o.a+ "and o.b = "+o.b);
	}
}
public class CallByReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test(15,30);
		
		System.out.println("o.a and o.b before call "+t.a+ " "+t.b);
		
		t.meth(t);
		System.out.println("o.a and o.b after call "+t.a+ " "+t.b);
	}

}

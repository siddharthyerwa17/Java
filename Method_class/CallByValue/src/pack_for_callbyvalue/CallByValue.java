package pack_for_callbyvalue;

class Test {
	void meth(int i,int j) {
		i*=2;
		j/=2;
		System.out.println("i = "+i+ "and j = "+j);
	}
}
public class CallByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		
		int a=15,b=2;
		
		System.out.println("A and B beforee call "+a+ " "+b);
		
		t.meth(a, b);
		
		System.out.println("a and b after call "+a+ " " +b);
	}

}

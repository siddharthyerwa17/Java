package pack_for_accesscontrol;


class Test {
	int a; //by default public
	public int b; //
	private int c; //private access

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}



void setc(int i) {
	c=i;
}
}
public class AccessTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.a = 12;
		t.b = 23;
		t.setC(250);
		
		System.out.println("a b and c :"+t.a+" "+t.b+" "+t.getC());
	}

}

package pack_box_demo;

class Boxy{
	double width;
	double depth;
	double height;
	
	void volume() {
		System.out.print("vol");
		System.out.println(width*depth*height);
	}
}
public class Box {
	public static void main(String args[]) {
		Boxy B1 = new Boxy();
		Boxy B2 = new Boxy();
		
		double ans1;
		double ans2;
		
		B1.width = 10;
		B1.depth = 20;
		B1.width = 10;
		
		B2.width = 5;
		B2.depth = 4;
		B2.width = 3;
		//compute volume of box
		
		B1.volume();
//		ans1 = B1.width*B1.depth*B1.height;
//		ans2 = B2.width*B2.depth*B2.height;
//		
//		System.out.println("volume is" +ans1);
//		System.out.println("volume " +ans2);
	}
}

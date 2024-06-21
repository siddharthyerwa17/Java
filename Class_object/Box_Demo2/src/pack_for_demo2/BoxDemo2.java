package pack_for_demo2;

class Box {
	double width;
	double height;
	double depth;
	
	Box(double width,double height, double depth){
		System.out.println("Contructing box");
		this.width = 10;
		this.height = 20;
		this.depth = 15;
	}
	double volume() {
		return width*height*depth;
	}
	
}
public class BoxDemo2 {

	public static void main(String[] args) {
		Box b1 = new Box();
		Box b2 = new Box();
		
		double vol;
		
//		first box volume
		vol = b1.volume();
		System.out.println("volume of first box" +vol);
		
//	 	second box
		vol = b2.volume();
		System.out.println("volume of second box" +vol);

	}

}

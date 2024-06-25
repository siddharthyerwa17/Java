package pack_for_overload_const;

class Box {
	
	
	double width;
	double height;
	double depth;
	
	//all dimension
	Box(double w, double h, double d){
		width =  w;
		height = h;
		depth =  d;
	}
	// no dimension	
	Box() {
		width = -1; //to indicate box is uninitialized
		height = -1; //to indicate box is uninitialized
		depth = -1; //to indicate box is uninitialized
	}
	
	//constructor when cube is created
	Box(double len) {
		width = height = depth = len;
	}
	
	double volume() {
		return width * height* depth;
	}
}
public class OverloadConstructor {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box mybox1 =  new Box(10,20,30);
		Box mybox2 =  new Box();
		Box mybox3 =  new Box(7);
		
		double vol;
		
		vol = mybox1.volume();
		System.out.println("Volume of mybox is :" +vol);
		
		vol = mybox2.volume();
		System.out.println("Volume of mybox2 is :" +vol);
		
		vol = mybox3.volume();
		System.out.println("Volume of mybox3 is :" +vol);
		
	}

}

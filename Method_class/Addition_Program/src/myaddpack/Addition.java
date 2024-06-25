package myaddpack;

class Add {
	int a=0,b=0;
	
	int add() {
		int final_value = 0;
		final_value = a+b;
		return final_value;
	}
	
	int add(int my_a,int my_b) {
		return my_a+my_b;
	}
	
	float addition(float my_a,float my_b) {
		return my_a+my_b;
	}
}
public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add a = new Add();
		a.a = 10;
		a.b = 50;
		
		int addition_of_int_const_value = 0;
		int additon_of_two_int = 0;
		float addition_of_two_float = 0;
		
		System.out.println("Hello World");
		
		addition_of_int_const_value = a.add();
		System.out.println("Addition of a and b :"+addition_of_int_const_value);
		System.out.println("Hello world again and again ....");
		
		additon_of_two_int = a.add(45, 48);
		addition_of_two_float = a.addition(56.50f, 65.2f);
		System.out.println("Addition of two integer :"+additon_of_two_int);
		System.out.println("Addition of two float :"+addition_of_two_float);
		
		if(addition_of_int_const_value>additon_of_two_int) {
			System.out.println("addition_of_int_const_value which is "+addition_of_int_const_value);
		}else if (additon_of_two_int>addition_of_int_const_value) {
			System.out.println("addition_of_two_int which is "+additon_of_two_int);
		}else {
			System.out.println("Nobody is greater");
		}
	}

}

package package_if_else;

public class ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month =6;
		String season;
		
		if (month==12 || month==1 || month==2)
		{
			season = "winter";
		}else if(month ==3 || month==4 || month==5)
		{
			season = "spring";
		}else if(month==6 || month==7 || month==8)
		{
			season = "summer";
		}else if(month==9 || month==10 || month==11)
		{
			season = "autum";
		}
		else 
			season = "Bogus month";
		
		System.out.println("June is in the "+season + "season");
		
	}

}

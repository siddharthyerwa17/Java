package pack_for_switch_case;

public class Season_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month =4;
		String season;
		
		switch(month)
		{
		case 0:
		case 1:
		case 2:
		case 3:
			season = "winter";
			break;
		case 4:
		case 5:
		case 6:
		case 7:
			season = "summer";
			break;
		case 8:
		case 9:
		case 10:
		case 11:
			season = "rain";
			break;
			
			default : season = "Bogus";
			
		}
		System.out.println("april is in the " +season +".");
	}

}

package pack_menu;

public class Menu {
	public static void main (String[] args)throws java.io.IOException{
		char choice;
		
		do
		{
			System.out.println("Help on :");
			System.out.println("1 If :");
			System.out.println(" 2 Switch :");
			System.out.println("3 while : ");
			System.out.println("4 dowhile :" );
			System.out.println("5 for :");
			
			choice= (char)System.in.read();			
		}while (choice<'1'||choice>'5');
		System.out.println("\n");
		
		switch(choice)
		{
		case '1' :
			System.out.println("the if :\n");
			System.out.println("if(codition)statement");
			System.out.println("else statement");
			break;
			
		case '2' :
			System.out.println("switch :\n");
			System.out.println("switch (expression){}");
			System.out.println("case constant :");
			System.out.println("statement sequence ");
			System.out.println("break");
			break;
			
		case '3' : System.out.println("the while : \n");
		System.out.println("while (conditon) statement");
		break;
		
		case '4' :
			System.out.println("do while \n");
			System.out.println("do {");
			System.out.println("statement;");
			System.out.println("} while (condition);");
			break;
			
		case 5 : System.out.println("the for \n");
		System.out.println("for(init ; condition ; iteration");
		System.out.println("statement");
		break;
		}
	}
	
	
}

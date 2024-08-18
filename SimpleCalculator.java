import java.util.Scanner;
public class SimpleCalculator{
	private static double add(double x,double y){
		return x+y;
	}
	private static double subtract(double x,double y){
		return x-y;
	}
	private static double multiply(double x,double y){
		return x*y;
	}
	private static double division(double x,double y){
		return x/y;
	}
	
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("************************************************************************************************************************");
		System.out.println("\t\t\t\t\t Welcome to Simple Console Calculator");
		System.out.println("************************************************************************************************************************");
		while(true){
			System.out.println("Available operators are:");
			System.out.println("0. Quit");
			System.out.println("1. Add");
			System.out.println("2. Subtract");
			System.out.println("3. Multiply");
			System.out.println("4. Division");
			System.out.println("Enter operation (1/2/3/4) or Enter 0 to exit:");
			
			String input=scanner.nextLine().trim().toLowerCase();
			
			if(input.equals("0")){
				System.out.println("Exiting the calculator......");
				break;
			}
			
			
			int operation=0;
			try{
				operation=Integer.parseInt(input);
				if(operation<1||operation>4){
					System.out.println("Invalid operation. Please enter 1,2,3 or 4.");
					continue;
				}
			}catch(NumberFormatException e){
				System.out.println("Invalid input. Please enter a number between 1 and 4 or 'Quit' to exit.");
				continue;
			}
			
			double number1=0;
			double number2=0;
			
			try{
				System.out.println("Enter first number: ");
				number1=Double.parseDouble(scanner.nextLine());
				System.out.println("Enter second number: ");
				number2=Double.parseDouble(scanner.nextLine());
			}
			catch(NumberFormatException e){
				System.out.println("Invalid number format. Please enter valid numbers.");
			}
			
			double result=0;
			switch(operation){
				case 1:
					result=add(number1,number2);
					break;
				case 2:
					result=subtract(number1,number2);
					break;
				case 3:
					result=multiply(number1,number2);
					break;
				case 4:
					if(number2==0)
						System.out.println("Error: Division by zero is not allowed.");
					else
						result=division(number1,number2);
					break;
				default:
					System.out.println("Unknown operation.");
					break;
			}
			System.out.println("Result: "+result);
			System.out.println("\t\t*****************************************");
		
		}
		scanner.close();
	}
	
	
}
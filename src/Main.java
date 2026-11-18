import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Display Welcome Message
		System.out.println("Welcome to Java Calculator!");
		Scanner input = new Scanner(System.in);
		
		String answer;
		do {
			//Ask the user to enter the first number
			System.out.print("Enter First Number: ");
			double firstNum = input.nextDouble();
			
			//Ask the user to enter the second number
			System.out.print("\nEnter Second Number: ");
			double secondNum = input.nextDouble();
			
			//Let the user choose addition(+), subtraction(-), multiplication(*), or division(/)
			System.out.print("\nChoose an operation:\n1.Addition(+)"
					+ "\n2.Subtraction(-)\n3.Mulitplication(*)\n4.Division(/) ");
			int choice = input.nextInt();
			
			
			//Calculate and display the correct result
			switch(choice) {
			case 1: 
				System.out.println("\nAddition(+) selected");
				double result = firstNum + secondNum;
				System.out.print("\nResult: " + result);
				break;
				
			case 2:
				System.out.println("\nSubtraction(-) selected");
				double result2 = firstNum - secondNum;
				System.out.print("\nResult: " + result2);
				break;
			
			case 3:
				System.out.println("\nMultiplication(*) selected");
				double result3 = firstNum * secondNum;
				System.out.print("\nResult: " + result3);
				break;
		
			//Handle division by zero
			case 4:
				System.out.println("\nDivision(/) selected");
				if(secondNum == 0) {
					System.out.print("Cannot divide by zero, please try again!");
				}
				else {
					double result4 = firstNum / secondNum;
					System.out.print("\nResult: " + result4);
				}
				break;
			
			default:
				System.out.print("Invalid, please select a number between 1-4");
			}
			System.out.print("\nCalculate again? (Y/N): ");
			answer = input.next();
			//Allow the user to perform another calculation without restarting the program.
		}while(answer.equalsIgnoreCase("Y"));
		
		input.close();
	}

}

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double num1;
		double num2;
		int operator;
		double result = 0;
		boolean isValidOperator;
		
		System.out.print("Enter the first number: ");
		num1 = scanner.nextDouble();
		
		System.out.print("Enter an operator (+, -, *, /, ^): ");
		operator = scanner.next().charAt(0);
		
		System.out.print("Enter the secomd number: ");
		num2 = scanner.nextDouble();
		
		switch(operator) {
		case '+' -> result = num1 + num2;
		case '-' -> result = num1 - num2;
		case '*' -> result = num1 * num2;
		case '/' -> {
			if(num2 == 0) {
				System.out.println("cannot divide by 0!");
				isValidOperator =  false;
			}
			else {
				 result = num1 / num2;
			}
		}
		case '^' -> result = Math.pow(num1, num2);
		default  -> {
			System.out.println("inavlid operator");
		}
		}
		System.out.println(result);
		scanner.close();
	}

}

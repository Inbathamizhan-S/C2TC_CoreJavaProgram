package inba.practiceCode;
import java.util.Scanner;

//if else and comparison opr for integers:

public class IfElse_ConditinalStatements {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no1:");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the no2:");
		int num2 = sc.nextInt();
		
		if(num1 == num2) {
			System.out.println("Both numbers are equal");
		}
		
		else {
			System.out.println("The number are not equal");
		}
	}
	
	

}

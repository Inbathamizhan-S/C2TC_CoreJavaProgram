package inbapractice.codingchallenge;
import java.util.Scanner;


public class CodingChallenge6 {
	//Q- get i/p for salary and age.if sal>=20000 or age<=25,get i/p for req loan amount,else print- ur not eligible
	//   if req amount is<=50000 print ur eligible,is greater print-max amount is 50000.

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ur salary:");
		int salary = sc.nextInt();
		
		System.out.println("Enter ur age:");
		int age = sc.nextInt();
		
		if(salary>=20000 || age<=25) {
			System.out.println("you are eligible");
			System.out.println("Enter ur loan amount:");
			int loan = sc.nextInt();
			if(loan<=50000) {
				System.out.println("your eligible for loan");
			}
			else if(loan>50000) {
				System.out.println("max loan amount is 50000");
			}
			
		}
		else {
			System.out.println("no loan ");
		}
		
		
		
		
		
		
		
	}
	
}

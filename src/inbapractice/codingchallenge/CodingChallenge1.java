package inbapractice.codingchallenge;
import java.util.Scanner;


public class CodingChallenge1 {
//Q1 - Get i/p from user for var mark.if mark > 35 print pass else fail

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your mark:");
		
		int mark = sc.nextInt();
		if(mark >= 35) {
			System.out.println("your pass");
		}
		else {
			System.out.println(" your fail");
		}
		
		
	}
	
	
}


package inbapractice.codingchallenge;
import java.util.Scanner;


public class CodeChallenge3 {

//Q- get i/p from user and find the no is odd or even number
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number");
		int number = sc.nextInt();
		
		if(number%2 == 0) {
			System.out.println(" the number is even:"+number);
			
		}
		else {
			System.out.println("the number is odd:"+number);
		}
		
		
		
		
	}

	
	
}

package inbapractice.codingchallenge;
import java.util.Scanner;


public class CodeChallenge7 {
	//for loop
	
	//get i/p from user start no and end number amd print it
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter starting no:");
		int a = sc.nextInt();
		System.out.println("Enter end no:");
		int b = sc.nextInt();
		
		for(int i = a; i<=b; i=i+1) {
			
			System.out.println(i);
		}
	}
	

}

package inbapractice.codingchallenge;
import java.util.Scanner;


public class CodeChallenge11 {
	public static void main(String[] args) {
		//Q- print 2 tables using a for loop
		
//		for(int i =1;i<=10;i=i+1) {
//			System.out.println(i+"x2="+i*2);
//		}
//		
		
		
		//Q-get i/p from user and print the tables as per the user input
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i =1;i<=10;i=i+1) {
			
			System.out.println(i+"x5="+i*a);
			
			
		}
		
		
	}

}

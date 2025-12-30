package inbapractice.codingchallenge;
import java.util.Scanner;


public class CodeChallenge10 {
	//Q-get 10 int as input and print it using for loop in array
	
	public static void main(String[] args) {
		
		int[] values = new int[10];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<=9;i=i+1) {
			
			values[i] = sc.nextInt();
			
		}
		
		for(int i =0;i<=9;i=i+1) {
			
			System.out.println("the values stored are:"+values[i]);
		}
	}

}

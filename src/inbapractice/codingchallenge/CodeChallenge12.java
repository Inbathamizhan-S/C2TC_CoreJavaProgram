package inbapractice.codingchallenge;
import java.util.Scanner;


public class CodeChallenge12 {
	public static void main(String[] args) {
//Q-get i/p from the user for size on array,get i/p for each elements in array and find mid
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the array size:");
		int a = sc.nextInt();
		int[] numbers = new int[a];
		
		System.out.println("enter values to store:");
		for(int i = 0;i<a;i=i+1) {
			numbers[i] = sc.nextInt();
			
			}
		
		int midIndex = numbers.length / 2;
		System.out.println("Middle value is: " + numbers[midIndex]);

		
		
		
		
		
	}

}

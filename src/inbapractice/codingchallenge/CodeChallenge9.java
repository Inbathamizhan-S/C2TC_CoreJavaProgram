package inbapractice.codingchallenge;
import java.util.Scanner;


public class CodeChallenge9 {
public static void main(String[] args) {
	
	//Q- get i/p for 5 numbers using array and for loop
	
	
	int[] marks = new int[5];
	
	Scanner sc = new Scanner(System.in);
	
	for(int i=0;i<=4;i=i+1) {
//		marks[0] = sc.nextInt();
//		marks[1] = sc.nextInt();
//		marks[2] = sc.nextInt();
//		marks[3] = sc.nextInt();
//		marks[4] = sc.nextInt();
		
		marks[i] = sc.nextInt();
	}
	
	for(int i = 0;i<=4;i=i+1) {
		
		System.out.println("the marks are:"+marks[i]);
		
	}
//	System.out.println("the values stored are:");
//	System.out.println(marks[0]);
//	System.out.println(marks[1]);
//	System.out.println(marks[2]);
//	System.out.println(marks[3]);
//	System.out.println(marks[4]);
	
	

	

	
}
}

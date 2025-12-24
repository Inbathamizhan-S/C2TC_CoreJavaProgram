package inbapractice.codingchallenge;
import java.util.Scanner;


public class CodeChallenge2 {
	/* Q-get i/p from user check whether the no is divisible by 3&5 or not
	 * if yes print the no is divisible +no else print not divisible
	 */
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter no:");
	int num = sc.nextInt();
//System.out.println("enter no:");
//int num2 = sc.nextInt();
	
	if(num%3 == 0 && num%5 == 0)
	{
		System.out.println("no is divisible by 3 and 5:"+num);
		
	}
	else {
		System.out.println("not divisible");
		
	}
}
}

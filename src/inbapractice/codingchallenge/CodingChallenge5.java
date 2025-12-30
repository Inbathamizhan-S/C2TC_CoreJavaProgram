package inbapractice.codingchallenge;
import java.util.Scanner;


public class CodingChallenge5 {
	
	public static void main(String[] args) {
		
//Q- get i/p for 5 subject, add all and find avg,if avg<35 print-need additional cls,
		//else print-your good to go
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter mark in tamil:");
		
		int sub1mark = sc.nextInt();
		
		System.out.println("enter mark in englis:");
		
		int sub2mark = sc.nextInt();
		
		System.out.println("enter mark in maths:");
		
		int sub3mark = sc.nextInt();
		
		System.out.println("enter mark in science:");
		
		int sub4mark = sc.nextInt();
		
		System.out.println("enter mark in social:");
		
		int sub5mark = sc.nextInt();
		
		
		int avg = (sub1mark+sub2mark+sub3mark+sub4mark+sub5mark)/5;
		System.out.println("the avg mark is:"+avg);
		
		if(avg<35) {
			System.out.println("you need additional class");
		}
		else {
			System.out.println("your good to go");
		}
		
		
		
	}

}

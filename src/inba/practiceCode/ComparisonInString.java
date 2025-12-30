package inba.practiceCode;
import java.util.Scanner;


public class ComparisonInString {
	
	public static void main(String[] args) {
//Q1 get i/p from user for var = RCB,if RCB==win print("cup namde") if RCB==lose print("cup nahi")
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the status:");
		
		String name = sc.nextLine();
		
		
		if(name.equals("win")) {
			System.out.println("cup namde");
			
		}
		if(name.equals("lose")){
			System.out.println("cup nahi");
			
		}
		
		
		
		
		
	}

}

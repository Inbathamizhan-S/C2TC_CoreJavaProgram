package inba.practiceCode;
import java.util.Scanner;

public class Testques_StringComparison {
	
//Q-get i/p from user for var "Neymar".if neymar is "injured"-print("he will not play Wc-26")
//else print("he will play WC-26")
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the player Status:");
		String neymar = sc.nextLine();
		if(neymar.equals("injured")) {
			
			System.out.println("he will not play wc-26");
		}
		else {
			System.out.println("he will  play wc-26");
			
		}
	}
		
		
		
	}



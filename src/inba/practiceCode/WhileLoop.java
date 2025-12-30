package inba.practiceCode;
import java.util.Random;
import java.util.Scanner;

public class WhileLoop {
	
	public static void main(String[] args) {
		
		/*Random rand = new Random();
		
		int num = 0;
		while(num!=5) {
			
			num = rand.nextInt(11);
			System.out.println(num);
		}*/
	
	
	//do while
		
		Scanner sc = new Scanner(System.in);
		int count  = 0;
		do{
			System.out.println("Enter a number>10:");
			count = sc.nextInt();
			
		}while(count <10);
	
	}

}

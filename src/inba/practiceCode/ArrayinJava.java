package inba.practiceCode;
import java.util.Scanner;

public class ArrayinJava {
	public static void main(String[] args) {
		
//		String[] playlist = new String[3];
//		
//		playlist[0] = "song1";
//		playlist[1] = "song2";
//		playlist[2] = "song3";
//		
//		System.out.println(playlist[0]);
		
		
		
		int[] number = new int[5];
	    
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 numbers:");
		number[0] = sc.nextInt();
		number[1] = sc.nextInt();
		number[2] = sc.nextInt();
		number[3] = sc.nextInt();
		number[4] = sc.nextInt();
		
		System.out.println("the total is:"+(number[0]+number[1]+number[2]+number[3]+number[4]));
		
		
		
	}

}

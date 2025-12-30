package inbapractice.codingchallenge;

public class CodeChallenge8 {
	//for loop
	//Q- print even no b/w 1 - 10.using for loop and if else and print the count.
	
	public static void main(String[] args) {
		int evencount = 0;
		
		for(int i=1;i<=10;i=i+1) {
			
			if(i%2 == 0) {
				evencount = evencount+1;
				
				System.out.println("even numbers are:"+i);
			}
			System.out.print("the even numbers count is:");
			System.out.println(evencount);
			
			}
		}
	}



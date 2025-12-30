package inbapractice.codingchallenge;

public class CodeChallenge4 {
	public static void main(String[] args) {
		
//Q- get input as score if score is <50 prinrt-u need to improve,
//   if score is b/w 50 & 70 print-goodjob,score>70 print-excellent!!
		
		
		int score = 60;
		
		if(score<50) {
			System.out.println("u need to improve");
		}
		
		else if(score >=50 && score <=70) {
			System.out.println("good job");
		}
		
		else if(score>70) {
			System.out.println("Excellent");
		}
		
	}

}

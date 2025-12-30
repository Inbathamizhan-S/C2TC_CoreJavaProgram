package inba.practiceCode;

public class Return_Keyword {
	
	int sum(int a , int b) {
		int c = a+b;
		return c;
	}
	public static void main(String[] args) {


		Return_Keyword result = new Return_Keyword();
		
		int sum = result.sum(10, 15);
		
		System.out.println(sum);
		
		
		
	}

}

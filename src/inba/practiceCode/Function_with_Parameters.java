package inba.practiceCode;

public class Function_with_Parameters {
	//store
	void get_choki(int money) {
		System.out.println(money);
		System.out.println("choki purchased");
		
	}
	void get_powder(int money) {
		System.out.println(money);
		System.out.println("powder purchased");
		
	}
	
	
	public static void main(String[] args) {
		
		Function_with_Parameters store = new Function_with_Parameters();
		store.get_choki(15);
		store.get_powder(20);
		
	}
	
	//example sum-1
	
//	void sum(int num1,int num2) {
//		
//		System.out.println(num1+num2);
//		
//	}
//    public static void main(String[] args) {
//    Function_with_Parameters add = new Function_with_Parameters();
//    add.sum(10,20);
//    	
//    }
	
	//example sum-2
//	void sub(int num1,int num2) {
//		System.out.println(num1 - num2);
//	}
//	void mul(int num1,int num2) {
//		System.out.println(num1*num2);
//	}
//	void div(int num1,int num2) {
//		System.out.println(num1/num2);
//	}
//	public static void main(String[] args) {
//    Function_with_Parameters math = new Function_with_Parameters();
//    
//    math.sub(10, 5);
//    math.mul(10, 5);
//    math.div(10, 5);
//    
//	}

	
	
}

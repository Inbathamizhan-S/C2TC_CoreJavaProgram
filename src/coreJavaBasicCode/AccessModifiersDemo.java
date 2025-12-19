package coreJavaBasicCode;

public class AccessModifiersDemo {
	
	public int publicVar = 10;
	protected int protectedVar = 20;
	private int privateVar =30;
	int defaultvar =40;
	
	public void showDetails() {
		System.out.println("public:" +publicVar);//any class,package,subclass
		System.out.println("private:" +privateVar);//same_class
		System.out.println("protectedVar:" +protectedVar);//same class ,subclass,same pakage
	}
	
	
	
	public static void main(String[]args) 
	
	{
		AccessModifiersDemo amd = new AccessModifiersDemo();
		amd.showDetails();
		
	}
}

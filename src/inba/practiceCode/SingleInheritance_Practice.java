package inba.practiceCode;


class Football{
	void display() {
		
		System.out.println("This is Parent class:Football");
	}
}
class Neymar extends Football{
	void show() {
		System.out.println("This is child1 class:Neymar");
	
	}
}


public class SingleInheritance_Practice {

	public static void main(String[] args) {
		Neymar n = new Neymar();
		n.display();
		n.show();

}
	}

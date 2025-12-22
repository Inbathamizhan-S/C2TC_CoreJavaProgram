package inba.practiceCode;

//METHOD OVERLOADING

class PolymorphismPractice{

    // Method with 2 parameters
    int add(int a, int b) {
        return a + b;
    }

    // Method with 3 parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with double parameters
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

    	PolymorphismPractice p = new PolymorphismPractice();

        System.out.println("Add 2 ints: " + p.add(10, 20));
        System.out.println("Add 3 ints: " + p.add(10, 20, 30));
        System.out.println("Add 2 doubles: " + p.add(10.5, 20.5));
    }
}









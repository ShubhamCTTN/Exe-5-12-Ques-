//Demonstrate the use of private methods in interfaces

package exe5;

interface Java {
	default void get(int a, int b) {
		mul(a,b);
		add(a,b);
	}

	private void mul(int a, int b) {
		System.out.println("Answer is provided by the private method : ");
		System.out.println(a*b);
	}
	
	private void add(int a, int b) {
		System.out.println("Answer is provided by the private method : ");
		System.out.println(a+b);
	}
}

public class Question1 implements Java {
	public static void main(String[] args) {
		Java obj1 = new Question1();
		obj1.get(4,2);
	}

}
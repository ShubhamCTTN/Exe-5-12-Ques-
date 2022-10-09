//Use rangeClosed to create a  Stream

package exe5;

import java.util.stream.*;

public class Question3 {

	public static void main(String[] args) {

		System.out.println("Stream.rangeClosed()");
		// Printing the numbers using rangeClosed method
		IntStream.rangeClosed(1, 10).forEach(i -> System.out.print(i + " "));
	}

}

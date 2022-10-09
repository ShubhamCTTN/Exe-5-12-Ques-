//Perform takeWhile and dropWhile operations on stream

package exe5;

import java.util.*;

public class Question2 {

	public static void main(String[] args) {
		// Converting array as a list
		List<Integer> OrderedList = Arrays.asList(1, 3, 5, 7, 9, 13, 16, 17, 19);

		System.out.println("takeWhile");
		// Performing takeWhile operation
		OrderedList.stream().takeWhile(e -> e % 2 != 0).forEach(e -> System.out.println(e));

		System.out.println("dropWhile");
		// Performing dropWhile operation
		OrderedList.stream().dropWhile(e -> e % 2 != 0).forEach(e -> System.out.println(e));

	}

}

//Use iterator stream method to generate a stream

package exe5;

import java.util.stream.IntStream;

public class Question4 {
	public static void main(String[] args) {
		// generating number stream using iterate method
		IntStream.iterate(0, i -> i < 10, i -> i + 1).forEach(System.out::println);
	}
}


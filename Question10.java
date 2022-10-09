//Demonstrate the use of repeat, strip, isBlank, indent, transform, stripIndent, translateEscapes, formatted String methods.

package exe5;

public class Question10 {

	public static void main(String[] args) {

		System.out.println("REPEAT EXAMPLE");
		String string = "My name is Shubham!!!";
		// It will print the given string 3 times
		System.out.println(string.repeat(3));

		System.out.println();

		System.out.println("TRIM EXAMPLE");
		String whiteSpaceString = "     Helllo There     ";
		// It will remove the white space from the string
		System.out.println(whiteSpaceString.trim());

		System.out.println();

		System.out.println("STRIP EXAMPLE");
		String unicodeSpaceString = "\u2005\u2005hello There     \n";
		// This method will print the string with white space
		System.out.println("Before Strip = " + unicodeSpaceString);
		// It removes the white space & Capitalize the string e.g Hello There
		System.out.println("After Strip = " + whiteSpaceString.strip());

		System.out.println("\nISBLANK EXAMPLE");
		String isBlankString = "   ";
		// It will return true if string is blank otherwise false
		System.out.println(isBlankString.isBlank());

		System.out.println("\nINDENT EXAMPLE");
		String s = "This is my sentence.";
		System.out.println(s);
		s = s.indent(10);
		System.out.println(s);
		s = s.indent(-5);
		System.out.println(s);

		System.out.println();

		System.out.println("TRANSFORM EXAMPLE");
		// String used in first example will be reversed
		String transformMethod = string.transform(stringTemp -> new StringBuilder(stringTemp).reverse().toString());
		System.out.println(transformMethod);

		System.out.println();

		System.out.println("STRIP INDENT EXAMPLE");
		String stripString = "    Hello There Strip the Indent";
		// It removes the white spaces from the start and end of a string line.
		stripString = stripString.stripIndent();
		System.out.println(stripString);

		System.out.println();

		System.out.println("TRANSLATE ESCAPES EXAMPLE");
		String str = "\"Hello There\"";
		// It will print the double quotes
		System.out.println(str.translateEscapes());

		System.out.println();

		String lname = "Chaurasia";
		System.out.println("FORMATTED STRING EXAMPLE");
		// It will concatenate two strings
		System.out.println(String.format("I am Shubham %s", lname));
	}
}

package session7.assignment2;

public class ExceptionNumberFormat {

	public static void main(String[] args) {

		try {
			int num = Integer.parseInt("Hello");
			System.out.println(num);

		} catch (NumberFormatException e) {

			System.out.println("cannot parse a string to an interger\n" + e);
		}
		
		System.out.println("Control flow continues...");
	}

}

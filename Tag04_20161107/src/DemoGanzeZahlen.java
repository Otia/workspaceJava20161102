
public class DemoGanzeZahlen {

	public static void main(String[] args) {

		demoOctal();
		demoHexadecimal();
	}

	public static void demoOctal() {
		// Octal Literals
		// Octal integers use only the digits 0 to 7. In Java, you represent
		// an integer in octal form by placing a zero in front of the number,
		// as follows:

		int zero = 00; // Equal to decimal 6
		System.out.println("Octal 00 = " + zero);

		int six = 06; // Equal to decimal 6
		System.out.println("Octal 06 = " + six);

		int seven = 07; // Equal to decimal 7
		System.out.println("Octal 07 = " + seven);

		int eight = 010; // Equal to decimal 8
		System.out.println("Octal 010 = " + eight);

		int nine = 011; // Equal to decimal 9
		System.out.println("Octal 011 = " + nine);

		int thirteen = 015; // Equal to decimal 9
		System.out.println("Octal 015 = " + thirteen);

		int twenty = 024; // Equal to decimal 20
		System.out.println("Octal 024 = " + twenty);
	}

	public static void demoHexadecimal() {

		// Hexadecimal (hex for short) numbers are constructed
		// using 16 distinct symbols. Because we never invented single digit
		// symbols for the 		
		// numbers 10 through 15, we use alphabetic characters to represent
		// these digits.
		// Counting from 0 through 15 in hex looks like this:
		// 0 1 2 3 4 5 6 7 8 9 a b c d e f
		
		int x = 0X0001;
		int y = 0x7fffffff;
		int z = 0xDeadCafe;
		System.out.println("x = " + x + " y = " + y + " z = " + z);
		
		long jo = 110599L;
		long so = 0xFFFFl; // Note the lowercase 'l'
		System.out.println("jo: " + jo + " so: " + so);
	}

}

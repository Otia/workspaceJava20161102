
public class DemoChars {
	public static void main(String[] args) {
		
		deklarationenChars();
		
		char char1 = 'A';
		System.out.println("char1 " + char1);
		System.out.println("(int)char1 " + (int)char1);
		int iA = 65;
		System.out.println("(char)(iA+1)" + (char)(iA+1));
		System.out.println("(char)(63)" + (char)(63));
		
		char letterN = '\u004E';
		System.out.println(letterN);
		
		char a = 0x892; // hexadecimal literal
		System.out.println("a: " + a);
		
		char b = 982; // int literal
		System.out.println("b: " + b);
		System.out.println("Int Max Value: " + Integer.MAX_VALUE);
		char c = (char)70000; 
		// The cast is required; 70000 is
		// out of char range: 70000>65535
		System.out.println(c);
		
		char d = (char) -98;
		System.out.println(d + " " +(int)d );
		
		char e = (char)-29;
		
		//Java ist auch eine Insel
		byte byte1 = 'b';
		char char2 = (char)byte1;
		
	}
	
	public static void deklarationenChars(){
		
		char char1 = 'A';
		System.out.println("char1: " + char1);
		// char1: A
		
		char charMin = Character.MIN_VALUE;
		//Smallest value of type char '\u0000'
		System.out.println("(int)charMin: " + (int)charMin);
		// charMin:
		// (int)charMin: 0
		
		char charMax = Character.MAX_VALUE;
		//Smallest value of type char '\uFFFF'
		System.out.println("charMax: " + charMax);
		System.out.println("(int)charMax: " + (int)charMax);
		// charMax: ?
		// (int)charMax: 65535
		
	}
}

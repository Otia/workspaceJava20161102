/** 
 * 
 *  Ganze Zahlen: byte, short, int, long
 *
 */
public class DemoGanzeZahlen {

	public static void main(String[] args) {
		deklarationenByte();
		deklarationenShort();
		deklarationenInt();
		deklarationenLong();
	}

	public static void deklarationenByte(){
		
		byte byte1 = 10;
	    System.out.println("byte1: " + byte1);
	    // byte1: 10
	    
	    byte byteMin = Byte.MIN_VALUE;
	    System.out.println("byteMin: " + byteMin);
	    // byteMin: -128
	    
	    byte byteMax = Byte.MAX_VALUE;
	    System.out.println("byteMax: " + byteMax);
	    // byteMax: 127
	    
	    long zahl4 = 40;
	    System.out.println(zahl4 + zahl4);
	}
	
	public static void deklarationenShort(){
		 
		short short1 = 20;
		System.out.println("short1: " + short1);
		// short1: 20
		
		short shortMin = Short.MIN_VALUE;
		System.out.println("shortMin: " + shortMin);
		// shortMin: -32768
		
		short shortMax = Short.MAX_VALUE;
		System.out.println("shortMax: " + shortMax);
		// shortMax: 32767
		
	}
	
	public static void deklarationenInt(){
		
		int int1 = 30;
	    System.out.println("int1: " + int1);
	    // int1: 30
	    
	    int intMin = Integer.MIN_VALUE;
	    System.out.println("intMin: " + intMin);
	    // intMin: -2147483648
	    
	    int intMax = Integer.MAX_VALUE;
	    System.out.println("intMax: " + intMax);
	    // intMin: 2147483647
	    
	}
	
	public static void deklarationenLong(){
		
		 long long1 = 10;
		 System.out.println("long1: " + long1);
		 // long1: 10
		 
		 //long long2 = 10000000000; //Kompilierfehler
		 // The literal 10000000000 of type int is out of range
		 
		 long long3 = 10000000000l;
		 System.out.println("long3: " + long3);
		 // long3: 10000000000
		 
		 long long4 = 10000000000L;
		 System.out.println("long4: " + long4);
		 // long4: 10000000000
		 
		 long longMin = Long.MIN_VALUE;
		 System.out.println("longMin: " + longMin);
		 // longMin: -9223372036854775808
		 
		 long longMax = Long.MAX_VALUE;
		 System.out.println("longMax: " + longMax);
		 // longMax: 9223372036854775807
	}
}

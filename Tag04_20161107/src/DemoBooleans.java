
public class DemoBooleans {

	public static void main(String[] args) {
		deklarationenBoolean();
		beispieleBoolean();
	}
	
	public static void deklarationenBoolean(){
		
		boolean bool1 = true;
		System.out.println("bool1: " + bool1);
		// bool1: true
		
		boolean bool2 = false;
		System.out.println("bool2: " + bool2);
		// bool2: false
		
		boolean boolFalse = Boolean.FALSE;
		System.out.println("boolFalse: " + boolFalse);
		// boolFalse: false
		
		boolean boolTrue = Boolean.TRUE;
		System.out.println("boolTrue: " + boolTrue);
		// boolTrue: true
		
		
	}
	
	public static void beispieleBoolean(){
		boolean bool1 = true;
		boolean bool3 = !bool1;
		System.out.println("bool3: " + bool3);
		
		bool3 = 3<5;
		System.out.println("bool3: " + bool3);
		int counter = 0;
//		while (bool3) {
//			System.out.println("While wird ausgeführt " + counter++);
//		}
	}
}

package javadoc;
/**
 * Klasse  DemoJavaDoc
 * @author mtepfenhart
 *
 */
public class DemoJavaDoc {
	/**
	 * Datenfeld Konstante
	 */
	public static final int KONSTANTE_ZAHL = 0;

	/**
	 *  methodeVoid()
	 */
	public static void methodeVoid(){
		System.out.println("methodeVoid()");
	}
	
	/**
	 * methodeVoid(int iZahl){
	 * @param iZahl Parameter
	 */
	public static void methodeVoid(int iZahl){
		System.out.println("methodeVoid(): " + iZahl);
	}
	
	/**
	 * methodeInt()
	 * @return 10
	 */
	public static int methodeInt(){
		return 10;
	}
	
	/**
	 * methodeInt(int iZahl)
	 * @param iZahl
	 * @return iZahl
	 */
	public static int methodeInt(int iZahl){
		return iZahl;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

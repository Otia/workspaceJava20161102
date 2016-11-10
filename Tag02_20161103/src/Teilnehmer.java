public class Teilnehmer{

	//Attribute	oder Instanzvariablen
	String lastname;
	String surname; // String - Zeichekette

	//Klassenvariablen
	static String nachname;
	static String vorname; // String - Zeichenkette

	
	//Methoden - Instanzmethode
	public void writeName(){
		System.out.println("Hallo " + lastname);
	} 
	
	//Methoden - statische
	public static void writeNameStatic(){
		System.out.println("Hallo " + nachname + " " + vorname);
	} 
	
	//Zentrale Methode jeder Java Applikation
	//Kommandozeilenparameter uber Parameter der main - Methode
	public static void main(String[] args){
		nachname = args[1];
		vorname = args[0];
		//System.out.println("Hallo " + args[0] + " " + args[1]);
		writeNameStatic(); 
	}

}
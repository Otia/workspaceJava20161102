public class Taschenrechner {
  
  public static void main(String[] args){
    
    //Umwandeln des ersten Kommandozeilenparameters in ein int
    int zahl = Integer.parseInt(args[0]);
    System.out.println(zahl + zahl);
    
    demoOperatoren();
    demoWerteBereichGanzeZahlen();
    demoZahlen();
    demoZeichenketten();
    
  }
  
  public static void demoZahlen(){
    //Ganze Zahlen: byte, short, int, long
    //Lokale Variablen muessen initialisiert werden
    
	int int1;  //Deklaration
    int1 = 10; //Initialiserung
    System.out.println(int1 + int1);
    
    int zahl2 = 10;  //Deklaration & Initialiserung
    System.out.println(zahl2 + zahl2);
    
    byte byte2 = 20;
    System.out.println(zahl2 + zahl2);
    
    short zahl3 = 30;
    System.out.println(zahl3 + zahl3);
    
    long zahl4 = 40;
    System.out.println(zahl4 + zahl4);
  }
  
  public static void demoOperatoren(){
    int int1 = 20;
    int int2 = 3;

    System.out.println(int1/int2); 
    //Division - ganzzahlige Ergebnisse
    System.out.println(int1%int2);
    //Modulo - Restwert der Division
  }
  
  public static void demoWerteBereichGanzeZahlen(){
    byte byte1 = -128;
    byte byte2 = 127;
     
    //System.out.print(byte1); 
    //System.out.print(" ");
    //System.out.print(byte2);
    //System.out.println(" ");
    //Alternativ
    printConsole(byte1, byte2);
    byte2 = (byte)(byte2 + (byte)1);
    System.out.print(byte2);
    System.out.println(" ");
    
    int int1 = Integer.MAX_VALUE;
    int int2 = Integer.MIN_VALUE;
    //System.out.print(int1);
    //System.out.print(" ");
    //System.out.print(int2);
    //System.out.println(" ");
    //Alternativ
    printConsole(int1, int2);
    int1 = int1 + 1;
    int2 = int2 -1; 
    printConsole(int1, int2);
  }
  
  //Methode mit Parameter
  public static void printConsole(int int1, int int2){
    System.out.print("int Werte: ");
    System.out.print(int1);
    System.out.print(" ");
    System.out.print(int2);
    System.out.println(" ");
  }
  
  //Methodenueberladung
  public static void printConsole(byte int1, byte int2){
    System.out.print("byte Werte: ");
    System.out.print(int1);
    System.out.print(" ");
    System.out.print(int2);
    System.out.println(" ");
  }
  
  public static void demoZeichenketten(){
    String zahlStr = "10"; //Zeichenkette
    System.out.println(zahlStr + zahlStr);
  }
}
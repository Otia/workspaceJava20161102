public class DemoMethoden{
  
  //Klassenvariablen
  static int zahl = 30;
  
  public static void main(String[] args){
    methodePar("Das ist ein Test ...");
    addiereZahlen(10,100);
    methodeOhnePar();
    quadriereZahl();
    
    //Methode mit Rückgabewerten
    int zahl1 = 23;
    int zahl2 = 46;
    int ergebnis = addiereZweiZahlen(23,46);  //zahl1 + Zahl2;
    System.out.println(zahl1 + " + " + zahl2 + ":= " + ergebnis);
    addiereZweiZahlen(23,46);
    
    ergebnis= addiereZweiZahlen(zahl, zahl);
    System.out.println(zahl + " + " + zahl + ":= " + ergebnis);
    
    String string1 = "Guten ";
    String string2 = "Tag!";
    System.out.println(string1 + " + " + string2 + ":= " + verbindeZeichenketten(string1,string2));
    
    String ergebnisString = verbindeZeichenketten(string1,string2);
    System.out.println(string1 + " + " + string2 + ":= " + ergebnisString);
    
    ergebnisString =verbindeZeichenketten(ergebnisString,string2);
    System.out.println(string1 + " + " + string2 + ":= " + ergebnisString); 
    
    verbindeZeichenkettenVoid(ergebnisString,string2);
  }
  
  //Methode mit Parameter 
  public static void methodePar(String str){
    System.out.println(str);
  }
  
  public static void addiereZahlen(int zahl1, int zahl2){  
    int summe = zahl1 + zahl2;
    System.out.println("Die Summe von " + zahl1 + " und " + zahl2 + " ist: " + summe);
  }
  
  //Methoden ohne Parameter
  public static void methodeOhnePar(){
    System.out.println("Ich habe kein Parameter bekommen");
  }
  
  public static void quadriereZahl(){
    int quadrat = zahl * zahl;   //zahl ist die Klassenvariable
    System.out.println("Das Quadrat von " + zahl + " ist: " + quadrat);  
  }
  
  //Methoden mit Rückgabewerten  - im Rumpf steht der Typ des Rückgabewerts
  public static int addiereZweiZahlen(int zahl1, int zahl2){
    int summe = zahl1 + zahl2;
    return summe;
  }
  
  public static String verbindeZeichenketten(String str1, String str2){
    String neuStr = str1+str2;
    return neuStr;
  }
  
  //void bedeutet kein Rückgabewert
  public static void verbindeZeichenkettenVoid(String str1, String str2){
    String neuStr = str1+str2;
    System.out.println(str1 + " + " + str2 + ":= " + neuStr); 
  } 
}
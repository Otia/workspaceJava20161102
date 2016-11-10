public class DemoFliesskomma{
  
  public static void main(String[] args) {
    deklarationFliess();
    typUmwandlung();
  }
  
  public static void deklarationFliess(){
   
    float float1 = 1234.45f;
    System.out.println("float1: " + float1);
    // float1: 1234.45
    
    //float float2 = 1234.45; //Kompilierfehler
    // Type mismatch: cannot convert from double to float
    //System.out.println("float2: " + float2);
    // float2: 1234.45
    
    float floatMin = Float.MIN_VALUE;
    System.out.println("floatMin: " + floatMin);
    // floatMin: 1.4E-45
    
    float floatMax = Float.MAX_VALUE;
    System.out.println("floatMax: " + floatMax);
    // floatMax: 3.4028235E38
    
    double double1 = 1234.45;
    System.out.println("double1: " + double1);
    // double1: 1234.45
    
    double double2 = 1234.45d;
    System.out.println("double2: " + double2);
    // double2: 1234.45
    
    double double3 = 1234.45D;
    System.out.println("double3: " + double3);
    // double3: 1234.45
    
    double doubleMin = Double.MIN_VALUE;
    System.out.println("doubleMin: " + doubleMin);
    // doubleMin: 4.9E-324
    
    double doubleMax = Double.MAX_VALUE;
    System.out.println("doubleMax: " + doubleMax);
    // doubleMax: 1.7976931348623157E308
      
  }
  
  public strictfp static void typUmwandlung(){
    //Explizite Typumwandlung
    float float1 = 1234.45f;
    double double1 = 4567.89;
    float1 = (float)double1;
    System.out.println("float1: " + float1);
    
    float float2 = Float.MAX_VALUE;
    double double2 = Double.MAX_VALUE;
    System.out.println("float2: " + float2);
    
    float2 = (float)double2;
    System.out.println("float2: " + float2);
    
    //Implizite Typumwandlung
    float float3 = 234.789F;
    double double3 = 567.890;
    System.out.println("double3: " + double3);
    double3 = float3;
    System.out.println("double3: " + double3);
  }
}
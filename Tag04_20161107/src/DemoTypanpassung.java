/**
 * byte => short, int, long, float, double short => int, long, float, double
 * char => int, long, float, double int => long, float, double long => float,
 * double float => double
 */
public class DemoTypanpassung {

	public static void main(String[] args) {
		implGanzeZahlen();
	}

	/**
	 * Demo fuer implizite Typanpassung Widening
	 */
	public static void implGanzeZahlen() {
		long long1 = 10000;
		int int1 = 1000;
		long1 = int1;

		long l1 = 100000000000L;
		int i1 = 0;
		i1 = (int)((long)i1 + l1);
		System.out.println(i1);
		i1 =0;
		i1 += l1;
		System.out.println(i1);
	}

	/**
	 * Demo fuer explizite Typanpassung
	 */
	public static void explGanzeZahlen() {
		long long1 = 10000;
		int int1 = 1000;
		int1 = (int) long1;
	}
	
	
}

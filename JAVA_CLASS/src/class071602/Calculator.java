package class071602;

public class Calculator {
	boolean run = true;
	//´Ü¼ø Ãâ·Â¹®
	void print1() {
		System.out.println("-----------------------------------");
		System.out.println("1.µ¡¼À | 2.»¬¼À | 3.°ö¼À | 4.³ª´°¼À | 5.Á¾·á |");
		System.out.println("-----------------------------------");
		System.out.print("¼±ÅÃ > ");
	}
	// µ¡¼À
	void sum(int x, int y) {
		int sum = x + y;
		System.out.println(x + " + " + y + " = " + sum);

	}
	// »¬¼À
	void sub(int x, int y) {
		int sub = x - y;
		System.out.println(x + " - " + y + " = " + sub);

	}
	// °ö¼À
	void mul(int x, int y) {
		int mul = x * y;
		System.out.println(x + " * " + y + " = " + mul);

	}
	// ³ª´°¼À
	void div(int x, int y) {
		double div = x / y;
		System.out.println(x + " / " + y + " = " + div);

	}
	// µ¿ÀÛ,Á¾·á
	void run() {
		System.out.println("Á¾·áÇÕ´Ï´Ù. ");
		run = false;
	}

}

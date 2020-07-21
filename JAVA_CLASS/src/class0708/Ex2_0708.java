package class0708;

public class Ex2_0708 {

	public static void main(String[] args) {
		int x = 0, y = 0, num = 0;
		boolean run = true;
		x = (int)(Math.random()*6)+2;	// 2~7
		y = (int)(Math.random()*6)+2;	// 2~7
		System.out.print("x값은 : " + x);
		System.out.println("y값은 : " + y);
		
		while(x<=100) {
			
			x = x*y;
			num++;
			
			if(x>=100) {
				run = false;
				System.out.println(num);
			}
			
			
			
		}

	}

}

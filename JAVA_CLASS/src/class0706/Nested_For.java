package class0706;

public class Nested_For {

	public static void main(String[] args) {
		//4x+5y=60
		int x = 0, y = 0, sum = 0;
		
		for(x=1; x<=100; x++) {
			for(y=1; y<=100; y++) {
				sum = 4*x + 5*y;
				if(sum == 60) {
					System.out.println("x = " + x + ", y = "+ y);
					
				}
			}
		}

		
		
		
		
		
		
		
		}

	}



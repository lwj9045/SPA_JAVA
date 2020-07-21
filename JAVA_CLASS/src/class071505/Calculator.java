package class071505;

public class Calculator {

	int add(int v, int w,int x,int y,int z) {
		int result = v+w+x+y+z;
		return result;
	}
	
	double avg(int v, int w,int x,int y,int z) {
		double sum = add(v,w,x,y,z);
		double result = sum/5;
		return result;
	}
	
	double excute(int v, int w,int x,int y,int z) {
		double result = avg(v,w,x,y,z);
//		System.out.println("실행결과 : "+result);
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

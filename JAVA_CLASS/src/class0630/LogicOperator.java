package class0630;

public class LogicOperator {

	public static void main(String[] args) {
		/* 
		논리연산자
		&& (AND 연산) A&&B - A,B 둘 다 true면 결과 true
		|| (OR 연산)	A||B - A,B 둘 중에 하나라도 true면 결과 true
		! (NOT 연산) - boolean 앞에 사용하면 결과반전
		*/
		boolean var1 = false, var2 = false, var3 = false;
		
		//AND 연산
		var3 = var1&&var2;
		System.out.println(var3);// F
		
		var1 = true;
		var3 = var1&&var2;
		System.out.println(var3);// F
		
		var2 = true;
		var3 = var1&&var2;
		System.out.println(var3);// T
		
		//OR 연산
		var3 = var1||var2;//var1=T, var2=T
		System.out.println(var3);//T
		
		var1 = false;
		var3 = var1||var2;
		System.out.println(var3);//T
		
		var2 = false;
		var3 = var1||var2;
		System.out.println(var3);//F
		
		System.out.println("NOT 사용 전 : " + var2);//F
		var2 = !var2;
		System.out.println("NOT 사용 후 : " + var2);//T
		
		var3 = var1||var2;//var1=F var2=T
		System.out.println(var3);//T
		
		
	}

}

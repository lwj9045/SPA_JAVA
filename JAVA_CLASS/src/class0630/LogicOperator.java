package class0630;

public class LogicOperator {

	public static void main(String[] args) {
		/* 
		��������
		&& (AND ����) A&&B - A,B �� �� true�� ��� true
		|| (OR ����)	A||B - A,B �� �߿� �ϳ��� true�� ��� true
		! (NOT ����) - boolean �տ� ����ϸ� �������
		*/
		boolean var1 = false, var2 = false, var3 = false;
		
		//AND ����
		var3 = var1&&var2;
		System.out.println(var3);// F
		
		var1 = true;
		var3 = var1&&var2;
		System.out.println(var3);// F
		
		var2 = true;
		var3 = var1&&var2;
		System.out.println(var3);// T
		
		//OR ����
		var3 = var1||var2;//var1=T, var2=T
		System.out.println(var3);//T
		
		var1 = false;
		var3 = var1||var2;
		System.out.println(var3);//T
		
		var2 = false;
		var3 = var1||var2;
		System.out.println(var3);//F
		
		System.out.println("NOT ��� �� : " + var2);//F
		var2 = !var2;
		System.out.println("NOT ��� �� : " + var2);//T
		
		var3 = var1||var2;//var1=F var2=T
		System.out.println(var3);//T
		
		
	}

}

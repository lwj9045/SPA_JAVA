package class0630;

public class IncreaseDecreaseOperator {

	public static void main(String[] args) {
		/*증감 연산자 (++,--)
		 * ++ : 기존 변수값에 1을 더함
		 * -- : 기존 변수값에 1을 뺌
		 * 정수형 변수 num=5가 있다면
		 * num++ : num이 가지고 있는 값을 사용한 후 num값을 1 증가
		 * ++num : num이 가지고 있는 값에 1 더한 후 계산에활용
		 */
		
		int num1 = 0, num3 = 0 ;
		
		
		num1 = 5;
		System.out.println(num1);//5
		System.out.println(num3);//0
		
		num3 = num1++;
		System.out.println(num1);//6
		System.out.println(num3);//5	
		
		num3 = ++num1;
		System.out.println(num1);//7
		System.out.println(num3);//7
		
		num3 = num1--;
		System.out.println(num1);//6
		System.out.println(num3);//7
		
		num3 = --num1;
		System.out.println(num1);//5
		System.out.println(num3);//5
		
		
		
		
		
		
	}

}

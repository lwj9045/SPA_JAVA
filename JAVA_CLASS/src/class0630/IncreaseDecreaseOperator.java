package class0630;

public class IncreaseDecreaseOperator {

	public static void main(String[] args) {
		/*���� ������ (++,--)
		 * ++ : ���� �������� 1�� ����
		 * -- : ���� �������� 1�� ��
		 * ������ ���� num=5�� �ִٸ�
		 * num++ : num�� ������ �ִ� ���� ����� �� num���� 1 ����
		 * ++num : num�� ������ �ִ� ���� 1 ���� �� ��꿡Ȱ��
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

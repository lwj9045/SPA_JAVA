package class0630;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		/*스캐너 사용을 위한 스캐너 객체선언
		Scanner scan1 = new Scanner(System.in);  //콘솔창에서 이름, 주소를 입력받아서 입력받은 값을 그대로출력
		
		String name = "", address = "";   //이름, 주소 입력을 위한 변수 선언
		
		System.out.print("이름을 입력하세요 : ");  //스캐너로 입력받은 내용을 name에 저장
		name = scan1.nextLine();  // nextLine method : 문자입력에 사용
		System.out.println("입력한 이름은 : " + name + " 입니다. ");
		
		System.out.print("주소를 입력하세요 : ");
		address = scan1.nextLine();
		System.out.println("입력한 주소는 : " + address + " 입니다. ");
		
		int num = 0;
		
		System.out.print("나이를 입력하세요 : ");
		num = scan1.nextInt();
		System.out.println("입력한 나이는 : " + num + " 입니다.");
		scan1.close();
		
		/* 
		 * 간단한 계산기 만들기
		 * 덧셈만 가능한 계산기
		 * 정수 두개 입력 후 덧셈 결과 출력
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		int num1 = 0, num2 = 0, result = 0;
		
		
		System.out.print("첫번째 숫자를 입력해 주세요 : ");
		num1 = scan.nextInt();
		
		System.out.print("두번째 숫자를 입력해 주세요 : ");
		num2 = scan.nextInt();
		
		result = num1 + num2;
		System.out.println("두 수의 덧셈 결과는 " + result + " 입니다.");
		scan.close();
	}
	
}

			
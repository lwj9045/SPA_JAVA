package class0630;
import java.util.Scanner;
public class IF_Ex {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int score = 0;
		
		System.out.println("점수를 입력하세요. ");
		score = scan.nextInt();
		
		if (score > 100) {
			System.out.println("입력범위를 초과하였습니다.  ");
		} else if (score >= 90) {
			System.out.println("당신의 학점은 A 입니다. ");
		} else if (score >= 80 ) {
			System.out.println("당신의 학점은 B 입니다. ");
		} else if (score >= 70) {
			System.out.println("당신의 학점은 C 입니다. ");
		} else if (score >= 60){
			System.out.println("당신의 학점은 D 입니다. ");
		} else {
			System.out.println("당신의 학점은 F 입니다. ");
		}
		
		
		
		
		
		
		
		scan.close();
	}
	
}

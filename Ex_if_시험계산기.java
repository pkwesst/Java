import java.util.Scanner;

public class Ex_if_시험계산기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // 점수 입력받기 위해 Scanner import
		System.out.print("DB : ");
		int db = sc.nextInt(); // 입력 받은 점수 = 변수 db
		System.out.print("전자계산기 구조 : ");
		int logic = sc.nextInt(); // 입력 받은 점수 = 변수 logic
		System.out.print("OS : ");
		int os = sc.nextInt(); // 입력 받은 점수 = 변수 os
		System.out.print("데이터통신 : ");
		int brod = sc.nextInt(); // 입력 받은 점수 = 변수 brod
		System.out.print("소프트웨어공학: ");
		int sw = sc.nextInt(); // 입력 받은 점수 = 변수 sw

		int sum = db + logic + os + brod + sw; // 총합 = 'DB+전자계산기 구조+OS+데이터통신+소프트웨어공학'점수

		// 조건1. 총점이 60점 이상이고
		// 조건2. 각 과목 정답 수가 8개 이상이어야 함
		if (sum >= 60 && db >= 8 && logic >= 8 && os >= 8 && brod >= 8 && sw >= 8) { // 모든 조건이 성립해야 하므로 &&(and)
			System.out.println("합격입니다!");
		} else { // 합격 조건 아니면 전부 불합격 => 별다른 조건 필요없으니까 else if 사용하지 않고 else 사용
			System.out.println("불합격입니다!");
		}

		/* 이것도 답 가능
		 * 조건1. 총점 60점 조건이면서(&&) 
		 * 조건2. 한 과목이라도(||) 정답 수가 7개 미만이면 불합격 
		 * if(sum>=60 && db<7 || logic <7 || os <7 || brod < 7 || sw<7) {
		 * 		System.out.println("합격입니다!");
		 * } else { 
		 * 		System.out.println("불합격입니다!");
		 * }
		 */
	}

}

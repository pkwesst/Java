import java.util.Scanner;

public class Ex_while_출력 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);  //Scanner import

		while (true) {  //횟수가 정해져 있지 않은 반복이므로 while 사용
			System.out.print("A 입력 >> ");
			int A = sc.nextInt(); //사용자로부터 입력받은 값을 변수에 저장
			System.out.print("B 입력 >> ");
			int B = sc.nextInt();

			int num = A - B;  

				if (A != 0 | B != 0) { //둘 중 하나가 0이어도 계속 결과값 도출
					System.out.print("결과 >> " + num);
				} else if (A == 0 && B == 0) { //둘 다 0이면 멈춤
						break;
				}
			System.out.println(); //
		}
	}
}

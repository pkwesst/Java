import java.util.Scanner;

public class Ex_if_시급계산기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);  //Scanner import
		int work;            //일한 시간 = work
		int money = 5000;    //시급 = 5000원
		int s = 5000*15/10;  //초과 근무 시급 = 5000원의 1.5배

		//일한 시간 입력
		System.out.print("일한시간을 입력하세요 : "); //문구 출력
		work = sc.nextInt();  //사용자가 입력한 값을 work에 저장

		//시급 계산
		if (work > 8) { //8시간 초과 근무 
			System.out.println("총 임금은 " + ((8 * money) + (work - 8) * s) + "원 입니다.");
		} else { //8시간 이하 근무
			System.out.println("총 임금은 " + work * money + "원 입니다.");
		}
	}
}

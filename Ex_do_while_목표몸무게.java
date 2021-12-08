import java.util.Scanner;

public class Ex_do_while_목표몸무게 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);  // 입력받기 위해 Scanner import

    // 1. 현재몸무게 입력
		System.out.print("현재몸무게 : "); // 문구 출력
		int weight = sc.nextInt();  // 입력받은 숫자==현재 몸무게 => 변수 weight에 저장
		
    // 2. 목표몸무게 입력
		System.out.print("목표몸무게 : "); // 문구 출력
		int targetWeight = sc.nextInt();  //입력받은 숫자==목표 몸무게 => 변수 targetWeight에 저장
		
    // 3. 주차별 감량 몸무게 입력
		int n = 1;
		
		do {
			System.out.print(n+"주차 감량 몸무게 : "); // 1주차 감량 몸무게
			int num = sc.nextInt(); // 감량하고자 하는 몸무게 입력 받기
			n += 1; // n=n+1
      
			// 4. 현재 몸무게 = (현재 몸무게 - 감량 몸무게)
			weight -= num; // weight = weight - num
		} while (weight > targetWeight);  // 현재몸무게 > 목표목무게인 조건에서 계속 do{} 반복
		
    // 5. 현재 몸무게 <= 목표몸무게 조건에서 반복 멈추기
		System.out.println(weight + "kg 달성!! 축하합니다!!"); // 문구 출력
	}
}

import java.util.Scanner;

public class Ex_for_약수구하기 {

	public static void main(String[] args) {

		// 1."정수 입력 : "을 출력하기
		Scanner sc = new Scanner(System.in);  //정수 입력받기 위해 Scanner import
		System.out.print("정수 입력 : "); //문구 출력
		
		// 2.정수 입력 받기
		int num = sc.nextInt();
		
		// 3.약수 구하기		
		/*
		 32약수 1, 32, 2, 16, 4, 8
		 32 / 1 = 32
		 32 / 2 = 16
		 32 / 4 = 8
		 */
		
		// 풀이1 : 약수 구하기 위해 num을 1부터 num까지 각각의 수로 나눈 후 -> 나머지가 0이면 약수
		System.out.print(num + "의 약수 : ");  //
		for(int i = 1; i<=num; i++) {  // i를 1부터 입력받은 정수까지 1씩 증가하며 반복
			if(num % i ==0) {          // 만약 num을 i로 나눈 나머지가 0이라면 
		System.out.print(i+" ");       // 그 때 i == num의 약수
		}
		
		// 풀이2 : 약수의 특성상 num의 1/2이 되는 수까지만 반복해도 모든 약수 구할 수 있음
		System.out.print(num + "의 약수 : ");
		for (int i = 1; i <= num / 2; i++) {  // i를 (1부터 입력받은 정수/2)까지 1씩 증가하며 반복
			if (num % i == 0) {
				System.out.print(i + " ");
				}
		}
		System.out.println(+num);
		*/
	}
	}
}


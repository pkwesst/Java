import java.util.Scanner;

public class Ex_이중for_행개수 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);  //Scanner import
		System.out.print("행 개수 : ");  //문구 출력
		
    int num = sc.nextInt(); //사용자로부터 입력 받은 값 => 정수형 변수 num에 저장
    
		for (int i = 1; i <= num; i++) {  
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

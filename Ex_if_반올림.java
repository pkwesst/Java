import java.util.Scanner;

public class Ex_if_반올림 {
	
	   public static void main(String[] args) {
		   
	        Scanner sc = new Scanner (System.in); //Scanner import
	        System.out.print("숫자 입력: ");  //문구 출력
	        int num = sc.nextInt(); //사용자의 입력 받은 값 => 정수형 변수 num에 저장
	           
	        if (num%10<5) { //num의 일의 자리 숫자가 5보다 작은 경우
	          System.out.println("반올림 수:"+ (num - (num % 10))); //num - 일의 자리 숫자
	        }else {
	          System.out.println("반올림 수:"+(num + (10 - (num % 10)))); //num + 일의 자리 숫자
	        }
	 
	   }

}

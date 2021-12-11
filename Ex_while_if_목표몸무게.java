import java.util.Scanner;

public class Ex_while_if_목표몸무게
	public static void main(String[] args) {
		
	  	Scanner sc = new Scanner(System.in);
		  System.out.print("현재 몸무게>>"); //문구 출력 
  		int num = sc.nextInt(); //num = 현재 몸무게
  		System.out.print("목표 몸무게>>"); //문구 출력
	  	int goal_num2 = sc.nextInt();   //goal_num2 = 목표 몸무게

  		int i = 1;  //변수 i 선언
	  	while (true) {  //반복(정해지지 않음)
		    	System.out.print(i+"주차 감량 몸무게>>");  //1주차 ~
    			int goal_num = sc.nextInt();  //감량 몸무게 = goal_num
			
		    	num -= goal_num;  //num = num - goal_num //현재 몸무게 = 현재 몸무게 - 감량 몸무게
			
			    if(num<=goal_num2) {  //만약 현재몸무게 <= 목표몸무게 경우
				    System.out.println(num + "kg 달성!! 축하합니다!"); //문구 출력
			    	break;  //조건문 멈춤
			    }
			    i++;  //만약 현재몸무게 > 목표몸무게이면 while문 처음부터 실행(2주차)
		  }
	}
}

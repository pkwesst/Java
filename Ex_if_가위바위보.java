import java.util.Scanner;

public class Ex_if_가위바위보 {

	public static void main(String[] args) {

		//컴퓨터와 하는 가위바위보
		Scanner sc = new Scanner(System.in);  //입력받기 위해 Scanner import

		System.out.print("가위바위보>> "); //문구 출력
		String user = sc.next();  //사용자로부터 입력받은 문자 저장

		String cmp = "가위"; //컴퓨터 정해진 답

  	//문자열 비교 => equals()

		if(user.equals("바위")) { //만약 사용자가 입력한 문자 == 바위라면
		  	System.out.println("이겼습니다!");  //컴퓨터가 가위이므로 사용자가 이김
		}
		else if(user.equals("가위")){		//만약 사용자가 입력한 문자 == 가위라면
				System.out.println("비겼습니다.");   
		}
    else{
				System.out.println("졌습니다.");  //그 외 "졌습니다"를 출력   
		}
	}
}

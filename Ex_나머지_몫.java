import java.util.Scanner;

public class Ex_나머지_몫 {
    public static void main(String[] args) {
        
        int money;  //변수 선언
        Scanner sc = new Scanner(System.in);  //Scanner import
        System.out.print("총금액입력 : "); //문구 출력
        
        money=sc.nextInt(); //사용자에게 입력받은 값을 변수 money에 저장
      
        System.out.println(); //개행
        System.out.println("잔돈 : " + money);
        System.out.println("10000원 : " + money/10000 + "개");
        System.out.println("5000원 : " + money%10000/5000 + "개");
        System.out.println("1000원 : " + money%10000%5000/1000 + "개");
        System.out.println("500원 : " + money%10000%5000%1000/500 + "개");
        System.out.println("100원 : " + money%10000%5000%1000%500/100+"개");       
    
   }
}

public class Ex_for_조건문 {
    public static void main(String[] args) {
    
      int total = 0;    //변수 total 생성 후 0으로 값 초기화
		
      for (int i = 1; i <= 100; i++) {    //i가 1부터 100까지 +1씩하며 반복
			
        if (i%2 == 0) {                   //만약 i가 짝수라면(i를 2로 나눈 나머지가 0)
			    System.out.print(-i + " ");     //-i를 출력하고
				  total -= i;                     //total = total - i
		  	}else {
			  	System.out.print(i + " ");      //i가 홀수면 i 출력
				  total += i;                     //total = total + i
				}
		  }

		System.out.println();   //개행
		System.out.println("결과 : " + total);  //

    }
}

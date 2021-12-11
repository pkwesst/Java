public class Ex_이중for_별찍기 {

	public static void main(String[] args) {

		//별 찍기
		for(int j = 1; j <= 5; j++) {	//j가 1부터 5까지 1씩 증가하며 반복
			for (int i = 1; i <= j; i++) {	//j=1 => i=1	//j=2 => i=1,2
			    System.out.print("*");	//별 출력
     			}
			System.out.println();	//개행
		}
		
		//별 찍기(역순)
		for(int j = 5; j > 0; j--) {	//j가 5부터 1까지 1씩 감소하며 반복
			for(int i = 1; i <= j; i++) {	//j=5 => i=1,2,3,4,5	//j=4 => i=1,2,3,4
				System.out.print("*");
			}
			System.out.println();
		}
	
		
		//별 찍기(역순)
		for(int j = 5; j > 0; j--) {	//j는 5부터 1까지 1씩 감소하며 반복
			for(int i = 1; i <= j; i++) {	//j=5 => i=1,2,3,4,5 //j=4 => i=1,2,3,4
		  		System.out.print("*");	//별 출력
			}
			System.out.println();	//
		}	
	}
}

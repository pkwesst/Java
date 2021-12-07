public class Ex_이중for_구구단 {

	public static void main(String[] args) {
		
		//구구단(2단)
		for(int i = 1; i < 10; i++) { //i는 1부터 9까지 +1씩 증가하며 반복
			System.out.print("2*" + i + "=" + 2*i + " "); // 2*1=2, 2*2=4, 2*3=6...2*9=18
		}
		System.out.println(); //개행
		
		//구구단(2단부터 9단까지)
		for(int j = 2; j <= 9; j++) {  //j는 2부터 9까지 +1씩 증가하며 반복
			for(int i = 1; i <= 9; i++) { //i는 1부터 9까지 +1씩 증가하며 반복
				System.out.printf("%d*%d=%d ", j, i, 2*i);  //2*1=2...9*9=81
			}
			System.out.println(); //개행
		}
	
  }
 }

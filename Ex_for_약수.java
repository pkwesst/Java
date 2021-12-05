public class Ex_for_약수 {

	public static void main(String[] args) {
		
		//1. 2의 약수 구하기
		System.out.print("2의 약수 : ");  //문구 출력
		for(int i=1; i<=19; i++) {  //i = 1~19까지 반복
			if(2 % i == 0){  //2를 i로 나눈 나머지가 0인 조건일 떄
			System.out.print(i+" ");  //i는 2의 약수가 됨
			}
		}
		System.out.println(); //개행
		
		//2. for문으로 변경
		for(int n = 2; n<=19; n++) {  //2~19의 약수
			System.out.print(n + "의 약수 : ");  //문구 출력
			for(int i=1; i<=19; i++) {  //i는 1~19까지 반복
				if(n % i == 0){ //2부터 19를 i로 나눈 나머지가 0인 조건
					System.out.print(i+" ");  //i == n의 약수
					}
				}
			System.out.println(); //개행
		}
	}
}

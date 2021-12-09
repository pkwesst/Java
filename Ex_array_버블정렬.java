import java.util.Arrays;

public class Ex_array_버블정렬 {

	public static void main(String[] args) {

		int[] array = { 45, 7, 12, 82, 25 }; // int 배열 생성

		for (int j = 0; j < 4; j++) {	
			for (int i = 0; i < 4 - j; i++) {
				if (array[i] > array[i + 1]) {	// 조건 : array[0] > array[1] ...
					int temp = 0;	// 치환하기 위해 변수 temp 선언 및 생성
					temp = array[i];	// temp = array[0] <= 더 큰 값을 temp에 저장
					array[i] = array[i + 1];	// array[0] = array[1] <= array[0]에 array[1]값이 저장(작은 수가 array[0]으로 이동)
					array[i + 1] = temp;	// array[1] = temp <= array[1]에 temp에 저장해 두었던 array[0]을 넣음(큰 수가 array[1]으로 이동) 
				}
			}
		}

		System.out.println(Arrays.toString(array));	// 출력
	}

}

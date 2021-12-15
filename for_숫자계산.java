public class for_숫자계산 {
  public static void main(String[] args) {
        
        int sum =0;  //변수 선언 및 초기화
        int j=1;  //*1부터 시작
        
        for (int i = 77; i > 0; i--) {
            sum += i * j++; //sum=sum+i*j++//sum=0+77*1 //sum=77*1+76*2+...
        }
        System.out.println(sum);  //sum 출력
    }
}

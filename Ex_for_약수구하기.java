import java.util.Scanner;

public class Ex_for_������ϱ� {

	public static void main(String[] args) {

		// 1."���� �Է� : "�� ����ϱ�
		Scanner sc = new Scanner(System.in);  //���� �Է¹ޱ� ���� Scanner import
		System.out.print("���� �Է� : "); //���� ���
		
		// 2.���� �Է� �ޱ�
		int num = sc.nextInt();
		
		// 3.��� ���ϱ�		
		/*
		 32��� 1, 32, 2, 16, 4, 8
		 32 / 1 = 32
		 32 / 2 = 16
		 32 / 4 = 8
		 */
		
		// Ǯ��1 : ��� ���ϱ� ���� num�� 1���� num���� ������ ���� ���� �� -> �������� 0�̸� ���
		System.out.print(num + "�� ��� : ");  //
		for(int i = 1; i<=num; i++) {  // i�� 1���� �Է¹��� �������� 1�� �����ϸ� �ݺ�
			if(num % i ==0) {          // ���� num�� i�� ���� �������� 0�̶�� 
		System.out.print(i+" ");       // �� �� i == num�� ���
		}
		
		// Ǯ��2 : ����� Ư���� num�� 1/2�� �Ǵ� �������� �ݺ��ص� ��� ��� ���� �� ����
		System.out.print(num + "�� ��� : ");
		for (int i = 1; i <= num / 2; i++) {  // i�� (1���� �Է¹��� ����/2)���� 1�� �����ϸ� �ݺ�
			if (num % i == 0) {
				System.out.print(i + " ");
				}
		}
		System.out.println(+num);
		*/
	}
	}
}


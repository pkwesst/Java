import java.util.Scanner;

public class Ex_if_������� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // ���� �Է¹ޱ� ���� Scanner import
		System.out.print("DB : ");
		int db = sc.nextInt(); // �Է� ���� ���� = ���� db
		System.out.print("���ڰ��� ���� : ");
		int logic = sc.nextInt(); // �Է� ���� ���� = ���� logic
		System.out.print("OS : ");
		int os = sc.nextInt(); // �Է� ���� ���� = ���� os
		System.out.print("��������� : ");
		int brod = sc.nextInt(); // �Է� ���� ���� = ���� brod
		System.out.print("����Ʈ�������: ");
		int sw = sc.nextInt(); // �Է� ���� ���� = ���� sw

		int sum = db + logic + os + brod + sw; // ���� = 'DB+���ڰ��� ����+OS+���������+����Ʈ�������'����

		// ����1. ������ 60�� �̻��̰�
		// ����2. �� ���� ���� ���� 8�� �̻��̾�� ��
		if (sum >= 60 && db >= 8 && logic >= 8 && os >= 8 && brod >= 8 && sw >= 8) { // ��� ������ �����ؾ� �ϹǷ� &&(and)
			System.out.println("�հ��Դϴ�!");
		} else { // �հ� ���� �ƴϸ� ���� ���հ� => ���ٸ� ���� �ʿ�����ϱ� else if ������� �ʰ� else ���
			System.out.println("���հ��Դϴ�!");
		}

		/* �̰͵� �� ����
		 * ����1. ���� 60�� �����̸鼭(&&) 
		 * ����2. �� �����̶�(||) ���� ���� 7�� �̸��̸� ���հ� 
		 * if(sum>=60 && db<7 || logic <7 || os <7 || brod < 7 || sw<7) {
		 * 		System.out.println("�հ��Դϴ�!");
		 * } else { 
		 * 		System.out.println("���հ��Դϴ�!");
		 * }
		 */
	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Main: while (true) {

			System.out.print("(I)ntro ");
			System.out.print("(C)ourses ");
			System.out.println("(E)xit ");

			String cmd = sc.next().toUpperCase();
			switch (cmd) {
			
			case "I": {
				System.out.println("�ȳ��ϼ���! �츮�� �ڵ����Դϴ�.");
				System.out.println("�Բ� �����սô�.");
				break;
			}
			case "C": {
				Intro: while(true) {
				System.out.println("�ڵ��� ������ �Ұ��մϴ�.");
				System.out.print("(P)ython ");
				System.out.print("(J)ava ");
				System.out.print("(i)OS ");
				System.out.println("(B)ack ");

				String cmd1 = sc.next().toUpperCase();

				switch (cmd1) {
				case "P": {
					System.out.println("Python �� ���� ��ǻ�� ���̾� ���ʸ� ���ϴ�.");
					System.out.println("����: ������");
					System.out.println("��õ ��������: ����");
					continue Intro;
				}
				case "J": {
					System.out.println("Java�� �⺻ ������ ��ü������ ���α׷����� ���ϴ�.");
					System.out.println("����: �����");
					System.out.println("��õ ��������: Python");
					continue Intro;
				}
				case "I": {
					System.out.println("�ֽ� Swift �� ���� iOS ������ ������ �� �ֽ��ϴ�.");
					System.out.println("����: ����ȣ");
					System.out.println("��õ ��������: Python, Java");
					continue Intro;
				}
				case "B": {
					continue Main;
				}

				}
				
			}
			}
			case "E": {
				System.out.println("�ȳ��� ������.");
				break Main;
			}
			
			}

		}

	}

}

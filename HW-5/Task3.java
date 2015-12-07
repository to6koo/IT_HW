package homework5;
	
	import java.util.Scanner;

	public class Task3 {
		/*�� �� ������� ��������, ���� ����� �� �������� �������������� ���
		������ �� ������� ��� ���������.
		���������� �� ������� ��������� �� ��������� �� ����������� �� ��
		�������.
		������: ���������, ���������
		�����:
		����� ���� �� � ����� �������.
		������� �� �������:
			8 �-�
			9 �-�
		 */
	static void Compare(String stringA, String stringB) {
			for (int index = 0; index < stringA.length(); index++) {
				if (stringA.charAt(index) != stringB.charAt(index)) {
					System.out.print(index + " ");
					System.out.println(stringA.charAt(index) + " - " + stringB.charAt(index));
				} else {
					continue;
				}
			}
		}

		public static void main(String[] args) {

			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("Input first string: ");
			String stringA = sc.next();
			System.out.println("Input second string: ");
			String stringB = sc.next();

			if (stringA.length() > stringB.length()) {
				System.out.println("StringA is longer than StringB!");
				System.out.println("Difference in positions: ");
				Compare(stringB, stringA);
			}
			if (stringA.length() < stringB.length()) {
				System.out.println("StringB is longet than stringA!");
				System.out.println("Difference in positions: ");
				Compare(stringA, stringB);
			}
			if (stringA.length() == stringB.length()) {
				System.out.println("The words have equal length!");
				System.out.println("Difference in positions: ");
				Compare(stringA, stringB);
			}
		}
	}


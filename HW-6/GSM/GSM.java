package homeworkGSM;
/*������ GSM �� ������� ��������:
model � ����� �� ��������
hasSimCard � ���� � �������� � �������� SIM �����
simMobileNumber � ����� �� SIM �������(��������� �����), ��� �
�������� ������.
outgoingCallsDuration � ������ ����� (� ������) �� ����������
����������
lastIncomingCall � ���������� ������� ���������
lastOutgoingCall � ���������� �������� ���������*/

public class GSM {
	String model;
	boolean hasSimCard;
	String simMobileNumber;
	double outgoingCallDuration;
	double lastIncomingCall;
	double lastOutgoingCall;

	/*
	 * insertSimCard(simMobileNumber) � ������ ������ �����(��� �����) ��
	 * ��������. �� �� ������� ���� ���������� ����� � ������� (������� � 08 �
	 * �� ������ �� 10 �����). ��� ������� � �������, �� ������ �� �������� �
	 * ������ �������� true �� ������ hasSimCard
	 */

	void insertSimCard(String simMobileNumber) {
		char[] number = simMobileNumber.toCharArray();

		if ((number[0] == '0' && number[1] == '8' && number.length == 10)) {
			System.out.println("The Phone number is valid!");
			System.out.println("The phone is with SIM card!");
			this.hasSimCard = true;
		} else {
			System.out.println("Invalid validation / The Phone number is not correct!");
			System.out.println("Change the SIM card on your phone!");
			this.hasSimCard = false;
			this.simMobileNumber = "No SIM";
		}

	}
	/*
	 * removeSimCard() - �������� ��� ������� �� �������� (������ false ��
	 * ������ hasSimCard)
	 */

	void removeSimCard() {
		this.hasSimCard = false;
	}

	/*
	 *  call( receiver, duration) � � ������ �� �� �� �������� �������� ��: �
	 * ���� ���������� ������� �� ��������� � ������� � ���� ����� ��������
	 * (���� �� ����� �� ������� ������ � ���� ��� ����� �� ����� ����������) ��
	 * �� ���� � ��� ������� � ���� � ����� �������� ���� ��� �����
	 */
	void call(Call receiver, double duration, Call caller) {
		if (duration != 0.0) {
			System.out.println("The duration must be  valid!");

		}

		if (hasSimCard == true && !(caller.equals(receiver))) {

			System.out.println("The call will be executed!");

			/*
			 * ��� ������ �������� �������� �������, ������ ����� �������� �
			 * ��������������� duration ��� ��������, ������� ���� ���������.
			 * ������ ���� �������� ���� �������� �������� ��������� �� ��������
			 * �� ����� �� ����� ����������� (�������� �� ����� �� �������
			 * ������) � ������ ������ �������� ���� �������� ������� ��
			 * �������� ��� ����� �� ����� ����������.
			 */

			this.lastIncomingCall = duration;
			this.lastOutgoingCall = duration;
			this.lastIncomingCall = this.outgoingCallDuration;
		}
	}

	/*
	 * �� �� �������� ��� ������ printInfoForTheLastOutgoingCall() �
	 * printInfoForTheLastIncomingCall() ����� �������� ���������� �� ����������
	 * ��������/������� ��������� �� �������� (��� ��� ������)
	 */

	void printInfoForTheLastOutgoingCall() {
		System.out.println("Tha last outgoing call is: " + this.lastOutgoingCall);
	}

	void printInfoForTheLastIncomingCall() {
		System.out.println("Tha last outgoing call is: " + this.lastIncomingCall);
	}

	/*
	 * �� �� ������� � ����� , ����� ����� ������, ��������� �� ����������
	 * ���������� �� �������� (������ ����� �� ���������� ���������� �� ������
	 * �� ������ - priceForAMinute).
	 */

	double getSumForCall(double priceForAMinute) {

		double allCalls = (this.outgoingCallDuration / 0.6) * priceForAMinute;
		return allCalls;
	}

}

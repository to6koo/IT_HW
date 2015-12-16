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
	Call lastIncomingCall;
	Call lastOutgoingCall;

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
			this.simMobileNumber = simMobileNumber;
		} else {
			System.out.println("Invalid validation / The Phone number is not correct!");
			System.out.println("Change the SIM card on your phone!");
			this.hasSimCard = false;

		}

	}

	/*
	 * removeSimCard() - �������� ��� ������� �� �������� (������ false ��
	 * ������ hasSimCard)
	 */

	void removeSimCard() {
		if (this.hasSimCard == true) {
			this.hasSimCard = false;
		}
		this.simMobileNumber = null;
	}
	/*
	 * call( receiver, duration) � � ������ �� �� �� �������� �������� ��: �
	 * ���� ���������� ������� �� ��������� � ������� � ���� ����� ��������
	 * (���� �� ����� �� ������� ������ � ���� ��� ����� �� ����� ����������) ��
	 * �� ���� � ��� ������� � ���� � ����� �������� ���� ��� �����
	 */

	void call(Call call, GSM receiver) {
		call.caller = this;
		call.receiver = receiver;
		if (call.duration > 0 && !(this.simMobileNumber.equals(receiver.simMobileNumber)) && this.hasSimCard == true
				&& receiver.hasSimCard == true) {
			/*
			 * ��� ������ �������� �������� �������, ������ ����� �������� �
			 * ��������������� duration ��� ��������, ������� ���� ���������.
			 * ������ ���� �������� ���� �������� �������� ��������� �� ��������
			 * �� ����� �� ����� ����������� (�������� �� ����� �� �������
			 * ������) � ������ ������ �������� ���� �������� ������� ��
			 * �������� ��� ����� �� ����� ����������.
			 */

			this.lastOutgoingCall = call;
			receiver.lastIncomingCall = call;
			this.outgoingCallDuration += call.duration;
		} else {
			System.out.println("Error!");
		}
	}

	/*
	 * �� �� �������� ��� ������ printInfoForTheLastOutgoingCall() �
	 * printInfoForTheLastIncomingCall() ����� �������� ���������� �� ����������
	 * ��������/������� ��������� �� �������� (��� ��� ������)
	 */

	void printInfoForTheLastIncomingCall() {
		System.out.println("Caller: " + this.lastIncomingCall.caller.simMobileNumber);
		System.out.println("Receiver: " + this.lastIncomingCall.receiver.simMobileNumber);
		System.out.println("Duration: " + this.lastIncomingCall.duration);
	}

	void printInfoForTheLastOutgoingCall() {
		System.out.println("Caller: " + this.lastOutgoingCall.caller.simMobileNumber);
		System.out.println("Receiver: " + this.lastOutgoingCall.receiver.simMobileNumber);
		System.out.println("Duration: " + this.lastOutgoingCall.duration);
	}

	/*
	 * �� �� ������� � ����� , ����� ����� ������, ��������� �� ����������
	 * ���������� �� �������� (������ ����� �� ���������� ���������� �� ������
	 * �� ������ - priceForAMinute).
	 */

	@SuppressWarnings("static-access")
	double getSumForCall(Call call) {

		double allCalls = (this.outgoingCallDuration / 0.6) * call.priceForAMinute;
		return allCalls;
	}

}

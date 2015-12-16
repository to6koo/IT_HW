package homeworkGSM;
/*Класът GSM да съдържа полетата:
model – модел на телефона
hasSimCard – дали в телефона е заредена SIM карта
simMobileNumber – номер на SIM картата(телефонен номер), ако е
заредена такава.
outgoingCallsDuration – общото време (в минути) на изходящите
повиквания
lastIncomingCall – последното входящо повикване
lastOutgoingCall – последното изходящо повикване*/

public class GSM {
	String model;
	boolean hasSimCard;
	String simMobileNumber;
	double outgoingCallDuration;
	Call lastIncomingCall;
	Call lastOutgoingCall;

	/*
	 * insertSimCard(simMobileNumber) – метода задава номер(сим карта) на
	 * телефона. Да се провери дали подаденият номер е валиден (започва с 08 и
	 * се състои от 10 цифри). Ако номерът е валиден, го задава на телефона и
	 * задава стойност true на полето hasSimCard
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
	 * removeSimCard() - премахва сим картата от телефона (задава false на
	 * полето hasSimCard)
	 */

	void removeSimCard() {
		if (this.hasSimCard == true) {
			this.hasSimCard = false;
		}
		this.simMobileNumber = null;
	}
	/*
	 * call( receiver, duration) – В тялото му да се направят проверки за: •
	 * дали въведената дължина на разговора е валидна • дали двата телефона
	 * (този за който се извиква метода и този към който се прави обаждането) не
	 * са един и същ телефон • дали и двата телефона имат сим карта
	 */

	void call(Call call, GSM receiver) {
		call.caller = this;
		call.receiver = receiver;
		if (call.duration > 0 && !(this.simMobileNumber.equals(receiver.simMobileNumber)) && this.hasSimCard == true
				&& receiver.hasSimCard == true) {
			/*
			 * Ако всички проверки преминат успешно, метода прави обаждане с
			 * продължителност duration към телефона, подаден като параметър.
			 * Задава това обаждане като последно изходящо повикване на телефона
			 * от който се прави повикването (телефона за който се извиква
			 * метода) и задава същото обаждане като последно входящо за
			 * телефона към който се прави обаждането.
			 */

			this.lastOutgoingCall = call;
			receiver.lastIncomingCall = call;
			this.outgoingCallDuration += call.duration;
		} else {
			System.out.println("Error!");
		}
	}

	/*
	 * Да се направят два метода printInfoForTheLastOutgoingCall() и
	 * printInfoForTheLastIncomingCall() които извеждат информация за последното
	 * изходящо/входящо повиквана на телефона (ако има такова)
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
	 * Да се направи и метод , който връща сумата, начислена за изходящите
	 * повиквания на телефона (общото време на изходящите повиквания по цената
	 * за минута - priceForAMinute).
	 */

	@SuppressWarnings("static-access")
	double getSumForCall(Call call) {

		double allCalls = (this.outgoingCallDuration / 0.6) * call.priceForAMinute;
		return allCalls;
	}

}

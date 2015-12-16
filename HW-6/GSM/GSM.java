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
	double lastIncomingCall;
	double lastOutgoingCall;

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
		} else {
			System.out.println("Invalid validation / The Phone number is not correct!");
			System.out.println("Change the SIM card on your phone!");
			this.hasSimCard = false;
			this.simMobileNumber = "No SIM";
		}

	}
	/*
	 * removeSimCard() - премахва сим картата от телефона (задава false на
	 * полето hasSimCard)
	 */

	void removeSimCard() {
		this.hasSimCard = false;
	}

	/*
	 *  call( receiver, duration) – В тялото му да се направят проверки за: •
	 * дали въведената дължина на разговора е валидна • дали двата телефона
	 * (този за който се извиква метода и този към който се прави обаждането) не
	 * са един и същ телефон • дали и двата телефона имат сим карта
	 */
	void call(Call receiver, double duration, Call caller) {
		if (duration != 0.0) {
			System.out.println("The duration must be  valid!");

		}

		if (hasSimCard == true && !(caller.equals(receiver))) {

			System.out.println("The call will be executed!");

			/*
			 * Ако всички проверки преминат успешно, метода прави обаждане с
			 * продължителност duration към телефона, подаден като параметър.
			 * Задава това обаждане като последно изходящо повикване на телефона
			 * от който се прави повикването (телефона за който се извиква
			 * метода) и задава същото обаждане като последно входящо за
			 * телефона към който се прави обаждането.
			 */

			this.lastIncomingCall = duration;
			this.lastOutgoingCall = duration;
			this.lastIncomingCall = this.outgoingCallDuration;
		}
	}

	/*
	 * Да се направят два метода printInfoForTheLastOutgoingCall() и
	 * printInfoForTheLastIncomingCall() които извеждат информация за последното
	 * изходящо/входящо повиквана на телефона (ако има такова)
	 */

	void printInfoForTheLastOutgoingCall() {
		System.out.println("Tha last outgoing call is: " + this.lastOutgoingCall);
	}

	void printInfoForTheLastIncomingCall() {
		System.out.println("Tha last outgoing call is: " + this.lastIncomingCall);
	}

	/*
	 * Да се направи и метод , който връща сумата, начислена за изходящите
	 * повиквания на телефона (общото време на изходящите повиквания по цената
	 * за минута - priceForAMinute).
	 */

	double getSumForCall(double priceForAMinute) {

		double allCalls = (this.outgoingCallDuration / 0.6) * priceForAMinute;
		return allCalls;
	}

}

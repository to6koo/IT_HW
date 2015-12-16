package homeworkGSM;

public class MainGSM {

	public static void main(String[] args) {
		GSM samsung = new GSM();
		samsung.simMobileNumber = "0876795049";
		samsung.model = "galaxy";

		GSM lg = new GSM();
		lg.simMobileNumber = "0895294555";
		lg.model = "G3";

		Call newCall = new Call();

		newCall.duration = 30;

		samsung.insertSimCard("0876495049");
		lg.insertSimCard("0895294555");

		samsung.call(newCall, lg);

		samsung.printInfoForTheLastOutgoingCall();
		lg.printInfoForTheLastIncomingCall();

		System.out.println(samsung.getSumForCall(newCall));

	}

}

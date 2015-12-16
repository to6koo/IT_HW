package homeworkGSM;
/*Класът Call да съдържа следните полета:
priceForAMinute – статично поле, което показва цената на разговор за
минута
caller - показва телефона, от който е направено повикването
receiver - показва телефона, към който е направено повикването
duration - дължината на разговора (в минути)*/

public class Call {
	static double priceForAMinute = 0.15;
	GSM caller;
	GSM receiver;
	double duration;
}

package prob3;

public class CurrencyConverter {
	@SuppressWarnings("unused")
	private static double rate;

	public static double toDollar(double won) {
		return won * rate;
	}

	public static double toKRW(double dollar) {
		return dollar / rate;
	}

	public static void setRate(double r) {
		CurrencyConverter.rate = r / 1000;
	}
}
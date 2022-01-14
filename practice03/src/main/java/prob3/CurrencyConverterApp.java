package prob3;

public class CurrencyConverterApp {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		CurrencyConverter cc = new CurrencyConverter();
		cc.setRate((double) 1000 / (double) 1121);
		System.out.printf("백만원은 %.13f달러입니다.\n", cc.toDollar(1000000));
		System.out.printf("백달러는 %.1f원입니다.\n", cc.toKRW(100));
	}
}
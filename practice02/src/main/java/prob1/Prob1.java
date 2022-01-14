package prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액 : ");
		int money = scanner.nextInt();
		int unit = 50000;
		int unit_switch = 0;
		while (unit > 0) {
			System.out.printf("%d원 : %d개\n", unit, money / unit);
			money %= unit;
			if (unit_switch % 2 == 0)
				unit /= 5;
			else {
				unit /= 2;
			}
			unit_switch++;
		}
	}
}
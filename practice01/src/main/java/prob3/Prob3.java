package prob3;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int even = 0, odd = 0;
		System.out.print("숫자를 입력하세요 : ");
		int num = scanner.nextInt();
		if (num % 2 == 1) {
			for (int i = 1; i < num + 1; i += 2) {
				odd += i;
			}
			System.out.println("결과 값 : " + odd);
		} else {
			for (int i = 0; i < num + 1; i += 2) {
				even += i;
			}
			System.out.println("결과 값 : " + even);
		}
		scanner.close();
	}
}
 
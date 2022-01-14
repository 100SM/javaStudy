package prob4;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("문자열을 입력하세요 : ");
		String text = scanner.nextLine();

		char[] textArray = text.toCharArray();

		for (int i = 0; i < textArray.length; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(textArray[j]);
			}
			System.out.println();
		}
		scanner.close();
	}
} 
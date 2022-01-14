package Prob5;

import java.util.Random;
import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {
		Random r = new Random();

		int cnt = 1;
		int min = 0;
		int max = 100;
		int myAnswer = -1;
		String answer = "y";
		Scanner scanner = new Scanner(System.in);

		while (answer.equals("y")) {
			int k = r.nextInt(100) + 1;
			System.out.println("수를 결정하였습니다. 맞추어 보세요");
			min = 0;
			max = 100;
			cnt = 1;
			myAnswer = -1;
			while (myAnswer != k) {
				System.out.printf("%d-%d\n", min, max);
				System.out.printf("%d>>", cnt);
				myAnswer = scanner.nextInt();
				if (myAnswer < min || myAnswer > max) {
					System.out.println("다시 입력하세요.");
					continue;
				} else {
					if (myAnswer > k) {
						System.out.println("더 낮게");
						max = myAnswer;
					} else if (myAnswer < k) {
						System.out.println("더 높게");
						min = myAnswer;
					} else {
						System.out.println("맞았습니다.");
						break;
					}
					cnt++;
				}
			}
			while (true) {
				System.out.print("다시 하시겠습니까(y/n)>>");
				answer = scanner.next();
				if (answer.equals("n")) {
					System.exit(1);
				} else if (answer.equals("y")) {
					break;
				} else {
					System.out.println("다시 입력해주세요.");
				}
			}
		}
	}
}
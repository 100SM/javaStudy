package prob5;

public class Prob5 {

	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			int cnt = 0;
			char[] charArray = ("" + i).toCharArray();
			int[] intArray = new int[charArray.length];
			for (int j = 0; j < charArray.length; j++) {
				intArray[j] = Character.getNumericValue(charArray[j]);
			}
			for (int j = 0; j < charArray.length; j++) {
				if (intArray[j] != 0 && intArray[j] % 3 == 0) {
					cnt++;
					System.out.printf("%d ", i);
					for (int k = 0; k < cnt; k++) {
						System.out.print("짝");
					}
					System.out.println();
				}

			}
			cnt = 0;
		}
	}
}

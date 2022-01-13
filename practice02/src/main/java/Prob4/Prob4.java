package Prob4;

public class Prob4 {

	public static void main(String[] args) {
		printCharArray(reverse("Hello World"));
		printCharArray(reverse("Java Programming!"));
	}

	public static char[] reverse(String str) {
		char[] charArray = str.toCharArray();
		char[] result = new char[charArray.length];
		for (int i = 0; i < charArray.length; i++) {
			result[i] = charArray[charArray.length - i - 1];
		}
		return result;
	}

	public static void printCharArray(char[] array) {
		for (char ch : array) {
			System.out.print(ch);
		}
		System.out.println();
	}
}
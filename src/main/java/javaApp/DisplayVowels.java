package javaApp;

public class DisplayVowels {
	public static void main(String[] args) {
		System.out.println(dispVowels("vowels in a sentence"));
	}

	public static String dispVowels(String input) {
		String name = input.toUpperCase();
		String str = "AEIOU";
		String res = "";
		for (int i = 0; i < name.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				if (name.charAt(i) == str.charAt(j)) {
					res += name.charAt(i);
				}
			}
		}
		return res;
	}
}

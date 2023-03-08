package Week3.d2assignment;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		if(text1.length()==text2.length()) {
			char[] text1Array=text1.toCharArray();
			char[] text2Array=text2.toCharArray();
			Arrays.sort(text1Array);
			Arrays.sort(text2Array);
			if(Arrays.equals(text1Array, text2Array)) {
				System.out.println("It is Anagram");
			}
			else {
				System.out.println("It is not an Anagram");
			}
		}
		else {
			System.out.println("The length of both String is different,therefore it is not an anagaram");
		}
	}

}

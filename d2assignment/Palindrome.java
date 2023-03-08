package Week3.d2assignment;

public class Palindrome {

	public static void main(String[] args) {
		String s="Rotator";
		String rev="";
		char[] charArray = s.toCharArray();

		for(int i=charArray.length-1;i>=0;i--) {
			rev=rev+charArray[i];
			}
		if(s.equalsIgnoreCase(rev)) {
			System.out.println("The given String is Palindrome");
		}
		else {
			System.out.println("The given String is not a Palindrome");
		}
	}

}

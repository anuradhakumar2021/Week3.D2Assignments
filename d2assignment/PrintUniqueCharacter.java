package Week3.d2assignment;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
       String name = "Success";
       char[] charArray=name.toCharArray();
       Set<Character> uniqueCharacter =new HashSet<Character>();
       for(Character unique:charArray) {
			if(!uniqueCharacter.add(unique)) {
				uniqueCharacter.remove(unique);
			}
		}
		System.out.println("The Unique Character in a String : " +uniqueCharacter);

	}

}

import java.lang.String;

public class StringBasics {

	public static void main(String[] args) {
		char ch[] = {'n', 'a', 'l', 'i', 'n'};
		
		/*
		 * String
		 * A string is basically a object that contains a sequence of char
		 * S is capital in String because it derieves from a class
		 * new is used to assign memory at runtime in string constant pool 
		 * Java String is immutable which means it cannot be changed. Whenever we change string a new instance is created. 
		 */
		String s = new String(ch);
		
		/*
		 * for mutable string we can use StringBuffer and StringBuilder classes
		 * 
		 * q) How to create String object ?
		 * => There are two ways to create string object 1) Using literal 2) By using new keyword
		 */
		
		/*
		 * Literals - Java string literals is created by using double quote "".
		 */
		
		String su = "welcome";
		
		/*
		 * Each time you create a string literal, the JVM checks the "string constant pool" first. If the string already exists in the pool,
		 * a reference to the pooled instance is returned. If the string doesn't exist in the pool, a new string instance is created and 
		 * placed in the pool. For example:
		 */
		
		String s1 = "welcome";
		String s2 = "welcome"; //it doesn't create new instance
		
		System.out.println((s1 == s2) ? "same - instance / memory location " : "different - instance / memory location");
		
		/*
		 * Note: String objects are stored in a special memory area known as the "string constant pool".
		 */

	}

}

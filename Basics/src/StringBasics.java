import java.lang.String;

public class StringBasics extends Output {

	public static void main(String[] args) {
		char ch[] = {'n', 'a', 'l', 'i', 'n'};
		
		/*
		 * String
		 * A string is basically a object that contains a sequence of char
		 * S is capital in String because it follows a naming convention and String is a class
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
		
		print((s1 == s2) ? "same - instance / memory location " : "different - instance / memory location");
		
		/*
		 * Note: String objects are stored in a special memory area known as the "string constant pool" which is in heap memory.
		 * q) why java uses the concepts of string literals?
		 * => to make java memory more efficient ( because no new obj is being created if it already exists)
		 */
		
		/*
		 * By new Keyword
		 */
		String s3 = new String("nalin");
		String s4 = new String("nalin");

		print((s3 == s4) ? "same - instance / memory location " : "different - instance / memory location");
		
		/*
		 * JVM will create a new string object in normal (non-pool) heap memory, and the literal "nalin" is placed in the string constant pool.
		 * The variable s3 & s4 refers to the object in heap (non-pool). 
		 */

	}

}

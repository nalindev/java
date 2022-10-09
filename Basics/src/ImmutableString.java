
public class ImmutableString extends Output {

	public static void main(String[] args) {
		/*
		 * In java Strings are immutable. immutable means it cann't be changed or modified 
		 */
		
		String s = "nalin";
		s.concat(" nishant");
		print(s);
		
		/*
		 * Here nalin is not changed but, a new object is being created with nalin nishant in string constant pool.
		 * That is why String is known as immutable.
		 */
		
		s = s.concat(" nishu"); //explicitly assign it to the reference variable
		print(s);
		
		/*
		 * q) why string objects are immutable in java?
		 * => As Java uses the concept of String literal. Suppose there are 5 reference variables, all refer to one object "Sachin"
		 *  If one reference variable changes the value of the object, it will be affected by all the reference variables.
		 *   That is why String objects are immutable in Java.
		 *   
		 * q) why string class is final in java
		 * => because no one can override the methods of the string class.
		 */
	}
}

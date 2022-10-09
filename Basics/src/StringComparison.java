import java.lang.String;

public class StringComparison extends Output {

	public static void main(String[] args) {
		/*
		 * Three ways to compare string in java
		 * 1. Using == Operator     (Reference Matching)
		 * 2. using equals()        (Actual value matching)
		 * 3. using compareTo()
		 */
		
		/*
		 * 1. By using equals() method - It compares the original content of the string instead of reference
		 */
		String s1 = "nalin";
		String s2 = "nalin";
		String s3 = new String("nalin");
		String s4 = "NALIN";
		
		print(s1.equals(s2)); //true
		print(s1.equals(s3)); //true
		print(s1.equals(s4)); //false
		print(s1.equalsIgnoreCase(s4)); //true - Ignore capital small case
		
		
		/*
		 * 2. By using == operator - It compares the reference of the string
		 */
		String s5 = "nishu";
		String s6 = "nishu";
		String s7 = new String("nishu");
		
		print(s5 == s6); //true
		print(s5 == s7); //false
		
		/*
		 * 3. By using compareTo() method - It compares values lexicographically. 
		 * s1 == s2 : The method returns 0.
		 * s1 > s2 : The method returns a positive value.
		 * s1 < s2 : The method returns a negative value.
		 */
		
		String s8="Sachin";  
		String s9="Sachin";  
		String s10="Ratan";  
		print(s8.compareTo(s9));  //0  
		print(s8.compareTo(s10)); //1 (because s1 > s3)  
		print(s10.compareTo(s8)); //-1(because s3 < s1 )  
	}

}

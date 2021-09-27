package userRegistration;

import java.util.regex.Pattern;

public class UserRegistration {
	/*
	 * User Registration Form.
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to User Registration....");
		/*
		 * First Name First letter mush be in capital and remaining letters must be 2 or
		 * more characters
		 */
		System.out.println(Pattern.matches("[A-Z]{1}[a-zA-Z0-9]{2,}", "Arjun")); // true
		System.out.println(Pattern.matches("[A-Z]{1}[a-zA-Z0-9]{2,}", "arjun")); // false
		/*
		 * Last Name First letter mush be in capital and remaining letters must be 2 or
		 * more characters
		 */
		System.out.println(Pattern.matches("[A-Z]{1}[a-zA-Z0-9]{2,}", "Sai7")); // true
		System.out.println(Pattern.matches("[A-Z]{1}[a-zA-Z0-9]{2,}", "sai")); // false

		/*
		 * Mobile Number country code and 10 digit number
		 */
		System.out.println(Pattern.matches("[0-9]{2}[ ]{1}[0-9]{10}", "91 8400998800")); // true
		System.out.println(Pattern.matches("[0-9]{2}[ ]{1}[0-9]{10}", "8400998800")); // false

		/*
		 * Password It contain minimum 8 characters. It contain at least 1 upper case
		 */
		System.out.println(Pattern.matches("^(?=.*[A-Z])[A-Za-z0-9]{8,}", "asdfA123")); // true
		System.out.println(Pattern.matches("^(?=.*[A-Z])[A-Za-z0-9]{8,}", "asd123")); // false

	}
}
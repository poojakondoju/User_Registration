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
	}
}
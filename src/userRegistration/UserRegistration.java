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
		 * Email
		 */
		System.out.println(Pattern.matches("^([a-z0-9]+.)+@([a-z0-9]+.)([a-z]+.)[a-z]{2,3}+$", "abc.100@yahoo.com")); // true
		System.out.println(Pattern.matches("^([a-z0-9]+.)+@([a-z0-9]+.)([a-z]+.)[a-z]{2,3}+$", "abc123@.com.com")); // false

		/*
		 * Mobile Number country code and 10 digit number
		 */
		System.out.println(Pattern.matches("[0-9]{2}[ ]{1}[0-9]{10}", "91 8400998800")); // true
		System.out.println(Pattern.matches("[0-9]{2}[ ]{1}[0-9]{10}", "8400998800")); // false

		/*
		 * Password It contain minimum 8 characters. It contain at least 1 upper case It
		 * contain at least 1 number. It contain exactly 1 Special Character.
		 */
		System.out
				.println(Pattern.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.+[!@#$%^&+=._-])[A-Za-z0-9].{8,}+$", "asdA%5kjd")); // true
		System.out
				.println(Pattern.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.+[!@#$%^&+=._-])[A-Za-z0-9].{8,}+$", "asd%AdrGh")); // false

	}
}
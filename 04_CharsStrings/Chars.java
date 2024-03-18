//import java.util.Scanner;

public class Chars {
	public static void main(String[] args) {
		//Scanner kb = new Scanner(System.in);
		//System.out.println("Give it...");
		//int number = kb.nextInt();
		char ch;
		
		char first = 'a';
		char second = 'd';
		
		System.out.println("char first: " + first);
		System.out.println("char second: " + second);
		System.out.println("char first cast as int: " + (int)(first));
		System.out.println("char second cast as int: " + (int)(second));
		System.out.println();
		
		System.out.println("char first + char second: " + (first + second));
		System.out.println(first + second);
		System.out.println("" + first + second);
		System.out.println();

		System.out.println("char first concatinated with char second: " + first + " " + second);
		System.out.println("(int)first + (int)second concatenated: " + (int)first + " " + (int)second);
		System.out.println();

		String a = "aardvark"; 
		String b = "apartment";
		System.out.println(a.compareTo(b));
		System.out.println(b.compareTo(a));
		System.out.println();
		
		String word = "P4ssW0rd";
		
		for (int i = 0; i < word.length(); i++) {
			ch = word.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				System.out.println(ch + " is an uppercase letter");
			} else if (ch >= 'a' && ch <= 'z') {
				System.out.println(ch + " is a lowercase letter"); 
			} else if (ch >= '0' && ch <= '9') {
				System.out.println(ch + " is a numeric character");
			}
		}
		
		//kb.close();
	}
}
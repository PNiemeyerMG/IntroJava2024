/* 
Test printf()
Remember: /n is the escape sequence for a new line
%s allows insertion of a string 
%d allows insertion of an int
%f allows a floating point number
note the last example. There is an 8.1 after the % and before the f. 
	This makes the width of the number 8 and the precision 1 digit after the decimal.
*/

class Printf {
		public static void main(String[] args) {
				int number = 12;
				String day = "Monday";
				double temp = 64.45673265;
				System.out.printf("Today is %s and there are %d students present%n", day, number);
				System.out.printf("Today is %S and there are %d students present%n", day, number);
				System.out.printf("The temperature today is %f%n", temp);
				System.out.printf("The temperature today is %8.1f%n", temp);
		}
}

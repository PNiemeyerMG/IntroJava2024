/*
In the Mess.java file, a bunch of variables have been declared with the wrong type. 

Try to compile the file using the command in Shell: javac Mess.java
You should receive 4 errors. 
(Bonus discussion: which 'wrong' data type is working even though it feels like it should not work?)

1. Change the types of the variables so that they correspond with the type of the assignment values. (i.e variable 'year' should be 'int' type).

2. Write print statements to display all your variables (i.e. System.out.println(year);)

3. recompile your program in shell with command: javac Mess.java

4. run your program in shell with command: java Mess
*/
public class Mess {
	public static void main(String[] args) {   
		String year = 2024;
		double title = "Greylock";
		int letterGrade = 'A';
		boolean gpa = 3.84;
		char isHonorRoll = true;
	}
}
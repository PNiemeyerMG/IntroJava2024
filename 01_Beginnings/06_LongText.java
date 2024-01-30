/* This program is broken in several places. Try to read the error messages 
and see if you can figure out what is going on. Generally we try to keep code 
around 80 characters to a line. Starting a new line around 80 is considered 
good form.*/ 
class LongText {
  public static void main(String[] args) {
    System.out.println("Hello!");
    System.out.println("Some sentences are long.");
    System.out.println("+ symbols can be used both for math and for \"Concatination\".");
    System.out.println("There are two symbols that break text: \\ and \". The former 
      is called an escape character, and the latter signals the end of the Sting.");
    // Something strange is going on on in the next two lines of code. 
    // What do you think is happening? How might we "fix it"?
    System.out.println(23 + 15);
    System.out.println(23 + " + " + 15 + " = " + 23 + 15);
  }   
}

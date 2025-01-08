public class BuiltInFunctions {

  public static void main(String[] args) {
    // String hello = occurrencesReplaceString('a', 'i');

  }

  /**
   * Scenario 1
   *
   * Find a built-in function that prints the message on the console.
   * @param message (String)
   */
  String message = "Hello, World!";

  // Write your code here

  public static void messageFunction(String message) {
    System.out.println(message);
  }

  /**
   * Scenario 2
   *
   * Find a built-in function that returns the length of a string.
   * @return length (int)
   */

  // Write your code here

  public static int lenghtString() {
    String example = "Java";

    return example.length();
  }

  /**
   * Scenario 3
   *
   * Find a built-in function that converts a string to lowercase.
   * @return lowerCase (String)
   */

  // Write your code here

  public static String lowerCase() {
    String upperCase = "JAVA";
    String lowerCase = upperCase.toLowerCase();
    return lowerCase;
  }

  /**
   * Scenario 4
   *
   * Find a built-in function that checks if a string starts with a specified prefix.
   * @param prefix (String)
   * @return startsWithPrefix (boolean)
   */

  // Write your code here

  public static Boolean CheckStartWith(String prefix) {
    boolean startsWithPrefix = prefix.startsWith("Java");

    return startsWithPrefix;
  }

  /**
   * Scenario 5
   *
   * Find a built-in function that replaces all occurrences of a specified character in a string with another character.
   * @param oldChar (char)
   * @param newChar (char)
   * @return replacedString (String)
   */
  static String original = "Java is fun!";

  // Write your code here

  public static String occurrencesReplaceString(char oldChar, char newChar) {
    String replacedString = original.replace(oldChar, newChar);

    return replacedString;
  }

  /**
   * Scenario 6
   *
   * Find a built-in function that calculates the square root of a number.
   * @param number (double)
   * @return squareRoot (double)
   */

  double number = 9;

  // Write your code here

  public static double squareRoot(double number) {
    double squareRoot = Math.sqrt(number);

    return squareRoot;
  }

  /**
   * Scenario 7
   *
   * Find a built-in function that calculates the power of a number.
   * @param base (double)
   * @param exponent (double)
   * @return power (double)
   */
  double base = 2;
  double exponent = 3;

  // Write your code here

  public static double powerNumber(double base, double exponent) {
    double power = Math.pow(base, exponent);

    return power;
  }

  /**
   * Scenario 8
   *
   * Find a built-in function that generates a random number between 0.0 (inclusive) and 1.0 (exclusive).
   * @return randomNumber (double)
   */
  // Write your code here

  public static double randomNUmber() {
    double randomNumber = Math.random();
    return randomNumber;
  }

  /**
   * Scenario 9
   *
   * Find a built-in function that returns the larger of two numbers.
   * @param number1 (int)
   * @param number2 (int)
   * @return maxNumber (int)
   */
  int number1 = 5;
  int number2 = 10;

  // Write your code here

  public static int MaxNumberFunc(int number1, int number2) {
    int maxNumber = Math.max(number1, number2);
    return maxNumber;
  }
}

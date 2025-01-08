public class DocComments {

  public static void main(String[] args) {
    printText("Mashami", "23");
  }

  /**
   * Function name: greet
   *
   * Inside the function:
   * 1.prints : 'hi'
   */
  public static String greet() {
    return "Hi!";
  }

  /**
   * Function name : printText
   * @param name (String)
   * @param age (String)
   *
   *
   * Inside the function:
   * 1. prints the name and age
   */

  public static void printText(String name, String age) {
    System.out.println(
      greet() + ", I'm " + name + " and I'm  " + age + " years old."
    );
  }

  /**
   * Function calculateArea
   *
   * @param lenght (double)
   * @param width (double)
   * @return area (double)
   *
   *
   * this function calculate Area
   */

  public static double calculateArea(double lenght, double width) {
    double area = lenght * width;
    return area;
  }
}

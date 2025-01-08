import java.time.LocalDate;
import java.util.Date;

public class ReturnValue {

  public static void main(String[] args) {
    double result = calculateArea(2.3, 3.5);

    System.out.println("\nThe Area is : " + result);

    parameters(2.3, 3.5);

    System.err.println("\nThe Date of today : " + date());

    System.out.println("The date without time is : " + localDate());
    String word;
    word = explainArea("English");
    word = explainArea("French");
    word = explainArea("Spanish");

    String greettings = word;
    System.out.println(greettings);
  }

  public static void parameters(double lenght, double width) {
    double result = 2 * (lenght + width);

    System.out.println("\nThe parameter is : " + result);
  }

  public static double calculateArea(double lenght, double width) {
    double area = lenght * width;

    return area;
  }

  public static Date date() {
    return new Date();
  }

  public static LocalDate localDate() {
    return LocalDate.now();
  }

  public static String explainArea(String language) {
    switch (language) {
      case "English":
        return "Area equals length * width";
      case "French":
        return "La surface est egale a la longueur * la largeur";
      case "Spanish":
        return "area es igual a largo * ancho";
      default:
        return "Language not available";
    }
  }
}

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // try {
    //   FileInputStream fils = new FileInputStream("greetings.txt");

    //   Scanner scanner = new Scanner(fils);
    //   System.out.println(scanner.nextLine());
    //   scanner.close();
    // } catch (FileNotFoundException exception) {
    //   System.out.println(exception.getMessage());
    // } finally {
    //   System.out.println("Process Complete");
    // }

    try {
      readFile("greetings.txt");
    } catch (FileNotFoundException exception) {
      System.out.println("Process Complete");
    }
  }

  public static void readFile(String fileName) throws FileNotFoundException {
    FileInputStream fils = new FileInputStream("greetings.txt");

    Scanner scanner = new Scanner(fils);
    System.out.println(scanner.nextLine());
    scanner.close();
  }
}

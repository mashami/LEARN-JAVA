package SECTION6;

public class IntroToArrays {

  public static void main(String[] args) {
    String[] kingdoms = { "Mercia", "Wessex", "Northumbria", "East Anglia" };

    System.out.println(
      " kingdoms[10%2] => " +
      kingdoms[10 % 2] +
      "kingdoms[3-1] => " +
      kingdoms[3 - 1]
    );
  }
}

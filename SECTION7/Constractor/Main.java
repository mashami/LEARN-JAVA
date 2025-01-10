package SECTION7.Constractor;

public class Main {

  public static void main(String[] args) {
    Car nissan = new Car("Nissa", 1000, 2020, "green");

    Car nissan2 = new Car(nissan);

    Car mahindra = new Car(nissan);

    nissan2.setMake("Toyota");
    nissan2.setPrice(2000);
    nissan2.setYear(2025);
    nissan2.setColor("White");

    mahindra.setMake("mahindra");
    mahindra.setPrice(2000);
    mahindra.setYear(2025);
    mahindra.setColor("Red");

    System.out.println(
      "this is " +
      nissan.getMake() +
      " whose price is " +
      nissan.getPrice() +
      ", It is made in " +
      nissan.getYear() +
      " the color is " +
      nissan.getColor()
    );

    System.out.println(
      "this is " +
      nissan2.getMake() +
      " whose price is " +
      nissan2.getPrice() +
      ", It is made in " +
      nissan2.getYear() +
      " the color is " +
      nissan2.getColor()
    );

    System.out.println(
      "this is " +
      mahindra.getMake() +
      " whose price is " +
      mahindra.getPrice() +
      ", It is made in " +
      mahindra.getYear() +
      " the color is " +
      mahindra.getColor()
    );
  }
}

package SECTION7.Constractor;

public class Main {

  public static void main(String[] args) {
    String[] spareParts = new String[] { "Tires", "Keys" };
    Car nissan = new Car("Nissa", 1000, 2020, "green", spareParts);

    Car nissan2 = new Car(nissan);

    nissan2.setParts(new String[] { "Filter", "Keys" });
    Car mahindra = new Car(nissan);

    System.out.println(nissan);

    System.out.println(nissan2);
    // nissan2.setMake("Toyota");
    // nissan2.setPrice(2000);
    // nissan2.setYear(2025);
    // nissan2.setColor("White");

    // mahindra.setMake("mahindra");
    // mahindra.setPrice(2000);
    // mahindra.setYear(2025);
    // mahindra.setColor("Red");

    // System.out.println(
    //   "this is " +
    //   nissan.getMake() +
    //   " whose price is " +
    //   nissan.getPrice() +
    //   ", It is made in " +
    //   nissan.getYear() +
    //   " the color is " +
    //   nissan.getColor()
    // );

  }
}

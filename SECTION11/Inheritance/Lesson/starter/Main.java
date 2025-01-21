import product.Pants;
import product.Product;
import product.Shirt;
import product.Shirt.Size;

public class Main {

  public static void main(String[] args) {
    Shirt shirt = new Shirt(10.99, "Red", "Nike", Size.SMALL);

    shirt.fold();
    productsStore(shirt);

    Pants paths = new Pants(49.99, "BLACK", "Levi's", 32, 32);

    // paths.setWaist(32);
    // paths.setLength(32);
    // paths.setColor("BLACK");
    // paths.setPrice(79.99);
    // paths.setBrand("LEVI'S");
    paths.fold();
    productsStore(paths);
    productsStore(shirt);

    System.out.println(shirt);
  }

  public static void productsStore(Product product) {
    System.out.println(
      "Thank you for purchaising the" +
      product.getBrand() +
      " " +
      product.getClass().getSimpleName().toLowerCase() +
      "Your total comes to " +
      product.getPrice()
    );
    product.wear();
  }
  // public static void pantStore(Pants pants) {
  //   System.out.println(
  //     "Thank you for purchaising" +
  //     pants.getBrand() +
  //     "Pants." +
  //     " Your total comes to " +
  //     pants.getPrice()
  //   );
  // }

  // public static void shirtStore(Shirt shirt) {
  //   System.out.println(
  //     "Thank you for purchaising" +
  //     shirt.getBrand() +
  //     "shirt" +
  //     " Your total comes to " +
  //     shirt.getPrice()
  //   );
  // }
}

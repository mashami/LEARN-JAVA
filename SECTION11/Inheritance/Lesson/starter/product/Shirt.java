package product;

public class Shirt extends Product {
  private Size size;

  public enum Size {
    SMALL,
    MEDIUM,
    LARGE,
  }

  public Shirt(double price, String color, String brand, Size size) {
    super(price, color, brand);
    this.size = size;
  }

  public Size getSize() {
    return this.size;
  }

  public void setSize(Size size) {
    this.size = size;
  }

  @Override
  public void fold() {
    System.out.println("Overr ride ");
  }

  @Override
  public void wear() {
    System.out.println("The " + this.size + " shirt suits you weell!!");
  }

  @Override
  public String toString() {
    return (
      "SHIRT: " + this.size + " " + super.getBrand() + " " + super.getColor()
    );
  }
}

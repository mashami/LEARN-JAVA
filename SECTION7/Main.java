package SECTION7;

import SECTION7.Constractor.Car;

public class Main {

  public static void main(String[] args) {
    Car[] cars = new Car[] {
      new Car("Nissan", 5000, 2020, "red", new String[] { "tires", "keys" }),
      new Car("Dodge", 8500, 2019, "blue", new String[] { "tires", "keys" }),
      new Car(
        "Nissan",
        5000,
        2017,
        "yellow",
        new String[] { "tires", "filter" }
      ),
      new Car(
        "Honda",
        7000,
        2019,
        "orange",
        new String[] { "tires", "filter" }
      ),
      new Car(
        "Mercedes",
        12000,
        2015,
        "jet black",
        new String[] { "tires", "filter", "transmission" }
      ),
    };

    Dealership dealership = new Dealership(cars);

    // cars[3] =
    //   new Car("Hundai", 5000, 2020, "red", new String[] { "tires", "keys" });

    cars[3].setColor("white");
  }
}

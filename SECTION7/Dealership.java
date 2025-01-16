package SECTION7;

import SECTION7.Constractor.Car;

public class Dealership {
  private Car[] cars;

  public Dealership(Car[] unkCars) {
    this.cars = new Car[cars.length];

    for (int i = 0; i < this.cars.length; i++) {
      this.cars[i] = new Car(unkCars[i]);
    }
    // this.cars = Arrays.copyOf(cars, cars.length);
  }
}

package model;

public class Microscope extends LabEquipment {
  private int magnification;

  public static final int MIN_SPEC = 1;

  public Microscope(
    String manufacturer,
    String model,
    int year,
    int magnification
  ) {
    super(manufacturer, model, year);
    setMagnification(magnification);
  }

  public int getMagnification() {
    return this.magnification;
  }

  public void setMagnification(int magnification) {
    if (magnification < MIN_SPEC) {
      throw new IllegalArgumentException(
        "Magnification must be greater than or equal to the minimum magnification."
      );
    }
    this.magnification = magnification;
  }

  @Override
  public String performMaintenance() {
    return "Microscope maintenance: Clean the lenses and check the light source.";
  }

  @Override
  public LabEquipment clone() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'clone'");
  }
}

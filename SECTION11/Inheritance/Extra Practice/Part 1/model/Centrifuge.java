package model;

public class Centrifuge extends LabEquipment {
  private int maxRPM;
  public static final int MIN_RPM = 500;

  public Centrifuge(String manufacturer, String model, int year, int maxRPM) {
    super(manufacturer, model, year);
    setMaxRPM(maxRPM);
  }

  public int getMaxRPM() {
    return this.maxRPM;
  }

  public void setMaxRPM(int maxRPM) {
    if (maxRPM < MIN_RPM) {
      throw new IllegalArgumentException(
        "Max RPM must be greater than or equal to the minimum RPM."
      );
    }
    this.maxRPM = maxRPM;
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

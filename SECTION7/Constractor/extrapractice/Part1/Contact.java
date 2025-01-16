package SECTION7.Constractor.extrapractice.Part1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Contact {
  private String name;
  private String phoneNumber;
  private String birthDate;
  private int age;

  public Contact(String name, String phoneNumber, String birthDate) {
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.birthDate = birthDate;
    this.age = toAge(birthDate);
  }

  private int toAge(String birthDate) {
    LocalDate partsedBithDate = LocalDate.parse(
      birthDate,
      DateTimeFormatter.ofPattern("yyy-MM-dd")
    );
    LocalDate currenDate = LocalDate.now();
    Period period = Period.between(partsedBithDate, currenDate);

    return period.getYears();
  }

  public Contact(Contact source) {
    this.name = source.name;
    this.phoneNumber = source.phoneNumber;
    this.birthDate = source.birthDate;
    this.age = source.age;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhoneNumber() {
    return this.phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getBirthDate() {
    return this.birthDate;
  }

  public void setBirthDate(String birthDate) {
    this.birthDate = birthDate;
    setAge(toAge(birthDate));
  }

  public int getAge() {
    return this.age;
  }

  private void setAge(int age) {
    this.age = age;
  }
}

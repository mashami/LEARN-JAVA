public class DiceJack {

  public static void main(String[] args) {
    int roll1 = rollDice();
    int roll2 = rollDice();
    int roll3 = rollDice();
  }

  public static int rollDice() {
    double randmNumber = Math.random() * 6;

    randmNumber += 1;

    return (int) randmNumber;
  }
}

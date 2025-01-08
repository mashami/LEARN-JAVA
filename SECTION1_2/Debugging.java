public class Debugging {

    public static void main(String[] args) {

        /************** Debugging **************/

        double exam1Score = 85;
        double exam2Score = 90;
        double exam3Score = 95;

        double total = 100;

        double decimalScore1 = exam1Score / total; 
        double decimalScore2 = exam2Score / total; 
        double decimalScore3 = exam3Score / total; 

        double decimalAverage = (decimalScore1 + decimalScore2 + decimalScore3) / 3.0;
        System.out.println("\n decimalScore1: " + decimalScore1);
        System.out.println("\n decimalScore2: " + decimalScore2);
        System.out.println("\n decimalScore1: " + decimalScore3);

        System.out.println("\nThe decimal average is: " + decimalAverage);

    }
}

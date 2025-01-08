public class Chorus {
    public static void main(String[] args) {
        parameters(2.3, 3.5);
        calculateArea(2.3, 3.5);
    }

    public static void parameters (double lenght, double width ){

        double result = 2* (lenght + width);
     
         System.out.println("The parameter is : "+ result);

         
    }
         public static void calculateArea(double lenght, double width) {

        double result = lenght * width;

        System.out.println("The Area is : " + result);

    }

    
   
}
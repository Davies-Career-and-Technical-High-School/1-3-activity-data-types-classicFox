import java.util.Scanner;

class Question3 {
    public static void main(String[] args) {

        /* Write your code here */

       
      
        Scanner scan = new Scanner(System.in);




         System.out.println("Java is a programming language, true or false?");

        boolean boola1 = scan.nextBoolean();

        System.out.println("Only numbers can be stored by variables in Java, true or false?");

        boolean boola2 = scan.nextBoolean();

        System.out.println("There are only 2 possible values which can be held by a boolean variable, true or false?");

        boolean boola3 = scan.nextBoolean();


        System.out.println("Question 1 - Your answer: " + boola1 + "  Correct answer: true");

        System.out.println("Question 2 - Your answer: " + boola2 + "  Correct answer: false");

        System.out.println("Question 3 - Your answer: " + boola3 + "  Correct answer: true");









    }
}
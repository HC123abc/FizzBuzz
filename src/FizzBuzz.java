/**
 * Solve the FizzBuzz challenge.
 */
public class FizzBuzz {

//    public static void main(String[] args) {
      public static void FizzBuzzCall(){
        for (int i = 1; i < 100; i++) {

            doFizzBuzz(i);
        }

        int i = 1;
        while (i<100){
          if (i % 3 == 0 && i % 5 == 0){
              System.out.println("Fizz Buzz");
          }
          else if (i % 3==0){
              System.out.println("Fizz");
          }
          else if (i % 5 == 0){
              System.out.println("Buzz");
          }
          else{
              System.out.println(i);
          }
          i++;
        }
    }

    public static void doFizzBuzz(int i) {
        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {

            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(i);

        }
    }


}

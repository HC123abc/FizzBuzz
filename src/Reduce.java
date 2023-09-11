public class Reduce {
    public static void main(String[] args) {
       int numSteps = 0;
       int interation = 100;
       while (interation>0){
           if (interation%2==0){
               interation = interation/2;
           }
           else{
               interation = interation - 1;
           }
           numSteps++;
           System.out.println(interation);
       }
        System.out.println(numSteps);
    }
}


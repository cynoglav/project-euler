
public class SumOfMultiples {
    public static void main(String[] args) {

        int Sum = 0;
        for (int checkSum = 3; checkSum < 1000; checkSum++) {
            if (checkSum % 3 == 0 || checkSum % 5 == 0) {
                Sum += checkSum;
            } else
                continue;
        }
        System.out.println(Sum);
        /*
         * If we list all the natural numbers below 10 that are multiples of 3 or 5, we
         * get 3, 5, 6 and 9. The sum of these multiples is 23.
         * 
         * Find the sum of all the multiples of 3 or 5 below 1000.
         */

        /*
         * how-to:
         * start at n=3, bc that's the smallest one that matters,
         * increment by one and check divisibility:
         * if n%3 OR n%5 = 0, then add n to SUM,
         * then print SUM
         * 
         * is there a more elegant way of doing this?
         * if there is, then I don't know it :P
         */
    }
}

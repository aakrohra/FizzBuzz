/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {

        int i = 1;
        while (i < 100) {
            i = doFizzBuzzWhile(i);
        }

//        for (int i = 1; i < 100; i++) {
//
//            // Find out which numbers divide i.
//            boolean divisibleBy3 = i % 3 == 0;
//            boolean divisibleBy5 = i % 5 == 0;
//
//            // Print our appropriate result.
//            if (divisibleBy3 && divisibleBy5) {
//
//                System.out.println("Fizz Buzz");
//
//            } else if (divisibleBy3) {
//
//                System.out.println("Fizz");
//
//            } else if (divisibleBy5) {
//
//                System.out.println("Buzz");
//
//            } else {
//
//                System.out.println(i);
//
//            }
//        }
    }

    private static int doFizzBuzzWhile(int i) {
        boolean divisibleBy3while = i % 3 == 0;
        boolean divisibleBy5while = i % 5 == 0;

        if (divisibleBy3while && divisibleBy5while) {
            System.out.println("Fizz Buzz");
        } else if (divisibleBy3while) {
            System.out.println("Fizz");
        } else if (divisibleBy5while) {
            System.out.println("Buzz");
        } else {
            System.out.println(i);
        }
        i++;
        return i;
    }
}

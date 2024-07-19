package fizzbuzzproblem;

public class FizzBuzzProblem_Imperative_WithoutIfElse {

    /*
    Write a program that prints the numbers from 1 to 100. But for multiples of three,
    print “Fizz” instead of the number, and for the multiples of five, print “Buzz”.
    For numbers that are multiples of both three and five, print “FizzBuzz”.
     */
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
                continue;
            }
            if (i % 3 == 0) {
                System.out.println("Fizz");
                continue;
            }
            if (i % 5 == 0) {
                System.out.println("Buzz");
                continue;
            }
            System.out.println(i);
        }
    }

}
package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public static void main(String[] args) {
        FactorialNumbers fn = new FactorialNumbers();
        fn.printFactorialRow(10); // Prints factorial row up to 10
    }

    public void printFactorialRow(int printToInclusive) {
        int number = 0;
        while (number <= printToInclusive) {
            System.out.println(calculateFactorial(number));
            number++;
        }
    }

    public long calculateFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }

        long factorial = 1;
        int i = 2;
        while (i <= number) {
            factorial = factorial * i;
            i++;
        }
        return factorial;
    }
}
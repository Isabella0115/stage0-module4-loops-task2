package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public static void main(String[] args) {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.printPrimeNumbers(50); // Prints prime numbers up to 50
    }

    public void printPrimeNumbers(int printToInclusive) {
        int number = 2; // Start with the first prime number
        while (number <= printToInclusive) {
            if (isPrime(number)) {
                System.out.println(number);
            }
            number++;
        }
    }

    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
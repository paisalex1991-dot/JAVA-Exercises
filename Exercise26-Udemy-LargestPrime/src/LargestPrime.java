public class LargestPrime {


    public class LargestPrime {

        public static int getLargestPrime(int number) {

            if (number < 2) {
                return -1;
            }

            int factor = -1;
            for (int i = 2; i * i <= number; i++) {
                if (number % i != 0) {
                    continue;
                }
                factor = i;
                while (number % i == 0) {
                    number /= i;
                }
            }
            return number == 1 ? factor : number;
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;  // 0, 1, and negative numbers are not prime
        }

        // Check divisibility from 2 up to sqrt(number)
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;  // found a divisor, not prime
            }
        }

        return true;  // no divisors found, it’s prime
    }
}

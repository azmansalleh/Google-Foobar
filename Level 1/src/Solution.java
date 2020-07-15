public class Solution {
    public static void main(String[] args) {
        System.out.println(solution(3));
    }

    public static String solution(int n) {
        int i = 1;

        String sequence= "2";
        int digit = 3;
        int min = 1;

        while (i <= n + 4) {
            if (isPrime(digit)) {
                i += min;
                sequence += String.valueOf(digit);
            }

            //Increment digit by 2 for next prime
            digit += 2;

        }
        return sequence.substring(n, n+5);

    }

    /**
     * Check if its a prime number
     * @param p
     * @return
     */
    public static boolean isPrime(int p) {
        if (p == 1) {
            return false;
        }
        for (int i = 2; i < p; i++) {
            if (p % i == 0) {
                return false;
            }
        }
        return true;
    }

}

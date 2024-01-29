/*

Kristen loves playing with and comparing numbers. She thinks that if she takes two different positive numbers, the one whose digits sum to a larger number is better than the other. If the sum of digits is equal for both numbers, then she thinks the smaller number is better. For example, Kristen thinks that  is better than  and that  is better than .

Given an integer, , can you find the divisor of  that Kristin will consider to be the best?

Input Format

A single integer denoting .

Constraints

Output Format

Print an integer denoting the best divisor of .

Sample Input 0

12
Sample Output 0

6
Explanation 0

The set of divisors of  can be expressed as . The divisor whose digits sum to the largest number is  (which, having only one digit, sums to itself). Thus, we print  as our answer.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = findBestDivisor(n);

        System.out.println(result);

        bufferedReader.close();
    }

    // Function to find the sum of digits
    private static int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    // Function to find the best divisor
    private static int findBestDivisor(int n) {
        int bestDivisor = 1;
        int maxDigitSum = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                int currentDigitSum = digitSum(i);

                if (currentDigitSum > maxDigitSum || (currentDigitSum == maxDigitSum && i < bestDivisor)) {
                    maxDigitSum = currentDigitSum;
                    bestDivisor = i;
                }
            }
        }

        return bestDivisor;
    }
}

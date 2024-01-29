/*
Two words are anagrams of one another if their letters can be rearranged to form the other word.

Given a string, split it into two contiguous substrings of equal length. Determine the minimum number of characters to change to make the two substrings into anagrams of one another.

Example

Break  into two parts: 'abc' and 'cde'. Note that all letters have been used, the substrings are contiguous and their lengths are equal. Now you can change 'a' and 'b' in the first substring to 'd' and 'e' to have 'dec' and 'cde' which are anagrams. Two changes were necessary.

Function Description

Complete the anagram function in the editor below.

anagram has the following parameter(s):

string s: a string
Returns

int: the minimum number of characters to change or -1.
Input Format

The first line will contain an integer, , the number of test cases.
Each test case will contain a string .

Constraints


 consists only of characters in the range ascii[a-z].
Sample Input

6
aaabbb
ab
abc
mnop
xyyx
xaxbbbxx
Sample Output

3
1
-1
2
0
1
Explanation

Test Case #01: We split  into two strings ='aaa' and ='bbb'. We have to replace all three characters from the first string with 'b' to make the strings anagrams.

Test Case #02: You have to replace 'a' with 'b', which will generate "bb".

Test Case #03: It is not possible for two strings of unequal length to be anagrams of one another.

Test Case #04: We have to replace both the characters of first string ("mn") to make it an anagram of the other one.

Test Case #05:  and  are already anagrams of one another.

Test Case #06: Here S1 = "xaxb" and S2 = "bbxx". You must replace 'a' from S1 with 'b' so that S1 = "xbxb".

Submissions: 130
Max Score: 25
Difficulty: Easy
Rate This Challenge:

    
More
 

*/

import java.util.*;

class Result {
    public static int anagram(String s) {
        if (s.length() % 2 != 0) {
            return -1;
        }

        String s1 = s.substring(0, s.length() / 2);
        String s2 = s.substring(s.length() / 2);

        Map<Character, Integer> countMap = new HashMap<>();

        // Increment counts for s1 characters
        for (char c : s1.toCharArray()) {
            if (countMap.containsKey(c)) {
                countMap.put(c, countMap.get(c) + 1);
            } else {
                countMap.put(c, 1);
            }
        }

        // Decrement counts for s2 characters
        for (char c : s2.toCharArray()) {
            if (countMap.containsKey(c)) {
                countMap.put(c, countMap.get(c) - 1);
            } else {
                countMap.put(c, -1);
            }
        }

        int changes = 0;
        for (int count : countMap.values()) {
            changes += Math.abs(count);
        }

        return changes / 2;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int q = scanner.nextInt();
        scanner.nextLine();

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = Result.anagram(s);

            System.out.println(result);
        }

        scanner.close();
    }
}


/*
Cities on a map are connected by a number of roads. The number of roads between each city is in an array and city  is the starting location. The number of roads from city  to city  is the first value in the array, from city  to city  is the second, and so on.

How many paths are there from city  to the last city in the list, modulo ?

Example


There are  roads to city ,  roads to city  and  roads to city . The total number of roads is .

Note
Pass all the towns Ti for i=1 to n-1 in numerical order to reach Tn.

Function Description

Complete the connectingTowns function in the editor below.

connectingTowns has the following parameters:

int n: the number of towns
int routes[n-1]: the number of routes between towns
Returns

int: the total number of routes, modulo 1234567.
Input Format
The first line contains an integer T, T test-cases follow.

Each test-case has 2 lines.
The first line contains an integer N (the number of towns).
The second line contains N - 1 space separated integers where the ith integer denotes the number of routes, Ni, from the town Ti to Ti+1

Constraints
1 <= T<=1000
2< N <=100
1 <= routes[i] <=1000

Sample Input

2
3
1 3
4
2 2 2
Sample Output

3
8
Explanation
Case 1: 1 route from T1 to T2, 3 routes from T2 to T3, hence only 3 routes.
Case 2: There are 2 routes from each city to the next, hence 2 * 2 * 2 = 8.

Submissions: 162
Max Score: 10
Difficulty: Easy
Rate This Challenge:

    
More
 */
1
import java.io.*;
2
import java.math.*;
3
import java.security.*;
4
import java.text.*;
5
import java.util.*;
6
import java.util.concurrent.*;
7
import java.util.regex.*;
8
​
9
class Result {
10
​
11
    /*
12
     * Complete the 'connectingTowns' function below.
13
     *
14
     * The function is expected to return an INTEGER.
15
     * The function accepts following parameters:
16
     *  1. INTEGER n
17
     *  2. INTEGER_ARRAY routes
18
     */
19
​
20
    public static int connectingTowns(int n, List<Integer> routes) {
21
    // Write your code here
22
          int result = 1;
23
​
24
        // Calculate the product of all route values modulo 1234567
25
        for (int route : routes) {
26
            result = (result * route) % 1234567;
27
        }
28
​
29
        return result;
30
​
31
    }
32
​
33
}
34
​
35
public class Solution {
36
    public static void main(String[] args) throws IOException {
37
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
38
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
39
​
40
        int t = Integer.parseInt(bufferedReader.readLine().trim());
41
​
42
        for (int tItr = 0; tItr < t; tItr++) {
43
            int n = Integer.parseInt(bufferedReader.readLine().trim());
44
​
45
            String[] routesTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
46
​
47
            List<Integer> routes = new ArrayList<>();
48
​
49
            for (int i = 0; i < n - 1; i++) {
50
                int routesItem = Integer.parseInt(routesTemp[i]);
51
                routes.add(routesItem);
52
            }
53
​
54
            int result = Result.connectingTowns(n, routes);
55
​
56
            bufferedWriter.write(String.valueOf(result));
57
            bufferedWriter.newLine();
58
        }
59
​
60
        bufferedReader.close();
61
        bufferedWriter.close();
62
    }
63
}

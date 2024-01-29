/*Consider two points,  and . We consider the inversion or point reflection, , of point  across point  to be a  rotation of point  around .

Given  sets of points  and , find  for each pair of points and print two space-separated integers denoting the respective values of  and  on a new line.

Function Description

Complete the findPoint function in the editor below.

findPoint has the following parameters:

int px, py, qx, qy: x and y coordinates for points  and 
Returns

int[2]: x and y coordinates of the reflected point 
Input Format

The first line contains an integer, , denoting the number of sets of points.
Each of the  subsequent lines contains four space-separated integers that describe the respective values of , , , and  defining points  and .

Constraints

Sample Input

2
0 0 1 1
1 1 2 2
Sample Output

2 2
3 3
Explanation

The graphs below depict points , , and  for the  points given as Sample Input:

find-point-0011.png
find-point-1122.png
Submissions: 165
Max Score: 10
Difficulty: Easy
Rate This Challenge:

    
More*/
 
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
     * Complete the 'findPoint' function below.
13
     *
14
     * The function is expected to return an INTEGER_ARRAY.
15
     * The function accepts following parameters:
16
     *  1. INTEGER px
17
     *  2. INTEGER py
18
     *  3. INTEGER qx
19
     *  4. INTEGER qy
20
     */
21
​
22
    public static List<Integer> findPoint(int px, int py, int qx, int qy) {
23
    // Write your code here
24
​
25
    }
26
​
27
}
28
​
29
public class Solution {
30
    public static void main(String[] args) throws IOException {
31
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
32
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
33
​
34
        int n = Integer.parseInt(bufferedReader.readLine().trim());
35
​
36
        for (int nItr = 0; nItr < n; nItr++) {
37
            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
38
​
39
            int px = Integer.parseInt(firstMultipleInput[0]);
40
​
41
            int py = Integer.parseInt(firstMultipleInput[1]);
42
​
43
            int qx = Integer.parseInt(firstMultipleInput[2]);
44
​
45
            int qy = Integer.parseInt(firstMultipleInput[3]);
46
​
47
            List<Integer> result = Result.findPoint(px, py, qx, qy);
48
​
49
            for (int i = 0; i < result.size(); i++) {
50
                bufferedWriter.write(String.valueOf(result.get(i)));
51
​
52
                if (i != result.size() - 1) {
53
                    bufferedWriter.write(" ");
54
                }
55
            }
56
​
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
64
​

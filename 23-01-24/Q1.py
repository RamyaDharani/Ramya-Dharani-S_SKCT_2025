#
# Complete the 'print_full_name' function below.
#
# The function is expected to return a STRING.
# The function accepts following parameters:
#  1. STRING first
#  2. STRING last
#

'''
You are given the firstname and lastname of a person on two different lines. Your task is to read them and print the following:

Hello firstname lastname! You just delved into python.

Function Description

Complete the print_full_name function in the editor below.

print_full_name has the following parameters:

string first: the first name
string last: the last name

Input Format

The first line contains the first name, and the second line contains the last name.

Constraints

The length of the first and last names are each ≤ .

Sample Input 0

Ross
Taylor
Sample Output 0

Hello Ross Taylor! You just delved into python.
'''


def print_full_name(first, last):
   
    # Write your code here
   print("Hello {} {}! You just delved into python.".format(first, last))
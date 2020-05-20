#!/bin/python3

import math
import os
import random
import re
import sys



#
# Complete the 'findSubstring' function below.
#
# The function is expected to return a STRING.
# The function accepts following parameters:
#  1. STRING s
#  2. INTEGER k
#

VOWELS = ('a', 'e', 'i', 'o', 'u')


def findSubstring(s, k):
    # O(n)
    substrings = {s[pivot:pivot + k]: 0 for pivot in range(len(s) - k)}

    # O(n)
    for k, v in substrings.items():  # n
        for vowel in VOWELS:  # 5
            if vowel in k:
                substrings[k] += k.count(vowel)

    return max(substrings.items(), key=lambda x: x[1])[0]


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    k = int(input().strip())

    result = findSubstring(s, k)

    fptr.write(result + '\n')

    fptr.close()

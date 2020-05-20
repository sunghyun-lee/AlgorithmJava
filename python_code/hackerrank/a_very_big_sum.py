#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the aVeryBigSum function below.
def aVeryBigSum(ar):
    return_value = 0
    # avoid using `sum()` for the result might be quite large.
    for number in ar:
        return_value += number
        if -1 * (2 ** 31) > return_value > (2 ** 31) - 1:
            raise ValueError('number has exceeded allowed range.')
    return return_value


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    ar_count = int(input())
    # assert 1 <= ar_count  <= 10

    ar = list(map(int, input().rstrip().split()))

    result = aVeryBigSum(ar)

    fptr.write(str(result) + '\n')

    fptr.close()

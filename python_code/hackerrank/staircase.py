#!/bin/python3

import math
import os
import random
import re
import sys

def calculate_whitespace(n):
    for num_of_whitespaces in range(n - 1, -1, -1):
        yield num_of_whitespaces


# Complete the staircase function below.
def staircase(n):
    for idx, num_of_whitespaces in enumerate(calculate_whitespace(n), 1):
        print("{whitespace}{stair}".format(
            whitespace=" " * num_of_whitespaces,
            stair="#" * idx
        ))


if __name__ == '__main__':
    n = int(input())

    staircase(n)

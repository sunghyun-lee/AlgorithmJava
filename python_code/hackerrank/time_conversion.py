#!/bin/python3

import os
import sys

#
# Complete the timeConversion function below.
#
def timeConversion(s):
    hours, minutes, seconds = s.split(':')
    am_or_pm = seconds[-2:]
    seconds = seconds[:-2]

    if am_or_pm == "AM":
        if hours == "12":
            hours = "00"
    else:
        hours = str(int(hours) + 12)
        if hours == "24":
            hours = "12"

    return "{hours}:{minutes}:{seconds}".format(hours=hours, minutes=minutes, seconds=seconds)


if __name__ == '__main__':
    f = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    result = timeConversion(s)

    f.write(result + '\n')

    f.close()

#!/bin/python3

import math
import os
import random
import re
import sys



#
# Complete the 'getBattery' function below.
#
# The function is expected to return an INTEGER.
# The function accepts INTEGER_ARRAY events as parameter.
#

def getBattery(events):
    battery_left = 50  # initial state

    for changed_battery in events:
        battery_left += changed_battery
        if battery_left > 100:
            battery_left = 100
        elif battery_left < 0:
            battery_left = 0

    return battery_left


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    events_count = int(input().strip())

    events = []

    for _ in range(events_count):
        events_item = int(input().strip())
        events.append(events_item)

    result = getBattery(events)

    fptr.write(str(result) + '\n')

    fptr.close()

#1253번
# 투포인터

import sys
input = sys.stdin.readline

N = int(input())
arr = list(map(int, input().strip().split(' ')))
arr.sort()
count = 0

for i in range(len(arr)):
    left = 0
    right = len(arr)-1
    while left < right:
        if left == i:
            left += 1
            continue
        if right == i:
            right -= 1
            continue
        sumValue = arr[left]+arr[right]
        if sumValue == arr[i]:
            count += 1
            break
        elif sumValue > arr[i]:
            right -= 1
        else:
            left += 1
print(count)

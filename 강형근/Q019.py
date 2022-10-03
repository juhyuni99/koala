# 11004번 : k번째 수
import sys
n, k = map(int, sys.stdin.readline().split())
number = list(map(int, sys.stdin.readline().split()))
number.sort()
print(number[k-1])

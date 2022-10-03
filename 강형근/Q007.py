# 1940번 : 주몽
import sys
n = int(sys.stdin.readline())
m = int(sys.stdin.readline())
number = list(map(int, sys.stdin.readline().split()))
number.sort()
cnt, tmp = 0, 0
start, end = 0, n-1
while start < end:
    tmp = number[start] + number[end]
    if tmp < m:
        start += 1
    elif tmp > m:
        end -= 1
    else:
        cnt += 1
        start += 1
        end -= 1
print(cnt)

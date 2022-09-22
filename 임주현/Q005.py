#10986

import sys, math
input = sys.stdin.readline

n,m = map(int,input().split())
arr = list(map(int,input().split()))

# 나머지만 담은 배열을 구한다. 예제의 경우 [3,2,0]
cnt_rem = [0]*m
cnt_rem[arr[0]%m]+=1

for i in range(1,n):
    arr[i] = (arr[i-1]+arr[i])%m
    cnt_rem[arr[i]]+=1

# 0의 개수 + 나머지가 같은 것들의 조합
ans = cnt_rem[0]
for i in cnt_rem:
    if i>=2:
        ans += math.comb(i,2)
print(ans)


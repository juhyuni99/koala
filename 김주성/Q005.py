
# 구간합: 나머지 합 구하기
n, m = map(int, input().split())

A = list(map(int, input().split()))  # 원본 수열 저장 리스트
S = [0] * n  # 합 배열 
C = [0] * n  # 같은 나머지의 인덱스를 카운트하는 리스트

S[0] = A[0]  
answer = 0 

for i in range(1, n):  # 합 배열 만들기
    S[i] = S[i-1] + A[i]

for i in range(n):
    remainder = S[i] % m 
    if remainder == 0:
        answer += 1 
    C[remainder] += 1  # 나머지가 같은 인덱스의 개수 값 증가시키기 (나머지 값이 몇개씩 있는지)

for i in range(m):
    # 나머지가 같은 인덱스 중 2개를 뽑는 경우의 수를 더하기
    if C[i] > 1:
        answer += (C[i] * (C[i] - 1) // 2)

print(answer)
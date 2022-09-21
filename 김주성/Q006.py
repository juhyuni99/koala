# 투포인터: 연속된 자연수의 합 구하기
N = int(input())

count = 0
num_series = []

for i in range(1, N + 1):
    num_series.append(i)

for i in range(N):
    for j in range(i + 1, N + 1):
        if N == sum(num_series[i:j]):
            # print(sum(num_series[i:j]))
            # print(f'i:{i}, j:{j}')
            count += 1

print(count)
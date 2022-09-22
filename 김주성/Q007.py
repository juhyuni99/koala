N = int(input())
M = int(input())
numbers = list(map(int, input().split()))

# numbers 정렬
for i in range(N-1):
  for j in range(i+1, N):
    if numbers[i] > numbers[j]:
      numbers[i], numbers[j] = numbers[j], numbers[i] 

# 합쳐서 M이 되는 두수 구하기
start = 0
end = N-1  # 인덱스 번호는 배열길이 - 1
count = 0
while start < end:
  if numbers[start] + numbers[end] > M:
    end -= 1 
  elif numbers[start] + numbers[end] < M:
    start += 1
  else:  # numbers[start] + numbers[end] == M
    count += 1
    start += 1
    end -= 1

print(count)

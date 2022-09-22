
N = int(input())
numbers = list(map(int, input().split()))
numbers.sort()

count = 0
for i in range(N):
    find = numbers[i]
    start = 0 
    end = N - 1
    while start < end:
        if numbers[start] + numbers[end] > find:
            end -= 1 
        elif numbers[start] + numbers[end] < find:
            start += 1
        else:  # numbers[start] + numbers[end] == find
            if start != i and end != i:
                count += 1
                break
            elif start == i:
                start += 1
            elif end == i:
                end -= 1 

print(count)
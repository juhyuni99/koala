#11399

input();  # 5 숫자 받기

array = list(map(int, input().split()))

# 삽입정렬
for i in range(1, len(array)):
    for j in range(i, 0, -1):  # i에서 1까지 1씩 감소
        if array[j] < array[j - 1]:
            array[j], array[j - 1] = array[j - 1], array[j]
        else:
            break

count = 0
total = 0
for i in array:
    count += i
    total += count

print(total)

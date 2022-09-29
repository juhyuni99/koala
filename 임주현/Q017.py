#1427

array = list(map(int, input()))

for i in range(len(array)):
    min = i
    for j in range(i + 1, len(array)):
        if array[min] > array[j]:
            min = j
    array[i], array[min] = array[min], array[i]
array.sort(reverse=True)
for i in range(len(array)):
    print(array[i], end="")

#2750번

N = int(input())
A = []

for _ in range(N) :
    A.append(int(input()))

for i in range(len(A)):
    for j in range(len(A)):
        if A[i] < A[j]:
            A[i], A[j] = A[j], A[i]

for n in A :
    print(n)

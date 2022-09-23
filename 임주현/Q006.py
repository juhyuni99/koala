#2018

N = int(input())
A = 0 #정답
s, e = 0, 1 #첫 숫자, 끝 숫자
t = 1 #답이 되는 숫자

while e <= N and s <= e:
    if t == N: #맞을 경우 숫자 A += 1
        e += 1
        t = t - s + e
        s += 1
        A += 1
    elif t < N: #작을 경우 뒤에 숫자 하나를 더 붙여줌
        e += 1
        t += e
    else: # 클 경우 앞에 숫자 하나를 없애줌
        t -= s
        s += 1
print(A)

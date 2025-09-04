'''
25.09.04
made by KH

problem number: 25494
source: https://www.acmicpc.net/problem/25494
'''
loopNumber = int(input())

a = []
b = []
c = []

for i in range(loopNumber):
    a_buff, b_buff, c_buff = map(int, input().split())
    a.append(a_buff)
    b.append(b_buff)
    c.append(c_buff)

resultCount = []

for l in range(loopNumber):
    resultCountBuff = 0

    for i in range(1, a[l]+1):
        for j in range(1, b[l]+1):
            for k in range(1, c[l]+1):
                if i%j == j%k and j%k == k%i:
                    resultCountBuff += 1

    resultCount.append(resultCountBuff)

for i in range(len(resultCount)):
    print(resultCount[i])
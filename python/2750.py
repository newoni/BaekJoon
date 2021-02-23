'''
<21.02.16>
made by KH
problem number: 2750
source: https://www.acmicpc.net/problem/2750
'''

inputNumber = int(input())

numberList = []
for i in range(inputNumber):
    numberList.append(int(input()))

numberList.sort()

for i in range(len(numberList)):
    print(numberList[i])

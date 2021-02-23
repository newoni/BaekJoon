'''
<21.02.15>
made by KH

problem number: 1546
source: https://www.acmicpc.net/problem/1546
'''

inputNumber = int(input())

inputList = list(map(int,input().split()))

modifedList = []
for i in range(inputNumber):
    modifedList.append(inputList[i]/max(inputList) *100)

print(sum(modifedList)/inputNumber)
'''
<21.02.09>
 made by KH

 problem number: 10818
 source: https://www.acmicpc.net/problem/10818
'''

inputNumber = int(input())

inputStrList = input().split()
inputList = []

for i in inputStrList:
    inputList.append(int(i))


inputList.sort()
print(inputList[0], inputList[-1])
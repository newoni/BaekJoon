'''
<21.01.29>
 made by KH

 problem number: 10952
 source: https://www.acmicpc.net/problem/10952
'''

def add(num1, num2):
    sum = num1 + num2
    return sum

resList = []
while True:

    inputNum1, inputNum2 = map(int, input().split())

    if (inputNum1 == inputNum2 and inputNum1==0):
        break

    else:
        resList.append(add(inputNum1, inputNum2))


for i in resList:
    print(i)
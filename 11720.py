'''
<21.02.21>
made by KH
problem number 11720
source: https://www.acmicpc.net/problem/11720
'''

totalLength = int(input())

inputStr = input()

res = 0

for i in range(totalLength):
    res += int(inputStr[i])

print(res)
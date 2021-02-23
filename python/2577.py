'''
<21.02.22>
made by KH

problem number: 2577
source: https://www.acmicpc.net/problem/2577
'''

inputNumber1 = int(input())
inputNumber2 = int(input())
inputNumber3 = int(input())

productNumber = inputNumber1*inputNumber2*inputNumber3

productNumberStr = str(productNumber)

for i in range(10):
    print(productNumberStr.count(str(i)))
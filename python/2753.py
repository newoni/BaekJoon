'''
<21.02.12>
made by KH

problem number: 2753
source: https://www.acmicpc.net/problem/2753
'''''

year = int(input())

if(year%400 == 0 or (year%100!=0 and year%4 ==0)):
    print(1)

else:
    print(0)
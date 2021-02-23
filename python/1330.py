'''
<21.01.26>
made by KH

problem number: 1330
source: https://www.acmicpc.net/problem/1330
'''

def compareNumber(num1, num2):
    if(num1>num2):
        print(">")
    elif(num1<num2):
        print("<")

    else:
        print("==")

num1, num2 = map(int,input().split())

compareNumber(num1,num2)

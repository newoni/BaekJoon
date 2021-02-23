'''
<21.02.14>
 made by KH

 problem number: 10998
 source: https://www.acmicpc.net/problem/10998
'''

def times(num1, num2):
    res = num1 * num2
    return res

if __name__=="__main__":
    inputNum1, inputNum2 = map(int, input().split())

    print(times(inputNum1, inputNum2))
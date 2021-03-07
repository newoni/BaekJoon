'''
<21.03.07>
made by KH

problem number: 2588
source: https://www.acmicpc.net/problem/2588
'''

def product(number1, number2):
    number2str = str(number2)

    number2_1 = int(number2str[0])
    number2_2= int(number2str[1])
    number2_3 = int(number2str[2])

    return number1*number2_3, number1*number2_2, number1*number2_1, number1*number2

if __name__ == "__main__":
    input1 = int(input())
    input2 = int(input())

    res1, res2, res3, res4 = product(input1, input2)

    print(res1)
    print(res2)
    print(res3)
    print(res4)
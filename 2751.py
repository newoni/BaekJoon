'''
<21.01.25>
made by KH

problem number: 2751
source: https://www.acmicpc.net/problem/2751
reference: https://assaeunji.github.io/python/2020-05-06-bj2751/

list로 입력받고, sort를 활용.
'''''

inputNumber = int(input())
input_l = []

for i in range(inputNumber):
    input_l.append(int(input()))

input_l.sort()

for i in range(len(input_l)):
    print(input_l[i])
'''
<21.01.23>
 made by KH
 problem number 2439

 source: https://www.acmicpc.net/problem/2439
 '''
line_num = int(input())  # 섞기수열 수

for i in range(line_num):
    for j in range(line_num-1,-1,-1):
        if(i>=j):
            print("*",end='')
        else:
            print(" ",end='')

    print()
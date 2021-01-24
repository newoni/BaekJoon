'''
<21.01.24>
made by KH

problem number 8958
source: https://www.acmicpc.net/problem/8958
'''


lineNumber = int(input())

total_score_l = []

for i in range(lineNumber):
    total_score = 0
    str_tmp =  input()

    cnt=0
    for str in str_tmp:
        if (str == "O"): # 앞의 str과 값이 같을 경우
            cnt +=1
            total_score += cnt

        else:
            cnt=0

    total_score_l.append(total_score)

for j in total_score_l:
    print(j)
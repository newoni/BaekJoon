'''
<21.02.01>
made by KH

problem number 9012
source: https://www.acmicpc.net/problem/9012
'''


lineNumber = int(input())
resList = []

for _ in range(lineNumber):
    # 괄호 문자열 입력
    parenthesisString = input()
    # 괄호 문자열 여부 확인을 위한 리스트 생성


    stdList=[]
    isFalse = 0

    for i in range(len(parenthesisString)):
        if(parenthesisString[i]=='('):
            stdList.append(1)

        elif(parenthesisString[i]==')'):
            try:
                stdList.pop(-1)
            except:
                resList.append("NO")
                isFalse += 1
                break

    if(isFalse==1):
        # 위쪽에서 진위여부 파악시 다음 문자열 확인으로 넘어감.
        isFalse =0
        continue

    if(len(stdList)==0):
        resList.append("YES")

    else:
        resList.append("NO")

for i in range(len(resList)):
    print(resList[i])
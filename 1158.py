'''
<21.02.03>
made by KH
problem number 1158
source: https://www.acmicpc.net/problem/1158
'''

listLength, numK = map(int,input().split())


# 연산을 위한 List
appendList = [i for i in range(1,listLength+1)]

# 연산을 위한 List
seriesList = appendList.copy()

# 결과를 받아올 List
resList = []

while(len(appendList)!=0):
    # appendList의 길이가 1일 때 바로 끝냄.
    if(len(appendList)==1):
        selectedNumber = appendList[0]
        resList.append(selectedNumber)
        appendList.remove(selectedNumber)
        continue

    # seriesList의 길이가 짧으면 appendList를 더해준다
    if len(seriesList) < numK:
        for i in appendList:
            seriesList.append(i)
        continue
    else:
        pass

    for i in range(numK):
        selectedNumber = seriesList.pop(0)

    resList.append(selectedNumber)

    appendList.remove(selectedNumber)

print("<",end='')
for i in resList:
    if (i!= resList[-1]):
        print(i,end=', ')

    else:
        print(i,end='')

print(">", end='')
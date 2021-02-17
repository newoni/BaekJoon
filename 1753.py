'''
<21.02.17>
made by KH

problem number: 1753
source: https://www.acmicpc.net/problem/1753
'''

def checkColumn(d2List, start, end):
    d2List[start][end] !=0
    return True

def checkPosibility(d2List, column):
    for i in range(d2List):
        # 갈 수 있는 정점이 존재
        if(d2List[i][column] !=0):
            return True

    #갈 수 있는 정점이 없음.
    return False


busNum, lineNum = map(int, input().split())

startPoint = int(input())-1

# 전체 그래프
graph = []

# 정점 수 만큼 row 형성
for i in range(busNum):
    graph.append([])

    # line 수 만큼 column 형성
    for _ in range(lineNum):
        graph[i].append(0)


for __ in range(lineNum):
    startPosition, endPosition, weight = map(int, input().split())

    graph[startPosition-1][endPosition-1] = weight


for i in range(busNum):
    # 자기 자신일 경우
    if(startPoint == i):
        print(0)
        continue

    else:
        pass

    # 바로 갈 수 있는지 확인하는 함수 실행, 입력: graph, 출발지, 목적지
    if(checkColumn(graph, startPoint, busNum)):
        print(graph[startPoint][i])
        continue
    else: pass

    # 가는 게 불가능 한 경우 check
    if(not (checkPosibility(graph, i))):
        print("INF")
    else: pass

    # 바로갈 수 없는 경우

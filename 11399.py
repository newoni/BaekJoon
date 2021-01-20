# <21.01.20>
# made by KH

'''
problem number 11399
시간이 적게 걸리는 사람에 앞쪽에 배치하는 게 좋음
시간이 적게 걸리는 순으로 나열 수

1번째 소요시간 * 인원수 + 2번째 소요시간 * (인원수 -1) ...
순으로 계산
'''

numPeople = int(input())

time_l = list(map(int,input().split()))

time_l.sort()

tot_time = 0

cnt = numPeople
for i in range(numPeople):
    tot_time += time_l[i] * cnt

    cnt -= 1

print(tot_time)
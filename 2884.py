'''
<21.01.30>
made by KH

problem number: 2884
source: https://www.acmicpc.net/problem/2884
'''

hour, min = map(int,input().split())

std_min = 45

if( (min-std_min) < 0):
    hour -=1
    min = 60 + (min-std_min)

    if(hour<0):
        hour = 23

elif((min-std_min==0)):
    min = 0

else:
    min = min - std_min

print(hour, min)
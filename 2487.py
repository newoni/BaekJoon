#<21.01.16>
# made by KH
tot_num = int(input())  # 섞기수열 수
list1 = list(map(int,input().split( ))) # 입력받은 섞기 수열

std_l = [i for i in range(0, tot_num)]    # 기준이 될 1~tot_num 까지의 수(변하지 않음)
break_l =std_l.copy()   # 기준이 될 1~tot_num 까지의 수(변하지 않음)

buff_l = [0]*tot_num
cnt=0

while True:
    cnt+=1
    for i in range(tot_num):
        buff_l[i] = std_l[list1[i]-1]
    std_l = buff_l.copy()

    if std_l == break_l:
        break

    elif cnt>=2000000000:
        break

print(cnt)

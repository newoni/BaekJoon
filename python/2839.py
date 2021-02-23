#<21.01.15>
# made by KH



tot_sugar = int(input())

std_val_5 = tot_sugar//5 #5로 나눈 몫을 기준값 설정

res = -1

if tot_sugar%5 == 0 : # 5로 나누어 떨어질 경우
    res = std_val_5

else:  # 아닐 경우, 3과의 조합을 생각한다.
    if (tot_sugar%5)%3 == 0:    #5로 나눈 나머지가 3인 경우,
        res = std_val_5 + 1

    for num5 in range(std_val_5,-1, -1): #5의 값을 줄여가며 그 차이만큼을 3으로 채울 수 있는지 확인
        test1 = tot_sugar - (num5*5 )
        std_val_3 = test1%3 # 3의 배수인지 확인하기 위한 수

        if std_val_3==0:
            res = num5  + test1//3
            break

print(res)
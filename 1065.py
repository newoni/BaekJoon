'''
<20.02.20>
made by KH

problem number: 1065
source: https://www.acmicpc.net/problem/1065
'''

def checkOneNubmer(num):
    strNum = str(num)

    # 한자리 숫자일 경우 한 수로 판별
    if(len(strNum)==1):
        return True

    # 한자리 숫자가 아닐 경우 등차수열 여부 확인
    else:
        buff = int(strNum[0]) - int(strNum[1])
        for i in range(1,len(strNum)-1):
            if(buff == (int(strNum[i])-int(strNum[i+1]))):
                continue
            else:
                return False
        return True


if __name__=="__main__":
    inputNumber = int(input())
    res = 0

    for i in range(1,inputNumber+1):
        if(checkOneNubmer(i)):
            res+=1
    print(res)

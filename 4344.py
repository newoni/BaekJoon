'''
<21.01.27>
made by KH

problem nubmer 4344
src = https://www.acmicpc.net/problem/4344

ref: 
 - about the function overriding
  : https://www.stechies.com/typeerror-float-object-not-callable/
  : 함수 이름과 결과값을 반환받는 변수의 이름이 같아서 오버라이딩이 일어남
'''
def avg(input_l):
    sum = 0
    for i in range(len(input_l)):
        sum += input_l[i]
    return round(sum/len(input_l), 3)


if __name__=="__main__":
    caseNumber = int(input())
    res_l =[]

    for _ in range(caseNumber):
        input_l = list(map(int,input().split()))

        studentNumber = input_l[0]
        print(input_l)
        input_l.pop(0)
        avgScore = avg(input_l)

        cnt=0
        for i in range(studentNumber):
            if(input_l[i]>avgScore):
                cnt+=1

            else:
                pass

        res_l.append(round(cnt/studentNumber*100,3))

    # 결과 출력
    for i in range(res_l):
        strResult = str(res_l[i])

        while( len(strResult)!=6  ) :
            strResult+="0"

        print(strResult +"%")



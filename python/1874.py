'''
<21.02.19>
made by KH

problem number: 1874
source: https://www.acmicpc.net/problem/1874
'''

class Stack:
    def __init__(self):
        self.stackList = []
        self.resList = []   # pop의 결과를 받아옴

    def push(self, inputNumber):
        self.stackList.append(inputNumber)

    def pop(self):
        self.stackList.reverse()
        try:
            popNumber = self.stackList.pop(0)

        except:
            self.stackList.reverse()
            self.resList.append(-1)
            return

        self.stackList.reverse()
        self.resList.append(popNumber)


# 가능성 체크
def checkPosibility(number, list):
    checkList = list.copy()
    try:
        checkList.index(number)
        return True
    except Exception as e:
        return False

if __name__=="__main__":
    stack = Stack()
    numberList = []
    result = []

    # 전체 수 입력
    inputNumber = int(input())

    # input을 위한 List 입력
    for i in range(1,inputNumber+1):
        numberList.append(i)


    #입력받고 연산
    for _ in range(inputNumber):
        component = int(input())

        #가능성 체크
        if(checkPosibility(component, numberList)):    # 가능할경우(stack을 통해서)
            indexOfComponent = numberList.index(component)

            for i in range(indexOfComponent +1):
                stack.push(numberList[0])
                numberList.pop(0)
                result.append("+")
            stack.pop()
            result.append("-")

        elif(stack.stackList[-1]==component):
            stack.pop()
            result.append("-")


        else:
            result.append(-1)

    #결과 출력
    try:
        result.index(-1)
        print("NO")

    except Exception as e:
        for i in result:
            print(i)








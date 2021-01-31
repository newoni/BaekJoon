'''
<21.01.31>
made by KH

problem number: 10828
source: https://www.acmicpc.net/problem/10828
'''

class Stack:
    def __init__(self):
        self.stackList = []
        self.resList = []

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

    def size(self):
        self.resList.append(len(self.stackList))

    def empty(self):
        if(len(self.stackList)==0):
            self.resList.append(1)

        else:
            self.resList.append(0)

    def top(self):
        if(len(self.stackList)==0):
            self.resList.append(-1)
        else:
            self.resList.append(self.stackList[-1])

def getOrder(input):
    try:
        order, number = input.split()

        return order, int(number)
    except:
        return input, None

if __name__=="__main__":

    stackTest = Stack()
    repeatNumber = int(input())

    for i in range(repeatNumber):
        order, number = getOrder(input())

        if((order == "push") and  (number != None)):
            stackTest.push(number)

        elif((order == "pop")):
            stackTest.pop()

        elif((order == "size")):
            stackTest.size()

        elif((order == "empty")):
            stackTest.empty()

        elif ((order == "top")):
            stackTest.top()

        else:
            pass

    for i in range(len(stackTest.resList)):
        print(stackTest.resList[i])




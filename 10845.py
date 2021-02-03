'''
<21.02.02>
made by KH

problem number: 10845
source: https://www.acmicpc.net/problem/10845
'''

class Queue:
    def __init__(self):
        self.queueList = []
        self.resList = []

    def push(self, inputNumber):
        self.queueList.append(inputNumber)

    def pop(self):
        try:
            popNumber = self.queueList.pop(0)

        except:
            self.resList.append(-1)
            return

        self.resList.append(popNumber)

    def size(self):
        self.resList.append(len(self.queueList))

    def empty(self):
        if(len(self.queueList)==0):
            self.resList.append(1)

        else:
            self.resList.append(0)

    def front(self):
        if(len(self.queueList)==0):
            self.resList.append(-1)
        else:
            self.resList.append(self.queueList[0])

    def back(self):
        if (len(self.queueList) == 0):
            self.resList.append(-1)
        else:
            self.resList.append(self.queueList[-1])

def getOrder(input):
    try:
        order, number = input.split()

        return order, int(number)
    except:
        return input, None

if __name__=="__main__":
    queueTest = Queue()
    repeatNumber = int(input())

    for i in range(repeatNumber):
        order, number = getOrder(input())

        if((order == "push") and  (number != None)):
            queueTest.push(number)

        elif((order == "pop")):
            queueTest.pop()

        elif((order == "size")):
            queueTest.size()

        elif((order == "empty")):
            queueTest.empty()

        elif ((order == "front")):
            queueTest.front()

        elif ((order=="back")):
            queueTest.back()

        else:
            pass

    for i in range(len(queueTest.resList)):
        print(queueTest.resList[i])




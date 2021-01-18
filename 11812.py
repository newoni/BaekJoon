#<21.01.18>
# made by KH
import math

class K_leaf:
    def __init__(self, number, maxSonNum, motherNum):
        self.number = number
        self.maxSonNum = maxSonNum
        self.motherNum = motherNum

    def calc_height(self):
        cnt = 0
        std = self.number
        while std>0:
            std -= maxSonNum**cnt
            cnt+=1

        self.height = cnt   #height는 1부터 커짐

class K_tree:
    def __init__(self, nodeNum, maxSonNum):
        self.nodeNum = nodeNum
        self.maxSonNum = maxSonNum

    def mk_tree(self):  # 트리 생성

        # 전체 leaf가 존재하는 tree를 list 형태로 생성
        self.leaf_l = []
        self.leaf_l.append(K_leaf(1,self.maxSonNum,0))    # 1번 leaf 생성

        motherLeafNum = 1
        cnt = 1  # counter 를 이용해서 motherLeafNum을 올릴 것임 (maxSonNum 번 반복마다 한 번씩)
        for i in range(2, self.nodeNum+1):       # 1번 leaf 이외의 leaf 생성

            self.leaf_l.append(K_leaf(i, self.maxSonNum, motherLeafNum))

            motherLeafNum = 1 + cnt//self.maxSonNum

            cnt+=1

            if cnt==self.maxSonNum*2:
                cnt==self.maxSonNum

    def calc_height(self):
        for i in self.leaf_l:
            i.calc_height()


def checkMother(tree_l,mother1,mother2):
    mother1 = tree_l[mother1-1].motherNum
    mother2 = tree_l[mother2-1].motherNum

    return mother1, mother2

def compareParents(tree_l,num1,num2):
    if tree_l[num1-1].motherNum == tree_l[num2-1].motherNum:
        return tree_l[num1-1].motherNum, tree_l[num1-1].motherNum

    else:
        return tree_l[num1-1].motherNum, tree_l[num2-1].motherNum

def checkHeight(tree_l, num1, num2):
    height1 = tree_l[num1-1].height
    height2 = tree_l[num2-1].height
    return height1,height2


if __name__=="__main__":
    nodeNum, maxSonNum, pairNum = map(int, input().split())

    tree = K_tree(nodeNum, maxSonNum)
    tree.mk_tree()
    tree.calc_height()

    res_l = []

    for i in range(pairNum):    # N 번 입력받음
        num1, num2 = map(int, input().split())
        cnt = 0
        while True:
            height1, height2 = checkHeight(tree.leaf_l, num1, num2)

            if num1 == num2: # 두 수가 같을 경우(부모자식인 경우)
                break

            if height1==height2:
                mother1, mother2 = compareParents(tree.leaf_l,num1,num2)
                if mother1 == mother2:
                    cnt+=2
                    break

                else:   #height가 같지만 부모가 다를 경우
                    num1= mother1
                    num2 =mother2
                    cnt+=2
                    continue

            elif height1<height2:   # height가 다를 경우(height1<height2)

                num2 = tree.leaf_l[num2-1].motherNum
                cnt += 1
                continue

            else:
                cnt+=1
                num1 = tree.leaf_l[num1-1].motherNum
                continue

        res_l.append(cnt)

    for i in range(len(res_l)):
        print(res_l[i])
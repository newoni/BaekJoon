'''
<21.02.13>
made by KH

problem number: 2798
source: https://www.acmicpc.net/problem/2798
'''''
if __name__=="__main__":
    cardNumber, objNumber = map(int, input().split())
    cards = list(map(int,input().split()))

    optimalComb = [cards[0], cards[1], cards[2]]
    for i in range(0,cardNumber-2):

        for j in range(i+1,cardNumber-1):

            for k in range(j+1, cardNumber):
                # 비교 후 대입
                sumNumber = cards[i] + cards[j] + cards[k]
                if((sumNumber<=objNumber) and (abs(sum(optimalComb) - objNumber) >= abs(sumNumber-objNumber))):
                    optimalComb = [cards[i], cards[j], cards[k]]
                else:
                    pass


    sumNumber = optimalComb[0]+optimalComb[1]+optimalComb[2]
    print(sumNumber)
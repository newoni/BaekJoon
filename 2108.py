'''
<21.01.21>

src = https://www.acmicpc.net/problem/2108

problem nubmer 2108

made by KH
'''

def avg(list):
    sum = 0
    for i in range(len(list)):
        sum += list[i]

    return round(sum/len(list))

def median(list):
    list.sort()

    if(len(list)%2 ==1): # when the length of list is odd
        idx = len(list)//2

        return list[idx]

    else: # when the length of list is even just return avg
        idx1 = len(list)//2
        idx2 = len(list)//2+1

        return (list[idx1] + list[idx2])/2

def mode(list):
   count = 0
   mode =0

   mode_l = []
   mode_l.append(mode)
   # finding mode
   for i in range(len(list)):
       if( count <= list.count(list[i])):
           mode = list[i]

   mode_l = []
   mode_l.append(mode)

   # checking find other modes
   for i in range(len(list)):
       # 1st condition: fidning there's another mode
       # 2nd condition: checking that mode is not the same with the variable name 'mode'
       # 3rd condition: checking before we already added that mode
       if( list.count(list[i]) == list.count(mode) and list[i]!=mode and mode_l.count(list[i])==0):
           mode_l.append(list[i])

   if len(mode_l)>= 2:
       mode_l.sort()
       mode = mode_l[1]


   return mode

def range_l(list):
    list.sort()

    range_num = list[-1]- list[0]

    return range_num

if __name__=="__main__":
    input_num = int(input())

    input_l = []
    for i in range(input_num):
        input_l.append(int(input()))

    print(np.average)
    print(median(input_l))
    print(mode(input_l))
    print(range_l(input_l))

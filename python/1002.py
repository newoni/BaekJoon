import math

class Turret:
    def __init__(self, case_num):
        self.case_num = case_num #input 받을 횟수
        self.res_l= []  #결과출력을 한꺼번에 하기위해서 list에 정리

    def get_input(self):    # input을 입력받음
        input_str = input()

        try:
            x_1, y_1, r_1, x_2, y_2, r_2 = input_str.split(" ")

            self.x_1 = int(x_1)
            self.y_1 = int(y_1)
            self.r_1 = int(r_1)
            self.x_2 = int(x_2)
            self.y_2 = int(y_2)
            self.r_2 = int(r_2)

        except Exception as e:
            x_1, y_1, r_1, x_2, y_2, r_2 = input_str.split(",")

            self.x_1 = int(x_1)
            self.y_1 = int(y_1)
            self.r_1 = int(r_1)
            self.x_2 = int(x_2)
            self.y_2 = int(y_2)
            self.r_2 = int(r_2)

    def calc_distance(self, x_1, x_2, y_1, y_2):    # 거리 계산
        self.r_each = math.sqrt((x_1 - x_2) ** 2 + (y_1 - y_2) ** 2)

        return self.r_each

    def find_point_num(self, each_length, r1, r2): #입력에 따라 거리 게산

        if each_length == 0 and (r1 != r2):  # 해가 없는 경우 (같은 위치에서 다른 거리)
            self.res_l.append(0)

        elif each_length == 0 and (r1 == r2):  # 해가 무한대
            self.res_l.append(-1)

        elif (each_length == (r1 + r2)) or (each_length == (abs(r1 - r2))):  # 해가 1개
            self.res_l.append(1)

        elif abs(r1 - r2) < each_length < (r1 + r2):  # 해가 2개
            self.res_l.append(2)

        elif (each_length > (r1 + r2)) or (abs(r1 - r2) > each_length):  # 해가 없는 경우(둘 사이의 거리가 긴 경우)
            self.res_l.append(0)

        else:
            pass

    def print_res_l(self):  # 결과값 차례대로 출력
        for i in self.res_l:
            print(i)

    def iter_oper(self):
        for i in range(self.case_num):
            self.get_input()    # input 받음
            self.calc_distance(self.x_1, self.x_2, self.y_1, self.y_2)
            self.find_point_num(self.r_each, self.r_1, self.r_2)

        self.print_res_l()


if __name__=="__main__":
    input_num = int(input())
    test_class = Turret(input_num)
    test_class.iter_oper()
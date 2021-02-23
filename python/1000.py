data_str = input("")
while True:
    try:
        num1, num2 = data_str.split(",")

    except Exception as e:
        num1, num2 = data_str.split(" ")

    num1 = int(num1)
    num2 = int(num2)

    if (num1>0 and num2>0 and num1<10 and num2<10):
        print(num1+num2)
        break

    else:
        data_str = input("잘못된 숫자입니다.\n")
        break

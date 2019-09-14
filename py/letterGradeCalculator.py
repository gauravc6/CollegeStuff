marks = int(input('Enter your marks:'))
while marks>100 or marks<0:
    marks = int(input('Invalid input! Marks must be between 0-100:'))
if marks in range(90,101):
    print('A')
elif marks in range(80,90):
    print('B')
elif marks in range(70,80):
    print('C')
elif marks in range(60,70):
    print('D')
else:
    print('F')

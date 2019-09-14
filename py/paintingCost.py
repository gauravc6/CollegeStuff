import math
def areaCalc(l):
    a = l[0]
    b = l[1]
    c = l[2]
    return 2*(b*c + c*a)
def final(a):
    areaCovered = 110
    return a/areaCovered
paintCost = 1000
print('Enter length, breadth and height in single line space separated:')
values = [int(x) for x in input().split()]
area = areaCalc(values)
requiredPaint = final(area)
requiredRound = math.ceil(requiredPaint)
print(f'Quantity of paint required is {requiredPaint}L, finally rounded of to:{requiredRound}L.')
print(f'Total cost to paint the room will be ₹{requiredRound*paintCost}.')

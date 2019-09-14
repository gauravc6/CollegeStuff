years = int(input('Enter number of years until retirement:'))
amt = int(input('Enter the amount saved per year:'))
while years<=0 & amt<=0:
    print('Improper values.Enter non-negative non-zero values. Re-enter both values:')
    years = int(input('Enter number of years until retirement:'))
    amt = int(input('Enter the amount saved per year:'))
print('The amount saved till retirement will be: ' + str(years*amt))

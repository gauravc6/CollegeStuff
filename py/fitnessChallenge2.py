print('Enter weight loss of each of the team member space separated:')
weights = [int(x) for x in input().split()]
while min(weights) < 0:
    print('Invalid input. Re-enter the values.')
    weights = [int(x) for x in input().split()]
print('The average weight loss of the team is: ' + str(sum(weights)/len(weights)) + 'kg.')

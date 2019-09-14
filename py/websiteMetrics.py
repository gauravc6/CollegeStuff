print('Enter all the times of visit separated by space:')
duration = [int(x) for x in input().split()]
print(f'Average time spent on the website is {(sum(duration)/len(duration))}')

d_weight = float(input('Enter the weight of your dog in kilograms:'))
n_days = int(input('Enter the number of boarding days:'))
p_cost = 50.00
total_cost = d_weight * p_cost * n_days
print(f'Total boading cost for a dog weighing {d_weight} kg. for {n_days} will be Rs. {total_cost}')

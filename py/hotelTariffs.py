n_rooms = int(input("Enter number of rooms booked:"))
d_tariff = 2500.00
n_days = int(input("Enter the number of days:"))
total_cost = n_rooms * n_days * d_tariff
print(f'Total amount for occupying {n_rooms} rooms for {n_days} days will be Rs. {total_cost}.')

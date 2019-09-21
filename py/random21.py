import random
print("Random 21 game initialized:")
tot=0
while tot<=21:
    com_turn = random.randint(1,3)
    tot +=com_turn
    flag=1
    if tot>=21:
        break
    user_turn = int(input("Enter 1,2 or 3 to add to the total:"))
    while user_turn<1 or user_turn>3:
        user_turn = int(input("Invalid input.Enter 1,2 or 3 to add to the total:"))
    tot += user_turn
if flag==1:
    print("You win! Computer added a number to make value go over 21.")
else:
    print("Computer wins! You tipped over the 21 border.")

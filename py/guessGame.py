import random
number = random.randint(1,10)  #generated random number between 1-10
print('Guessing game initialized...')
print('Enter \'0\' to exit the game.')
a = int(input('Enter your guess:'))
while a!=number and a!=0:
    if a>number:
        a = int(input('Your guess is greater. Try guessing again:'))
    else :
        a = int(input('Your guess is smaller. Try guessing again:'))
if a==0:
    print('Game exit detected.Bye!')
else:
    print('Bravo! You guessed the correct number.')

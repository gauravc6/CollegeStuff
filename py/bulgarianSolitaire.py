import random

n_piles = random.randint(0,40)

desired_pile= [1,2,3,4,5,6,7,8,9]

tot = 45
pile = []

#generate random piles
while tot>0:
    m = random.randint(0,n_piles)
    if tot-m>=0:
        pile.append(m)
        tot = tot - m

def short_pile_output():
    while pile!=desired_pile:
        for i in range(9):
            if pile[i]!=i+1:
                if pile[i]>i+1:
                    pile[i] -=1
                else:
                    pile[i] +=1
        print(pile)

def short_gen_pile():
    missing = 9 - len(pile)
    for i in range(missing):
        pile.append(0)

def long_pile_output():
    new_pile = pile[:9]
    while new_pile!=desired_pile:
        for i in range(9):
            if new_pile[i]!=i+1:
                if new_pile[i]>i+1:
                    new_pile[i] -=1
                else:
                    new_pile[i] +=1
        print(new_pile)
#prints selected pile sizes
print(f"Random pile: {pile}")

if len(pile)<9:
    short_gen_pile()
    short_pile_output()
else:
    long_pile_output()

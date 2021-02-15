import time
import copy
import random
import pygame
# from tkinter import messagebox

# initialize pygame
pygame.init()
WHITE = (255, 255, 255)
BLACK = (0, 0, 0)

MARGIN = 5
SIDE = 85

GOAL_STATE = [[1, 2, 3], [4, 5, 6], [7, 8, 0]]

FONT = pygame.font.SysFont('comicsansms',50)

WINDOW_SIZE = [275, 275]
screen = pygame.display.set_mode(WINDOW_SIZE)
pygame.display.set_caption("8 Puzzle Problem")


def generateRandomState():
    state = random.sample(range(9), 9)
    res = [state[i:i+3] for i in range(0, 9, 3)]
    coords = [(index, row.index(0)) for index, row in enumerate(res) if 0 in row][0]
    return coords, res 

def isSolvable(grid):
    inv = 0
    for i in range(2):
        for j in range(1, 3):
            if (grid[j][i] > 0 and grid[j][i] > grid[i][j]):
                inv +=1
    return True if inv%2 == 0 else False
        

z_coord, grid = generateRandomState()
z_row, z_col = z_coord

LEVEL = 0

def isValidMove(m, row, col):
    if m == 'r' and (col == 0 or col == 1):
        return True
    if m == 'l' and (col == 1 or col == 2):
        return True
    if m == 'u' and (row == 1 or row == 2):
        return True
    if m == 'd' and (row == 0 or row == 1):
        return True
    return False


def swap(z_row, z_col, row, col):
    mat = copy.deepcopy(grid)
    mat[z_row][z_col], mat[row][col] = mat[row][col], 0
    print(mat)
    return mat

def manualMove(row, col, key):

    global grid, LEVEL
    LEVEL  +=1

    if key == pygame.K_RIGHT:
        if isValidMove('r', row, col):
            grid = swap(row, col, row, col+1)
            return row, col+1

    if key == pygame.K_LEFT:
        if isValidMove('l', row, col):
            grid = swap(row, col, row, col-1)
            return row, col-1

    if key == pygame.K_UP:
        if isValidMove('u', row, col):
            grid = swap(row, col, row-1, col)
            return row-1, col

    if key == pygame.K_DOWN:
        if isValidMove('d', row, col):
            grid = swap(row, col, row+1, col)
            return row+1, col
    return row, col

def h(curr, goal):
    res = 0
    for i in range(3):
        for j in range(3):
            res += abs(curr[i][j] - goal[i][j])
    return res

def g():
    return LEVEL

def heuristic(curr, goal):
    return h(curr, goal) + g()

initialCost = heuristic(grid, GOAL_STATE)
print(initialCost)

def automaticMove(row, col):

    candidateMoves = {}

    if isValidMove('r', row, col):
        candidate = swap(row, col, row, col+1)
        candidateMoves[pygame.K_RIGHT] = heuristic(candidate, GOAL_STATE)
    
    if isValidMove('l', row, col):
        candidate = swap(row, col, row, col-1)
        candidateMoves[pygame.K_LEFT] = heuristic(candidate, GOAL_STATE)
    
    if isValidMove('u', row, col):
        candidate = swap(row, col, row-1, col)
        candidateMoves[pygame.K_UP] = heuristic(candidate, GOAL_STATE)
    
    if isValidMove('d', row, col):
        candidate = swap(row, col, row+1, col)
        candidateMoves[pygame.K_DOWN] = heuristic(candidate, GOAL_STATE)

    print(candidateMoves)
    move = min(candidateMoves, key = candidateMoves.get)
    print(move)
    
    return manualMove(row, col, move)

running = True


while running:
    
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False
        elif event.type == pygame.KEYDOWN:
            # z_row, z_col = automaticMove(z_row, z_col)
            # z_row, z_col = manualMove(z_row, z_col, event.key)    
            

        for row in range(3):
            for col in range(3):
                color = WHITE
                if grid[row][col] == 0:
                    color = BLACK
                pygame.draw.rect(screen, color, [(MARGIN + SIDE) * col + MARGIN, (MARGIN + SIDE) * row + MARGIN, SIDE, SIDE])
                number = FONT.render(str(grid[row][col]), True, BLACK)
                screen.blit(number, (((MARGIN + SIDE) * col + MARGIN) + SIDE/3, ((MARGIN + SIDE) * row + MARGIN) + MARGIN))

    if grid == GOAL_STATE:
        running = False
        print(f"Puzzle Solved! Moves Made: {moves}")
    
    pygame.display.flip()
pygame.quit()
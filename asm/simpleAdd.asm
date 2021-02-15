
org 100h

mov [1001H], 09H
mov [1002H], 03H
mov al, [1001H]
add al, [1002H]

mov cl, al

ret





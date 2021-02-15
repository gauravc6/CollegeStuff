
org 100h

mov [1000H], 02H
mov [1001H], 20H
mov [1002H], 32H
mov [1003H], 40H
mov [1004H], 56H

cld

mov cx, 05H
mov si, 1000H
mov di, 2000H
rep movsb

ret

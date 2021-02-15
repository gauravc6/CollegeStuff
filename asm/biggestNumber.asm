org 100h

    mov [1000H], 50H
    mov [1001H], 23H
    mov [1002H], 45H
    mov [1003H], 70H
    mov [1004H], 22H
    mov [1005H], 06H

    mov cx, 06H

    mov si, 1000H
    mov al, [si]

    lbl1:
        cmp al, [si] 
        jle lbl2
    lbl3:
        inc si
        dec cx
        jnz lbl1
        hlt
    lbl2:
        mov al, [si]
        jmp lbl3
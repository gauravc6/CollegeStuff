org 100h

    mov cl, 00H
    mov al, 7FH
    mov bl, 02H
    loop1:
        cmp al, bl
        jae lbl1
        mov ah, cl
        hlt
    lbl1:
        sub al, bl
        inc cl
        jmp loop1                             
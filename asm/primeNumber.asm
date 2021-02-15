org 100h

    mov bl, 11H
    mov cl, 02H
    lbl1:
        mov ah, 00H
        cmp bl, cl
        jz lbl2
        mov al, bl
        div cl
        cmp ah, 00H
        jz lbl3
        inc cl
        jmp lbl1
    lbl2:
        mov dx, offset prime
        call disp
        ret
    lbl3:
        mov dx, offset not_prime
        call disp
        ret
    prime db 'Prime number','$'
    not_prime db 'Not a prime number','$'
    disp:
        mov ah, 09H
        int 21H
        mov ah, 4CH
        int 21H

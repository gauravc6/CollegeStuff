org 100h

    mov bl, 05H
    mov cl, 01H
    mov al, cl
    lbl1:
        mul cl
        cmp bl, cl
        jz lbl2
        inc cl
        jmp lbl1
    lbl2:
        mov dl, al
        ret
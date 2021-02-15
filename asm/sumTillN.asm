org 100h

    mov bl, 04H
    mov cl, 01H
    mov al, 00H
    lbl1:
        add al, cl
        cmp bl, cl
        jz lbl2
        inc cl
        jmp lbl1
    lbl2:
        ret
        
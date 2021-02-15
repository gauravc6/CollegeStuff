
org 100h

    mov al, 11H
    mov bl, 02H
    div bl
    cmp ah, 00H
    jz lbl1
    mov dx, offset odd
    call disp
    ret
    lbl1:
        mov dx, offset even
        call disp
        ret
    odd db 'Given number is Odd.', '$'
    even db 'Given number is Even.', '$'
    disp:
        mov ah, 09H
        int 21H
        mov ah,4CH
        int 21H
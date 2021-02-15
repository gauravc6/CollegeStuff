org 100h

    mov al, 02H
    mov bl, 03H
    dec bl
    mult:
        add al, 02H
        dec bl
        jnz mult
    
    mov dl, al
    
hlt
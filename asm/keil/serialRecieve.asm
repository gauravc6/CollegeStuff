; Recieve data using serial communication - baud rate 9600
mov tmod, #20H
mov scon, #50H
mov th1, #0FDH
setb tr1
read:
	jnb  ri, read
	mov a, sbuf ; store in accumulator
	mov p0, a ; store in p0
	clr ri
end 
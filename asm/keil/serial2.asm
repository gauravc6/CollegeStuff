; Display "VIT" using serial communication using baud rate 9600 - mode 1 and timer 1 mode 2
mov tmod, #20H
mov th1, #0FDH
mov scon, #50H
setb tr1
back:
	mov a, #'V'
	acall transfer
	mov a, #'I'
	acall transfer
	mov a, #'T'
	acall transfer
	sjmp back
	
transfer:
	mov sbuf, a
here:
	jnb ti, here
	clr ti
	ret
end
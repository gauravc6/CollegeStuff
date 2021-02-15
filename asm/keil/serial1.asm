; Display "A" using serial commmunication mode 0

mov scon, #00H
back:
	mov sbuf, #"A"
here:
	jnb ti, here
	clr ti
	sjmp back
end
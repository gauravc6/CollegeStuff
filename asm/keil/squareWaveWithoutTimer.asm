; Square wave with 200ms delay without timers

mov p1, #00H
back:
	cpl p1.3
	acall delay
	sjmp back

delay:
	mov r1, #48
here:
	djnz r1, here
	ret
end
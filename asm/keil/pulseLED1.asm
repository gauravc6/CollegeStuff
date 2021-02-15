mov p1, #00H
back:
	cpl p1.3
	acall delay
	sjmp back

delay:
	mov r1, #48
here1:
	djnz r1, here1
	ret
end
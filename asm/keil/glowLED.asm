; Create pulse wave of 5ms  - 40% duty cycle using timers.

; ON Time - 2ms
; OFF Time - 3ms
mov tmod, #00H
back:
	mov p1, #55H
	acall onDelay
	mov p1, #0AAH
	acall offDelay
	sjmp back
onDelay:
	mov th0, #0C6H
	mov tl0, #0DH
	setb tr0
here1:
	jnb tf0, here1
	clr tr0
	clr tf0
	ret
offDelay:
	mov th0, #0A9H
	mov tl0, #13H
	setb tr0
here2:
	jnb tf0, here2
	clr tr0
	clr tf0
	ret
end
	
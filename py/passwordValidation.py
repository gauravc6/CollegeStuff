import re
str1 = input('Enter a password that has atleast 1 number, 1 alphabet and 1 special character. Password must be more than 6 and less than 25 character spaces:')
n_pattern = re.compile(r'[0-9]')
s_upp_pattern = re.compile(r'[A-Z]')
spec_pattern = re.compile(r'\W')
while len(n_pattern.findall(str1))<1 or len(spec_pattern.findall(str1))<1 or len(s_upp_pattern.findall(str1))<1 or len(str1)<6 or len(str1)>25:
    str1 = input('Invalid Password format. Make sure your password follows the specified convention.Re-enter:')
print('Valid password registered')

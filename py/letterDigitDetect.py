import re
n_pattern = re.compile(r'[0-9]')
s_pattern = re.compile(r'[a-zA-Z]')
str1 = input('Enter a string that contains 4 digits and 4 letters:')
while len(n_pattern.findall(str1))<4 or len(s_pattern.findall(str1))<4:
    str1 = input('Incorrect format. Enter a string that contains atleast 4 digits and 4 letters:')
print(f'Valid input registered: {str1}')

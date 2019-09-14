import re
pattern = re.compile(r'[aeiouAEIOU]')
str1 = input('Enter a string to count vowels present in it:')
print('Number of vowels in the entered string is ' + str(len(pattern.findall(str1))))


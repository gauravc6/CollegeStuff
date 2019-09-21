import random
import re
pattern = re.compile(r'\([1-6]{2,}\)')
nums = [str(random.randint(1,6)) for x in range(25)]
final = ""
if nums[0]==nums[1]:
    final+="("
for i in range(len(nums)):
    if i>0 and i<24 and nums[i] == nums[i+1] and nums[i]!= nums[i-1]:
        final +="("
    final+=nums[i]
    if i>0 and i<24 and nums[i-1] == nums[i] and nums[i]!= nums[i+1]:
        final +=")"
    i+=1
if nums[-1]==nums[-2]:
    final+=")"
print(final)
matches = pattern.findall(final)
print(max(matches))

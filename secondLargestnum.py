n=input("enter the string")
digits=set()
for i in n:
    if i.isdigit():
        digits.add(int(i))

if len(digits)<2:
    print("second largest number",-1)
else:
    sorted_digits=sorted(digits,reverse=True)
    print("second largest digit",sorted_digits[1])
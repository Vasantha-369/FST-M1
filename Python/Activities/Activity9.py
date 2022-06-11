from numpy import array
a=array([1,2,3,4,5,6]) # odds from here
b=array([7,8,9,10,11,12]) # evens from here

c = []
for num in a:
    if (num % 2 != 0):
        c.append(num)
        
# Iterate through first list to get even elements
for num in b:
    if (num % 2 == 0):
        c.append(num)
print(c)
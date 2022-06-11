input_string = input("Enter a list element separated by space ")
listRange  = input_string.split()

total = 0

# Iterate each element in a list
for num in listRange:
    total += int (num)

# Get total value    
print("Sum of all elements in the list = ",total)
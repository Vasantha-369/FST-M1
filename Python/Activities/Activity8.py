input_string = input("Enter a list element separated by space ")
listRange  = input_string.split()

if listRange[0] == listRange[-1]:
    print('Result is True')
else:
    print('Result is False')
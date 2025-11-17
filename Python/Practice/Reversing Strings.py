def reverse(word):
    if (6>len(word)>=1):
        print(word[::-1])


    if (12>len(word)>=6):
        if (len(word)%2 == 0):
            print(word[::-2])
        elif (len(word)%2 != 0):
            print(word[len(word)-1::-1])


    if (len(word)>=12):
        if (len(word)%2 == 0):
            print(word[::-4])
        elif (len(word)%2 != 0):
            print(word[::-3])
        

x = input("Enter a word: ")

reverse(x)
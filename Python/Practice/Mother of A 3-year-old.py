# Request the user's name and their choice of how many times they want their name printed


def name_print(name, print_num):

    run = True
    while (run):
        print(user_name)
        print_num-=1
        if print_num == 0:
            run = False


user_name = input("Enter your name: ")
repeat = int(input("Repeat how many times? "))
name_print(user_name, repeat)

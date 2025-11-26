#VARIABLES
**Two variables** of the same type can be **initialized simultaneously**.
'''
    int x=90, y=56;
    boolean a, b;
'''

**int** types can be **written with underscore**s and will still compile.
This can aid readability.
'''
    int z=900_421;
'''
* The underscore will not be displayed if the value is printed.

**Constants** are variables whose value cannot change. A variable is made constant using the keyword *final*.
'''
    final String CAT_NAME = "Myran";
'''
* Constants are usually written in all caps and words are separated by underscores, but these are not required.



#OPERATOR PRECEDENCE

1. operators within parentheses
2. increment or decrement operators
3. multiplication and division (left to right)
4. addition and subtraction (left to right)



#TERNARY CONDITIONAL OPERATOR ?:
'''
    condition ? value1 : value2
    z = (y<x) ? x : y;
    //as an if-else statement
    if (y<x){
        z=x;
    } else {
        z=y;
    }
'''

* If *condition* is true, assign the value of *value1* to the result of. Otherwise, assign the value of *value2* to the result.
# VARIABLES
**Two variables** of the same type can be **initialized simultaneously**.
```
int x=90, y=56;
boolean a, b;
```

**int** types can be **written with underscore**s and will still compile.
This can aid readability.
```
int z=900_421;
```
* The underscore will not be displayed if the value is printed.

**Constants** are variables whose value cannot change. A variable is made constant using the keyword *final*.
```
final String CAT_NAME = "Myran";
```
* Constants are usually written in all caps and words are separated by underscores, but these are not required.



# OPERATOR PRECEDENCE
1. operators within parentheses
2. increment or decrement operators
3. multiplication and division (left to right)
4. addition and subtraction (left to right)



# TERNARY CONDITIONAL OPERATOR   ?:
```
condition ? value1 : value2
z = (y<x) ? x : y;

//as an if-else statement
if (y<x){
    z=x;
} else {
    z=y;
}
```
* If *condition* is true, assign the value of *value1* to the result of. Otherwise, assign the value of *value2* to the result.



# `switch` STATEMENT
```
double price = 1.99;
double discount = 0;
String condition = "used";

switch(condition){
    case "damaged":
        discount = price*0.2;
        break;
    case "used":
        discount=price*0.2;
        break;
    default:
        discount=price;
}
```
* The state/value of the condition determines which case (set of code) will be executed.



# Arrays
Format opt.1: value_type[] arrayName = new value_type[array_size]
* all values will be initiated with their default values
```
int[] array1 = new int[5];
array1[0] = 89;  //assigns the index 0 (first index) the value of 89
array1[4] = 76;  //assigns the index 4 (last index) the value of 76
```

Format opt.2: value_type[] arrayName = {value1, value2, value3, ...}
* initializes a new array with defined values and size
```
String[] array2 = {Jeremy, Jason, Jackie, Jesse, Jessica, Jasmine};
```

Referencing values in an array:
```
System.out.println(array2[1] + " is 56 years old.");  //output: Jason is 56 years old.

System.out.println(array1[0] + array1[4]);  //output: 165 (the value of 89+76)
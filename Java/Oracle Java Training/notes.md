Two variables of the same type can be initialized simultaneously.
---
    int x=90, y=56;
    boolean a, b;
---

int types can be written with underscores and will still compile.
This can aid readability.
---
    int z=900_421;k
---
* The underscore will not be displayed if the value is printed.

Constants are variables whose value cannot change. A variable is made constant using the keyword *final*.
---
    final String CAT_NAME = "Myran";
---
* Constants are usually written in all caps and words are separated by underscores, but these are not required.

Operator Precedence
    1. operators within parentheses
    2. increment or decrement operators
    3. multiplication and division (left to right)
    4. addition and subtraction (left to right)
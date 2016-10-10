# Practice Your Java Level 1

## Chapter 1: For Starters

### Packages
- Java packages are not nested, so java.nio.file.* does not 'include' java.nio.file.attribute.*  
- By default java.lang.* is imported, and the other types in the package that your class is part of.  

### Access modifiers
- public: visible for all
- static: a Class level field, all objects share the same field. Field value can be changed by all object instantiations.

### Definitions
- Method signature: method name plus all the types of the input parameters
- Method declaration: method name plus its access scope, the input types and parameter names, the output type of the method
- Method overloading: methods with the same name but with different input tyes

### Miscellaneous
- return _value_ is valid, just as return _(value)_ is. The parentheses are **not** required.
- Methods can be called using a variable number of arguments, to do this the last input field in the method declaration must be used, example:

``` Java
static long addIntegers(int... intArray) {
    if(intArray.length == 0) return 0;
    // etc.
}
```

## Chapter 2: Console Handling I: Basic Output

### System.out.printf
- uses formatting parameters to format the output:
    - %s - String format
    - %d - Decimal format
    - %f - Floatin point format
    - \n - newline
    - \t - tab

## Chapter 3: Number Handling I: Numerical Primitives


- primitives: byte, short, int, long, float, double
- some operations cannot be performed directly on primitives, therefore Java introduced wrapper classes. These classes serve as a collection point for all methods related to the specific primitive. Examples:
    - int : Integer
    - short : Short
    - long : Long
- numbers by default are treated as ints, to assign a larger value suffixes (case insensitive) must be used:
    - xL for a Long value
    - xF for a Float value
    - xD for a Double value
- Underscores can be used to increase readability in long numbers, examples:
```Java
long firstLong = 7000000000L;
long firstLong = 7000_000_000L;
long firstLong = 7_000_000_000L;
long firstLong = 7__000____000_000L;
```
- Float precision is 6-7 digits
- When absolute precision is required, use BigDecimal

## Casting
With _casting_ a type conversion is forced, example:
```Java
int a = 50;
short b = (short)a;
```
The cast will be done, regardless of the fact that the value may not fit into the target type, in
 the previous example when a is larger than 32767. An object of any class can always be casted 
 into a variable of any of its ancestor classes, a so-called _upcast_. The other way round, 
 casting to a more specific class type is called a _downcast_, which will not always work. If 
 there is a chance that it will work at runtime, no compilation error will be given.  
 The compiler will perform an implicit cast when appropriate, for example:
 ```Java
 int a = 10; long b = 30;
 long result = a + b; // a is implicitly cast to a long
 ```
 The compiler will not do this if there is a risk of data loss, it will then insist on making the
  cast explicit.  
  To avoid data loss due to type overrun, use the _Math_ class _Exact_ method.
  
  ## Constants
  A constant is declared using the keyword _final_.
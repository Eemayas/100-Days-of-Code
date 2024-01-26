# 100-Days-of-Code

# Day 1 - Introduction of JAVA, JRE, JVM, WORA

* Java is platform independent because you can run on any machine irrespective of hardware or OS. but it must have JVM.
* JVM is not platform independent. JVM must be built for that particular OS.
* JVM accept only byte code not normal code .
* Java compiler convert the normal code into byte code.
* You need to specify which file to run and that file must contain main method.
* while execution, it will look for specific signature like public static void
* main will accept some parameter: String a[]
* Object-oriented
* JVM is the part of Java Runtime Environment(JRE)
* Java application is WORA Write Once Run Anywhere

# DAY 2 - Variables, Data type, Literals

* Data stored permanently in database but while processing data is stored in variable temporarily.
* Java is strongly type language meaning each type of data (such as integers, characters, strings, etc.) is explicitly defined and enforced, and the compiler or interpreter checks for type errors during compilation or runtime.
* **"println"** will print the value and go to new line just like "\n" in C++.

### Data type (2 type):
* **Primitive**
  * integers,
  * Float
  * Characters
  * Boolean
* …(talk about second type is later)

### Literals
* **0b101****== binary format== will print 5
* **0x7E**==Hex format==will print 126
* **10_00_00_000"**==will print 100000000
* Character can also be incremented.

# Day 3 - Type Conversion, Type Promotion, Assignment Operators, Relational Operators

* Here, b is in byte and a is in int.
  * ```b=(byte)a;```==>casting(explicitly)
  * ```a=b```=>conversion(implicitly)
* ```int x1=(int)5.6f;```  // will lose the value after the point
* Conversion of int into byte will convert that into modulo.
        Example:
  ```
        Byte b=127;
        Int a=257;
        b=(byte)a;// ⇒ b=257%256⇒value of a% range of byte(i.e. 256) ⇒ will print 1
  ```
### Type Promotion
For example the byte is multiplied by another byte the result will be byte but if the result is out of the range of byte then it can be saved in another type variable like int
  ``` 
      byte b1 = 10;
      byte b2 = 30;
      int result = b1 * b2;
      System.out.println("Type promotion example : " + result);// will print 30
  ```
# Day 4 - Logical Operators, Conditional Statement (if-else,if-else-if, switch , variation of switch)
* Java doesnot depend upon indentation
```
        if (x <= 10) 
        System.out.println("Value of x is less than or equal to 10");
        else 
        System.out.println("Value of x is greater than 10");//this will work fine
```
* You have to use {} in if-else if you have multiple statement
* Can add multiple match value in single case in switch statement 
```
       case "Saturday", "Sunday":
              //code
```
* Can use ```->``` after case too
```
        case "Saturday", "Sunday" ->
                System.out.println("Alram at 6am");
```
* Switch can use as expression
```
        String alarm = switch (day) {
                 case "Saturday", "Sunday" -> "Alarm at 6am";
                 case "Monday" -> "Working Day, Alarm at 8am";
                 default -> "Alarm at 7 am";
          };
```
* ```->``` can be replaced by ```:yield```
```
         String alram1 = switch (day) {
              case "Saturday", "Sunday":
                             yield "Alarm at 6am";
               case "Monday":
                             yield "Working Day, Alarm at 8am";
                 default:
                          yield "Alarm at 7 am";
           };
```

# Day 5 - Loops, class, Objects

* If you know the number of iteration, condition, initial , then it is best to use for loop.
* While reading the file, you donot have the required number of iteration, you just have to check for EndOfFile(EOF) then it is best to use while loop.
* When you have execute code once regardless of the condition, then do-while is best. For operation like reading database.
* In Java, what you want to do you have to do it in class.
* Class can be create in same file
* ```className variableName;``` ⇒ will only create reference, the object isnot begin created yet.
* ```className variableName=new className(); ```⇒ will initilzed the object of the class
```
       For example:
                  ClassName ⇒ Calculator{....}
                   Initialization ⇒ Calculator Cal=new Calculator();
```
* To call the method of the class, you have to ```classVariableName.funcName```
```
    For Example:
            funcName ⇒```public int add() {}```
             Calling method ⇒ ```int result = Cal.add();```
```

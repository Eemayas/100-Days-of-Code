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

**Data type (2 type):**
* **Primitive**
  * integers,
  * Float
  * Characters
  * Boolean
* …(talk about second type is later)

**Literals**
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
**Type Promotion**
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

# Day 6 - JRE, JVM, JDK, Method, Array, Stack, Heap

**JDK ⇒ Java Development Kit** 
 * Normal code to byte code.
 * JDK consist of JRE and JVM.

**JRE ⇒ Java Runtime environment**
 * Used when prebuilt library, and any other component that is not yours.

**JVM ⇒ Java Virtual Machine**
 * Execute the code there.
 * is the part of JRE.

**Method overloading ⇒** number of the parameter different but same function name but can have same or different return type.

* Data stored in stack in sequence but in heap, data is stored in open space
* Every method has its own stack.
* Variable created inside the method 
             ⇒local variable 
              ⇒reside in Stack
* When creating the new object of the class, it will create it in heap. That object will have their own address.
* Inside that object, there is two section: instance variable and method declaration. 
* In stack, local variable-value pair, (objName-of-class)-(address-of-new-instance-of-class-in-heap) pair is stored 
```
class Calculator {
          int a;// instance variable ⇒ stored in heap

            // method declaration stored in heap but the definition is in their own stack
          public int add(int num1, int num2) {
                           // num1 and num2 are local variable ⇒ stored in stack
            …    }

          // Overloading the add Function
          public int add(int num1, int num2, int num3) {
                          ….    }
 }
```

**Initialization of Array :**
* ```int num[]=new int [required-size-of-array];```
    * Content of the array is not known
    * You cannot change the sized dynamically.
    * Initially all the value is 0.
* ```int num[] = { 1, 2, 3 }; ```
    * content of the array is known

# Day 7 - Multidimensional, Array, Jagged Array, 3D Array, Array of Objects 

**Initilization of Multidimension Array(2-D):**

```int nums[][]=new int[3][4];```

**Regular array** 
 * Have same column number for all rows
 
**Jagged array**
 * Internal array/column can have the different size.

**Initialization of Jagged array**

```int numj[][] = new int[3][]; *//jagged array```

* In Jagged array, you have to specify individually for each row how many column you have in that row
```
int numj[][] = new int[3][]; //jagged array
numj[0]=new int[3];
numj[1]=new int[4];
numj[2]=new int[2];
```

* ```arrayName.length``` ⇒ length of the array

* ```Math.random() ```
     * return the random double value 
     * range 0.0 to 1.0

* ```for (int n : nums) {}``` 
    * can loop through the array. This example array is nums

**Initialization of 3D Array**

```int num3d[][][]=new int[3][3][3];```

**Kinda drawbacks of Array**
* Length is fixed during initialization.
* Searching and inserting ⇒ traverse all value ⇒more computation.
* No array of different type.

# Day 8 - String, Mutable & Immutable String, StringBuffer, StringBuilder

* String in double quote ⇒``` “” ```
* Sting is actually a class 

**Initialization of string**
```
String name = "Prashant";
    Or
String name1 = new String("Prashant");
```
* ```name1.hashCode``` ⇒ Returns a hash code for this string. The hash code for a String object is computed as   s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
* ```+``` ⇒ concatenate the String
* ```name1.concat(" Manandhar")``` ⇒Concatenates the specified string to the end of this string.
* ```name1.charAt(0);``` ⇒Returns the char value at the specified index.

* Heap consist of string constant pool. It cannot be changed.
* Here, the only one of the object is created in string constant pool in  heap and name3 and name4 are the reference to that object address in the heap
```
    String name3 = "Prashant";
    String name4 = "Prashant";
```

* ```name3 = name3 + " Manandhar"; ```
    * Creating a new object in string constant pool in  heap and changing the address in variableName-Address pair in Strack
    * *Prashant previously stored in the name3 will be eligible for garbage collection and removed after some time to free up some memory

 * Once you create a object you can  change it. Changes will create the new object.

**Types of String**
* Mutable String ⇒ change
* Non-Mutable String(Default) ⇒unchanged

* For mutable string, you use String Buffer class or string builder class

**Initilization of StringBuffer**
```
StringBuffer sb= new StringBuffer();
            Or
StringBuffer sb= new StringBuffer("Prashant");
```

# Day 9 - Static Variable, Static Methos, Static Block
* Static variable will be shared by every objects
* Static variable can be accessed and modified by ```className.staticVariableName```
* You can only use static variable inside the static method. Using the non static variable will create an error.
* To use the nonstatic variable you have ti use the object reference pass to the static function like this
```
    public static void show1(Mobile obj) {
                        System.out.println(obj.brand + " " + obj.price + " " + name);
            }
```
* Main is static from start. If the main is not static then we first have to create the object of the class in which the main is defined. If the main is not executed, there is no way of creating the object. So this will create the deadlock.
* Making the main static, you don't need the object.
    * will run only once, no matter how many time the class obje has been created.
    * when the class is loaded, the static block will be called. Then after the object of the class is created.
```
      static {
                name = "Mobile";
            }
```

* Below code will run if any new class object has been  created.
```
    public Mobile(){
                           brand="New Brand";
                            price=00;
                            System.out.println("in a constructor");
                }
```
* Class can be loaded by two type
    * by creating a object ⇒ execute static for 1st classobject created and constructure for every object created
    * by using ```Class.forName("className");``` ⇒ will only execute the static block only
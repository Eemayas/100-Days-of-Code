# 100-Days-of-Code (Java)

# Day 1 - Introduction of JAVA, JRE, JVM, WORA

* Java is platform independent because you can run on any machine irrespective of hardware or OS. but it must have JVM.
* JVM is not platform independent. JVM must be built for that particular OS.
* JVM accept only byte code not normal code .
* Java compiler convert the normal code into byte code.
* You need to specify which file to run and that file must contain main method.
* While execution, it will look for specific signature like public static void
* main will accept some parameter: ``String a[]``
* Object-oriented
* JVM is the part of Java Runtime Environment(JRE)
* Java application is WORA Write Once Run Anywhere

# DAY 2 - Variables, Data type, Literals

* Data stored permanently in database but while processing data is stored in variable temporarily.
* Java is strongly type language meaning each type of data (such as integers, characters, strings, etc.) is explicitly defined and enforced, and the compiler or interpreter checks for type errors during compilation or runtime.
* ``println`` will print the value and go to new line just like ``\n`` in C++.

**Data type (2 type):**
* **Primitive**
  * Integers
  * Float
  * Characters
  * Boolean
* …(talk about second type is later)

**Literals**
* **0b101** == > binary format== will print 5
* **0x7E** == > Hex format==will print 126
* **10_00_00_000"**== >will print 100000000
* Character can also be incremented.

# Day 3 - Type Conversion, Type Promotion, Assignment Operators, Relational Operators

* Here, ``b`` is in ``byte`` and ``a`` is in ``int``.
  * ``b=(byte)a;``==>casting(explicitly)
  * ``a=b``=>conversion(implicitly)
* ``int x1=(int)5.6f;``  // will lose the value after the point
* Conversion of ``int`` into ``byte`` will convert that into modulo.
Example:
```
    byte b=127;
    int a=257;
    b=(byte)a;    // ⇒ b=257%256    ⇒value of a% range of byte(i.e. 256)  ⇒ will print 1
```
**Type Promotion**
For example, the ``byte`` is multiplied by another ``byte`` the result will be ``byte`` but if the result is out of the range of ``byte`` then it can be saved in another type variable like ``int``
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
* You have to use ``{}`` in ``if-else`` if you have multiple statement
* Can add multiple match value in single case in switch statement 
```
    case "Saturday", "Sunday":
           //code
```
* Can use ``->`` after case too.
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
* ``->`` can be replaced by ``:yield``
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
* While reading the file, you donot have the required number of iteration, you just have to check for ``EndOfFile(EOF)`` then it is best to use while loop.
* When you have execute code once regardless of the condition, then do-while is best. For operation like reading database.
* In Java, what you want to do you have to do it in class.
* Class can be create in same file
* ``className variableName;`` ⇒ will only create reference, the object isnot begin created yet.
* ``className variableName=new className(); ``⇒ will initilzed the object of the class
```
    For example:
        ClassName ⇒ Calculator{....}
        Initialization ⇒ Calculator Cal=new Calculator();
```
* To call the method of the class, you have to ``classVariableName.funcName``
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
    * reside in Stack
    * local variable 
* When creating the new object of the class, it will create it in heap. That object will have their own address.
* Inside that object, there is two section: instance variable and method declaration. 
* In stack, ``local variable-value pair``, ``(objName-of-class)-(address-of-new-instance-of-class-in-heap)`` pair is stored .
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
    * Initially all the value is ``0``.
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

* ``arrayName.length`` ⇒ length of the array

* ``Math.random() ``
     * return the random double value 
     * range ``0.0`` to ``1.0``

* ```for (int n : nums) {}``` 
    * can loop through the array. This example array is nums

**Initialization of 3D Array**

```int num3d[][][]=new int[3][3][3];```

**Kinda drawbacks of Array**
* Length is fixed during initialization.
* Searching and inserting     ⇒ traverse all value     ⇒more computation.
* No array of different type.

# Day 8 - String, Mutable & Immutable String, StringBuffer, StringBuilder

* String in double quote ⇒`` “” ``
* Sting is actually a class 

**Initialization of string**
```
String name = "Prashant";
    Or
String name1 = new String("Prashant");
```
* ``name1.hashCode`` ⇒ Returns a hash code for this string. The hash code for a String object is computed as   s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
* ``+`` ⇒ concatenate the String
* ``name1.concat(" Manandhar")`` ⇒Concatenates the specified string to the end of this string.
* ``name1.charAt(0);`` ⇒Returns the char value at the specified index.

* Heap consist of string constant pool. It cannot be changed.
* Here, the only one of the object is created in string constant pool in  heap and name3 and name4 are the reference to that object address in the heap
```
    String name3 = "Prashant";
    String name4 = "Prashant";
```

* ```name3 = name3 + " Manandhar"; ```
    * Creating a new object in string constant pool in  heap and changing the address in variableName-Address pair in Strack
    * Prashant previously stored in the name3 will be eligible for garbage collection and removed after some time to free up some memory

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
**StringBuffer**
* provide you with buffer of size
* size can be calculated by  ``sb.capacity()``
* initially size is ``16`` later will increase

**Conversion of StringBuffer to String**
```
String ss=sb.toString();
```

* ``sb.length()`` ⇒ length of the string
* ``sb.append(" Manandhar") ``⇒Appends the specified string to this character sequence.
* ``sb.deleteCharAt(5)`` ⇒Removes the char at the specified position in this sequence. This sequence is shortened by one char.
* ``sb.insert(0,"Java ")`` ⇒Inserts the string into this character sequence.

 * **StringBuffer**⇒ thread-safe
 * **Stringbuilder**⇒ not thread-safe
* Thread (..Talk about this later)

# Day 9 - Static Variable, Static Methos, Static Block
* Static variable will be shared by every objects
* Static variable can be accessed and modified by ``className.staticVariableName``
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
    * by using ``Class.forName("className");`` ⇒ will only execute the static block only

# Day 10 - Encapsulation
* ``Private`` ⇒ we can use the variable from the same class. Outside the class the usage of the variable is not possible.
* Only way of access this is by method.
```
    private int age;
    private String name;
    
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
```

* ``getAge`` and ``setAge`` are getter and seller function

# Day 11 - ``this`` keyword
* The ``this`` keyword is often used to distinguish instance variables from local variables with the same name.
* The ``this`` keyword is used within the scope of a class to refer to the current instance of the class. It emphasizes the instance-level scope and is not applicable outside the context of a class.

# Day 12 - Default Constructor, Parameterized Constructor
* When initialization of the object of the class, by default the int value is 0 and string is null.
* Default constructor is used to assigned the value when created.

# Constructor
* look like the method itself.
* No need for return type.
* Name of the constructor should be same as the class Name
*Call every time when object is created.
```
    // Default Constructor
        public Human() {
                age = 20;
                name = "Prashant";
                System.out.println("in constructor");
        }

    // calling Default Constructor
    Human obj = new Human();
```
* If you want to perform any operation, do it in method do not do it in statement.
* For database initialization, you can do in constructors.
* Constructor with parameter is called Parameterized constructor
```
    // Parameterized Constructor
    public Human(int age, String name) {
                this.age = age;
                this.name = name;
                System.out.println("in constructor");
    }

    // calling Parameterized Constructor
    Human obj1 = new Human(30,"Ram");
```

* I think we can create parameterized constructor only but the ``Human obj = new Human();`` will give error you have to use parametrized in calling too.

# Day 13 - Super and This Method, Naming 
```
class A { // super class
    ………………..
}

class B extends A {
    ……………
}
```
* Creating the object of the B  the constructor of the A (super class) is also called. 
* When the default constructor of B is called, the default constructor is called.
* When the parameterized constructor of B is called, the default constructor is called 

**Super()**
* First statement of the constructor is by default super, even though you have not mentioned it.
* meaning “call the default constructor of the super class”.

* ``super();`` ⇒will call the default constructor of super class i.e ``A``
* ``super(actual parameter);``⇒ will call the parameterized constructor of super class i.e ``A``.

* Every class in java extends Object class

* ``this();``  ⇒ call the constructor of same class
```
    //Calling 
    B obj1 = new B(5);
    
    //class
    class B extends A {
            public B() {
            System.out.println("In constructor B");
        }
    }
    
    public B(int n) {
        this();
        System.out.println("In Parameterized B ");
    }
```         
* will print
```
    In constructor A
    In constructor B
    In Parameterized B
```
* Program flow was first call parameterized constructor and this of parameterized constructor call default constructor B and default constructor B call default constructor A and print ``“In constructor A”`` and return to default constructor B and print ``“In constructor B”`` and return to parameterized constructor B and print ``“In Parameterized B”``.

**Naming**
* camel casing.
* class and interface name ⇒ first letter should be capital ⇒ ``Class``, ``MyClass``
* variable and method ⇒ start small ⇒``marks``, ``show()``, ``showMyName()``
* consts ⇒ all capital⇒ ``PIE``,``BRAND``
* ``Human()`` ⇒constructor ⇒ first name capital implies class and () implied method

# Day 14 - Anonymous Object, Inheritance, Types of Inheritance

**```new A()```**
* create an object.
* anonymous object because it has no name.
* no way of reusing this kind of object.

**Type of Inheritance**
* Single Level
* Multilevel 
</br>
* **Multiple Inheritance is not allowed in Java.**
    * If multiple inheritance is allowed then, If the class C have parent A, B then if C call the method/ variable which exist in both A and B, then problem arise that the what C will call the variable of. Is it of A or B? This is called **ambiguity problem**

# Day 15 - Method overriding, package
 
* **Method Overriding** ⇒ overriding the function in child class by having the same name as the function name in the parent class.
* Every class we used is imported from the package
* ``Java.lang.*`` is defaulted imported.
    * will imported all the file in that place. Only file not Folder.
* Prebuilt library can be searched in https://mvnrepository.com/

# Day 16 - Access Modifier
 
* If you wan to access outside the class, make it public.
* *Public* mean you can access by anywhere
* *Private* mean you cannot use it outside the class. It can be use in same class only.
* Cannot have the two public class in the same file

**Try to make**
                  Classes⇒ public
                   Instance variable ⇒private
                   Function we want to access in same class or its sub class ⇒protected

* Try to avoid default. Default means to donot know what you want to give the access.

# Day 17 - Polymorphism
 
**Polymorphism**⇒ behavior change in different places.
**Types**
* Compile time (Early binding)
* Runtime (Late binding)

**Compile time**
* Behavior is defined at compile time
* Overloading
```
// Example of method overloading:
    class Calculator {
        int add(int a, int b) {
            return a + b;
        }
        double add(double a, double b) {
            return a + b;
        }
    }
```

**RunTime**
* Behavior is defined at Runtime
* Overriding
```
    class Animal {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }
    
    class Dog extends Animal {
        void sound() {
            System.out.println("Dog barks");
        }
    }
```


In main:
```
    // Example of run-time polymorphism:
    Animal animal = new Dog();
    animal.sound(); // This will call the sound() method of the Dog class
```

# Day 18 - ``final`` keyword, ``Object`` class
* ``final`` keyword can be used with the variable, method,class.

**Initialization of final variable**
```final int num = 0;```

* ``final`` variable is equivalent to const in c.
* You cannot change the value in ``final`` variable.
```
    final int num = 0;
    num =9; //error: cannot assign a value to final variable num
```
**Initialization of final class**
```
final class Calc {
    …………….
}
```
* ``final`` class cannot be inherited by other class. Error like this will appear
```
    final class A{
    }
    class B extends A{  //The type B cannot subclass the final class A
    }
    Error:	
     The type B cannot subclass the final class A 
```
**Initialization of final method**
```
    final public void show() {
            System.out.println("In calc Show()");
    }
```
* Making the method ``final`` will stop the method overring.
```
    In class A
    final public void show() {
            System.out.println("In calc Show()");
    }
    In class B
    public void show() {
    }
    Error:
    Cannot override the final method from A
```
* ``System.out.println(obj);`` by default call`` System.out.println(obj.toString());``
* ``toString()`` is called from the superclass i.e is ``Object`` class. As we know all the class have the super class i.e ``object`` class.
* ``.equal`` need to have the equal  value and equal  hash 
* You can generate the ``equals`` and ``hashCode`` automatically generate in vscode. You can do that by right click in code section of the class and go to ``Source Action`` and ``Generate hashCode and equals….`` And voila

# Day 19 - Upcasting and Downcasting

**Initialization  of Type casting:**
```        
double d = 4.5;
int i = (int) d; // explicit typecasting

int i1 = 5;
double d1 = i1; // implicit type conversion
```
* When we are talking about non -primitive data type we have concept of upcasting and downcasting

**Condition for upcasting and downcasting:**
* For that two class should have some parents child  relationship 
* If non-primitive data type have no any relationship so, upcasting and downcasting is not possible.

**Initialization of upcasting and downcasting:**
```
class A {
}
class B extends A {
   }
In main:
A obj = (A) new B(); // upcasting
obj.show1();

A obj1 = new B(); // upcasting
// obj1.show2(); // you get error and you are not able to call show2() because
// with parennts reference specialised method of child is not visible here we
// downcastig to use show2() method
((B) obj).show2(); // downcasting
```

# Day 20 - Wrapper Class

* If you want to store integer value you store in int java provide primitive data type thats why java is 99.9 % object oriented programming primitive data types helps us to improve the performance but certain feature are work only when we work with objects for collection framework -- we need non primitive type data as input 
```
    byte -Byte
    int - Integer 
    long -Long
    char- Character
    double -Double
    float -Float 
    boolean -Boolean
```

**Boxing:** It is manual method to convert primitive type data into non-primitive type .
```
int num=7;
Integer num1=new Integer(8); //boxing
```

**UnBoxing:** It is manual method to convert non-primitive data type to primitive type.
```
int num2=num1.intValue(); //unboxing
```

**AutoBoxing:** It is automatic conversion of primitive type data into non-primitive data type.
```
int num3=5;
Integer num4=num3; //autoboxing
```

**How to store data as Object**
```
int num=7;
Integer num1=new Integer(8); //this syntax is depreciated 
Integer num1=Integer.valueOf(8); //Now we use this syntax
Integer num1=8; //autoboxing 
int num2=num1.intValue();//unboxing 
int num3=num1; //autounboxing 
```

**Convert string into int type using parseInt**
```
String str="12";
int num4=Integer.parseInt(str); 
```

**Convert number into String** 
```
String str1=Integer.toString(23); //convert number into string
```

# Day 21 - Abstract Keyword
**Abstraction** is a process of hiding the implementation details and showing only functionality to the user.

**Abstract method:-**
- Instead of defining the method, we can declare the method.
- If we put a semicolon at the end of a method, it means that you only declare the method like:
```
 public void drive();
```
- This method does not contain any features and you will not be able to create an object of it.
- You need to add an abstract keyword to only declare a method.

**Abstract class:-**
- Abstract methods can only be defined in an abstract class.
- We need to add an abstract keyword before a class to make it an abstract class.
- Objects of an abstract class can not be created.
- If you are extending an abstract class, then it is compulsory to define all abstract methods.
- It is not necessary that an abstract class should have an abstract method.
- Abstract class can have an abstract or a normal method or both.
- An abstract class can have more than one abstract method.

**Concrete class:** A class other than an abstract class is known as a concrete class.
- An object of a concrete class can be created.

# Day 22 - Inner class
**Inner Class:**
* We can also create a class inside another class.
```
 class A{ 
      class B{
      }
 }
```
* Creating the new object of class B. You first have to create the object of the class A.
```
A obj = new A();
A.B obj1= obj.new B();
```
* A dollar sign will be introduced in a class name that has an inner class indicating two different classes.
```
 A$B. class
```
* You also need to create an object of the outer class, to call the methods of an inner class.

**Static Inner Class**
* An inner class can also be declared as static.
```
    static class B {
             }
    In main
    A.B obj1 = new A.B();
```
* When an inner class is declared as static, then you do not need to create an object for it.
* But an outer class can not be made static.

**Advantage of inner class**
* Nested classes represent a particular type of relationship that is it can access all the members * of the outer class, including private.
* Nested classes make the code more readable and maintainable.
* It makes the code more optimize.


# Day 23 - Anonymous Inner Class, Anonymous Inner Class and Abstract Class
**Anonymous Inner Class**
* Anonymous means something that does not have a name.
* In overriding, to provide a new implementation of a method, we need to create a new class and extend it with the parent class. After extending the class, we override the method.
* We can avoid the overriding and do not need to create a new class for this particular task.
* We can use the inner class concept to give a new implementation of a method.
* Anonymous class used in the interface, functional interface, lambda expressions.
* Anonymous inner class can implement only one interface at s time.
* It can either extend a class or implement an interface at a time.
* We do not write a constructor for an anonymous inner class because it does not have any class * name.
* An anonymous class has access to the members of its enclosing class.

**Initialization of Anonymous class**
* We can create a new anonymous inner class after creating an object of a class that contains the method.
* We do not need to use a class keyword with an anonymous inner class.
* It just starts with braces and contains the method and its new implementation.
* Anonymous inner class starts just the creation of an object and ends with the semicolon of that object.
```
  A obj = new A() {
            // overridding with anonymous inner class
            void show() {
                System.out.println("Inside the anonymous inner class");
            }
        };
```

**Abstract And Anonymous Class**
* When you want to use an interface and an abstract class only once, then you can simply use an anonymous innner class in place of that.
* You can also provide the implementation for multiple methods in an anonymous inner class.
* Anonymous inner class can implement only one interface at s time.
* Anonymous inner class can either extend a class or implement an interface at a time.
* We can create object for abstract class by providing the implementation of an abstract method in an anonymous inner class.
```
    abstract class A {
        abstract void show();
    }
    
    In main methid:
    // here we are not creating the object of abstract class but the object of the inner class
    A obj = new A() {
        // overridding with anonymous inner class
        void show() {
            System.out.println("Inside the anonymous inner class");
        }
    };
    obj.show();
    
    // A obj1 = new A(); // cannot call this beacuse of the abstract class
    // obj1.show();
```

# Day 24 - Need of Interface
* We can also pass an object as a parameter in a method.
* When you build an application, you need to make it more flexible.
* We can create a reference of the parent class and an object of the sub-class.
* Passing reference and the reference of an object that you accept in a method, both should be the same.

**Interface:-**
* Interface in Java is used to achieve abstraction.
* Interface is used to design an application to make it loosely coupled.
* Implements keyword is used with a class to extend it to an interface
```
    interface Computer {
        void code();
    }
    // abstract class Computer {
    // abstract public void code();
    // }
    
    // class Laptop extends Computer {  //class inheritance
    class Laptop implements Computer {  //interface
        public void code() {
            System.out.println("code,complile,run");
        }
    }
```

**Need  of an Interface:-**
* It is used to implement abstraction.
* We can also achieve multiple inheritance in Java, by using the interface.
* Any class can extend only 1 class but can any class implement an infinite number of interface.
* It is also used to achieve loose coupling.


# Day 25 - Interface
**Interface:-**
* In an abstract class, we can have both abstract methods as well as normal or concrete methods.
* If your class has only abstract methods then instead of using class, you can simply use an interface in place of it.
* Interface is not any class.
* Every method in an interface is public and abstract by default.
* Even if you do not use two keywords (public and abstract) with methods then also it will not give an error in an interface. By default, it will consider all methods as public and abstract.
* We cannot instantiate an interface.
* Interface only shows the design and it does not provide any implementation.
* To provide an implementation of methods, you need to create a class and instantiate it also.
```
e.g,
 interface A
 {
  methods()----
 }
```

**implements keyword:-**
* To implement an interface, we use the keyword - implements.
* If you use the implements keyword with class, then it is compulsory to give an implementation of all the methods that are defined in an interface.
* If you do not give an implementation of all methods then it will make your class an abstract class by default.
* So, to make a concrete class, you have to give the implementation of all methods present in an interface.
```
e.g., 
 class B implements A
 {
  methods() {
   statement;
  }
  ------
 }
```

**Variables in an interface:-**
* We can call the methods of an interface by creating an object of the class that implements an interface.
* We can also declare variables in an interface.
* All the variables in an interface are final and static by default.
* So, we first have to initialize the variables in an interface.
* As a variable is static in an interface, then you do not need to create an object for it. You can directly call the variable by using the interface name.
e.g., A.area;    (here, area is a variable initialized in an interface)
* As the variable is final, you can not change the value of that variable after initializing it once.


* Interface does not have its own memory in the heap.


#Day 26 - More on Interface, Enums
* We can have a class implementing multiple interfaces.
```
    class B implemets A,X{
        }
    (here, A and X are two different interfaces)
```
* Implementation of all the methods that are present in those interfaces should be ven in a class.
* Inheritance is also valid in between interfaces.
* Inheritance can be achieved in between interfaces by using the extend keyword.
* Whenever you create a reference of an interface and create an object of a class, then you can only call those methods by that reference that are present in that interface of which the refernce is created.
* Methods of another interface can be called by using another reference variable for that interface with the object of a class.

**Keyword used to extend**
```
class -class --> extends
class-  interface --> implements
interface -interface --> extends
```

**Enums**
* Enum is a short term used for Enumeration.
* Enumerations serve the purpose of representing a group of named constants in a programming language.
* Java Enums can be thought of as classes that have a fixed set of constants 
* Enum is named constants that we create for specific constants or error codes.
* Enum is created in place of an object for constants.
* Enum is pre-defined that contains all name constants.
* Enums are used to create our data type like classes.
* In enum, instead of returning a string format or a specific object, we can simply return a status or a value present inside an enum.
```
    enum Status { // Java treats Status as class
        Running, Failed, Pending, Success; // treats as object of the class
    }
```

* enum is also treated as a class in Java. Objects can also be created for enum like:
 	Status s= Status.Running;
* Every enum constant represents an object of type enum.
* enum type can be passed as an argument to switch statement

* In enum, all the name constants are defined by using numbers.
* ``ordinal()`` method is used to get the index of the name constant present in the enum.
* ``values()`` method is used to get all the statuses or name constants of enums.
* 
```
    Status [][] s= Status.values();
    *values() method will give an array.
```

# Day - 27 Enum and IfElse,Switch, Enums class and Constructors

**Enum and If-Else,Switch**
* We can compare the status or values of an enum by using the if- else condition.
* Switch supports string, integer etc, and it also support enum.
* In ``switch()`` you need to pass an object reference variable as a parameter. In switch case, we do not have to pass the object refernce variable again and again. We have to only pass the constant itself.

**Enum Class**
* We can not extend the enum with any other class.
* We can define constructors and methods in an enum. Creation of our constructors and variables is also possible in an enum.
* We can also define our data types through enum that are known as Enumerated Data Types.
* In Java, enum extends the enum class and we get all other methods present inside an enum through the enum class only.
* If we print the superclass of an enum class, then it will also return an enum.
```
    Status s= Status.Success;
    System.out.println(s.getClass().getSuperclass());
```
* In an enum, every enum constant represents an object of type enum.

**Enum and Constructor:**
* enum contains a constructor and it is executed separately for each enum constant at the time of enum class loading.
* We can create a constructor in an enum that can take any parameter, and that value of a parameter might be different in every object of an enum.
```
    private Laptops(int price) {
        this.price = price;
     }
```
* Instance variables in an enum are private and we can access them in another class by using getters and setters.
```
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
```
* We can print the value of all objects of an enum through a loop and .values() method is used to iterating over all objects.
```
    for (Laptops l : Laptops.values()) {
        System.out.println(l + "\t" + l.getPrice());
    }
```
* If any parameterized constructor is present inside an enum, then the default constructor will not be considered.
* We create private variables and private constructors in an enum because we use them or create an object for constructors in the same class only.
* The constructor in an enum will be called the number of times as much the number of objects created.


# Day 28 - Annotation
**What is Annotations?**
* Annotation is type of comment which is used to provide meta data to the compiler and JVM about the program.

**Basic difference between comment and annotations**
* Annotation is used to provide meta data to the compiler and JVM about the program but comment is used to provide information to the programmer.

**What does annotations provide to program and what does for program?**
* Annotations are used to provide supplemental information about a program. 
* Annotations start with ‘@’.
* Annotations do not change the action of a compiled program.
* Annotations help to associate metadata (information) to the program elements i.e. instance variables, constructors, methods, classes, etc.
* Annotations are not pure comments as they can change the way a program is treated by the compiler. See below code for example.

**How annotation prevent us from logical error?**
```
class A{
        public void show(){
            System.out.println("In A");
        }

        public void display(){
            System.out.println("In A");
        }
  }

  class B extends A{
        @Override
        public void show(){
            System.out.println("In B");
        }
      /*   @Override
        public void displayData(){
            System.out.println("In B");
        }
  */

    //here you get error because you are not overriding the method of parent class but you are using @Override annotation 
   // if you are thinking I can override display() method but you should defined new method but whenever you mention @override compiler throw error that you are not override the parent class method 
    //it helps to avoid the logical error in the program because logical error is more difficult to find when you use annotation it helps to find the logical error
    //because solving problem at compile time error  is easy than solving problem at runtime 

 
  }
```

# Day 29 - FunctionalInterface

* **Functional interface** is an interface with only one abstract method 

****The properties of a functional interface in Java are as follows:**
* **Single Abstract Method:** A functional interface has only one abstract method. 
This method is the signature of the interface and defines the behaviour that will be implemented in the lambda expression or with simple class.

* **Functional Method:** The abstract method of a functional interface is called the functional method. 
It is the method that provides the functional behaviour of the interface.

* **@FunctionalInterface Annotation:** A functional interface is annotated with the @FunctionalInterface annotation.This annotation is optional, but it provides a compile-time check that the interface has only one abstract method.

* **Compatible with Lambda Expressions:** A functional interface is compatible with lambda expressions. **A lambda expression** is a concise way of implementing the functional method of a functional interface.
(This will discuss in next lecture of lambda expression).

* Functional interfaces are a key component of functional programming in Java, 
and they are used extensively in the Java 8 Streams API and other Java libraries.

```
class Main{
    public static void  main(String []args){
A obj = new B();
obj.show();

//another way to implement functional interface
A obj1 = new A(){
    @Override
    public void show(){
        System.out.println("Hello");
 }
    };
obj1.show();

}
}

//one way to implement functional interface
class B implements A{
    @Override
    public void show(){
        System.out.println("Hello");
    }
}

//specify it is functional interface
@FunctionalInterface //we use this annotation to specify it is functional interface
interface A{
    void show();
    //void run(); //this will give error as it is a functional interface you cannot write two abstract method in this
}
```

# Day 30 - Lambda
* In Java, a ``lambda`` expression is a concise way to implement a functional interface.
* It will only work with **functional interface only**.
* A **functional interface** is an interface that has only one abstract method, and it can be implemented using a lambda expression.
* Using lambda expression we do not need of new class and inner class to implement.

**Properties of the lambda expression**
* **Concise syntax:** Lambda expressions provide a concise and expressive syntax for defining functional interfaces. They allow you to define the behaviour of a functional interface in a single line of code.


* **Functional programming:** Lambda expressions are a key component of functional programming in Java. They allow you to write code that is more declarative and expressive, and less verbose than traditional imperative code.


* **No need for anonymous inner classes:** Lambda expressions provide an alternative to anonymous inner classes, which are often 
used to implement functional interfaces in Java. Lambda expressions are more concise and easier to read than anonymous inner classes.

**Codes:**
* **Code without lymbda**
        A obj = new A() {
            public void show() {
                System.out.println("in Show");
            }
        };

* **Code with lymda and their variation**
        A obj = (int i) -> {
            System.out.println("in Show" + i);
        };

* **Removing the Curly bracket and the data type of formal parameter**
        	A obj = (i) -> System.out.println("in Show" + i);
* **If you have only one paramter you can simply write like this**
        A obj = i -> System.out.println("in Show" + i);
* **Code with lymda with return value**
        	B obj1 = (int i, int j) -> i + j;

# Day 31 - Interface, Exceptions
**Types  of interface**
* Normal interface
* Functional interface /SAM 
* Marker  interface

**Normal interface** 
* Normal interface contains two or more abstract method.
* It can have any number of static and default methods and also even public methods of Object classes.
* You can declare variable which are public static final by deault
```
// Normal interface for vehicles
interface Vehicle {
    void start(); // Method to start the vehicle

    void stop(); // Method to stop the vehicle
}
```


**Functional Interface(Single Abstract Method (SAM) Interface):**
* Functional Interface is an interface that has only pure one abstract method.
* It can have any number of static and default methods and also even public methods of Object classes
* e.g Runnable interface : It contains only  run()  method 
```
// Functional interface for performing calculations
@FunctionalInterface
interface Calculator {
    int calculate(int a, int b); // Method to perform calculation
}
```


**Marker Interface:**
* An interface that does not contain any methods, fields, Abstract Methods, and any Constants is Called a Marker interface.
* Also, if an interface is empty, then it is known as Marker Interface.
* The Serializable and the Cloneable interfaces are examples of Marker interfaces.
```
// Marker interface indicating printable objects
interface Printable {
}
```

**Exceptions**
**Types:**
* Compile time error
* Logical error
* Run time error 

**Compile-time errors:**
* Compile-time errors are errors that occur during the compilation of the Java code. 
* These errors are caused by syntax errors, missing semicolons, or incorrect variable names, 
* Among other things. If there are compile-time errors in your Java program, it cannot be compiled into bytecode, and it cannot be executed.

**Logical errors:**
* Logical errors are errors that occur when the program runs correctly, but it does not produce the expected output. 
* These errors occur because of a mistake in the program's logic. For example, if a program is supposed to add two numbers 
* But instead multiplies them, it will produce the wrong output. Logical errors are more difficult to detect than compile-time errors because the program runs without any error messages.

**Exceptions(Runtime error)**
* Exceptions are errors that occur during the execution of the Java program. 
* Exceptions occur when something unexpected happens, such as trying to read from a file that does not exist or dividing by zero. 
* When an exception occurs, the program will terminate unless the exception is handled by an exception handler.

**Checked Exception:**
* Checked exceptions are exceptions that the Java compiler requires you to handle or declare. 
* These exceptions are checked at compile time, and you must either handle the exception with a try-catch block or declare it with a throws clause. 
* If you do not handle or declare a checked exception, the code will not compile. Checked exceptions are typically related to input/output operations, such as file handling or network communication.

**Unchecked Exception:**
* Unchecked exceptions are exceptions that are not checked at compile time. These exceptions are typically caused by programming errors, 
* Such as null pointer exceptions, array index out of bounds exceptions, and class cast exceptions. Unchecked exceptions are not required to be handled or declared, but they can still occur during runtime.

**Important:**
* Both checked and unchecked exceptions can occur during runtime, but checked exceptions are checked at compile time and require handling or declaring, while unchecked exceptions are not checked at compile time and do not require handling or declaring.

* Can also handle different types of exceptions with multiple catch blocks.
```
    int i = 4;
    int arr[] = { 3, 4, 5 };
    try {
        int j = 18 / i;
        System.out.println(arr[9]);
        System.out.println(j);
    } catch (ArithmeticException e) {
        System.err.println("Cannot Divide by zero");
    } catch (Exception e) {
        System.err.println("Error:\t" + e);
    }
```
# Day 32 -``throw``, Custom Exception, ``throws``
**``throw``**
* ``throw`` keyword in Java is used to explicitly throw an exception. 
* When an exception is thrown using the ``throw`` keyword, the execution of the current method is stopped.

**Custom Exception**
* Custom exception class extends the Exception class.
* Need a constructor that takes a String message, which is passed to the parent constructor using the super keyword.
```
    class EemayasException extends Exception {
        public EemayasException(String string) {
            super(string);
        }
    }
```
**Custom Exception can be create by**
* By extending the Throwable class in Java 
* Not recommended create custom exception using Throwable, the Throwable class is typically used to create other types of exceptions, such as errors and checked exceptions, rather than custom exceptions.
* By extending the Exception class in Java
* By extending  the Exception class or one of its subclasses, such as RuntimeException.

**``thows``**
* ``throws`` keyword is used in method signatures to indicate that the method may throw certain types of exceptions.but does not handle them directly
* The caller of the method is responsible for catching and handling the exception.
* Suppose you have three methods c , b and a and both have same Arithmetic Exception and b and a method call from c method.
in this case you can duck the exceptions and handle in the c methods.
```
    void c(){
    try{
        a();
        b();
    }
    catch(ArithmeticException e){
        }
    }
    void a() throws ArithmeticException{}
    void b() throws ArithmeticException{}
```
* Ducking exception most recommended for checked exception than unchecked exception
* ``throws`` keyword in Java is typically used to declare that a method may throw one or more checked exceptions. Checked exceptions are exceptions that must be either caught or declared in the method signature using the ``throws`` keyword. Examples of checked exceptions in Java include ``IOException``, ``SQLException``, and ``ClassNotFoundException``.

# Day 33 - System.in.read(), InputStreamReader, Scanner, Try can be used with finally, Try with resources, Try with with multiple resource, Thread
**How to take input in java?**
* Using System.in.read()
* Using InputStreamReader class
* Using Scanner

**Using System.in.read()**
* We can take single character input only, if we provide multiple character,it considersr the firstcharacter of enter sequence.
* if we want to show result of multiple character we can use loop (not in video lecture forcuriosityy)
* Return ascii value of the input

```
 public static void main(String[] args) {
        System.out.println("Enter the Number");
        try {
            int num = System.in.read();
            System.out.println(num);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
```
```
   input: a	output: 97
   input: A	output: 65
   input: 3	output: 51
   input: 345	output: 51 //considere 3 digit from number
   input: 3456 	output: 51 //consider 3 digit from number
```

**To get actual number** 
* Convert ascii value to char
``System.out.println((char)i); // print the char value``

* Subtract 48 from the ascii value
``System.out.println(i-48); // print the actual number //but it is only for single digit number ``


**Using InputStreamReader class:**
* In Java, the InputStreamReader class is used to read data from an input stream and convert it into characters. 
* It is often used with the BufferedReader class, which provides a buffered way to read characters from an input stream.
* if open the resource then close is important
``` 
    // multiple digit input
    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader bf = new BufferedReader(in);

    try {
        int numbf = Integer.parseInt(bf.readLine());
        System.out.println(numbf);
        bf.close(); // closing the resources
    } catch (NumberFormatException e) {

        e.printStackTrace();
    } catch (IOException e) {

        e.printStackTrace();
    }
```

**Using Scanner**
```
    // Scanner
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num1 = scn.nextInt();
    System.out.print("Enter another number: ");
    double num2 = scn.nextDouble();
    System.out.printf("%d %f", num1, num2); //will print 56 23.000000
```

**Try can be used with finally**
* ``try`` statement can be used along with the finally clause to ensure that a resource is properly closed or released, regardless of whether an exception is thrown or not.
```
    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader bf = new BufferedReader(in);

    try {
        int numbf = Integer.parseInt(bf.readLine());
        System.out.println(numbf);
    } finally {
        if (bf != null)
            bf.close(); // finally used to close the resources regardless Excpetion occur or not
        }
```

**Try with resources**
* Advantage is this that once the try block is over, resources bf will automatically closed.
```
try (InputStreamReader in = new InputStreamReader(System.in);
             BufferedReader bf = new BufferedReader(in);) {
            int numbf = Integer.parseInt(bf.readLine());
            System.out.println(numbf);
        }
```

**Try with with multiple resource**
* Use the try-with-resources statement to close multiple resources automatically. 
```
    try (Resource1 res1 = new Resource1();
         Resource2 res2 = new Resource2()) {
        // code that uses the resources
    } catch (Exception e) {
        // exception handling code
    }
```

* Resource1 and Resource2 are classes that implement the AutoCloseable interface,which allows them to be used in the try-with-resources statement. 
* The code within the try block uses these resources, and they are automatically closed when the block is exited, either normally or due to an exception. If an exception is thrown, the * catch block can handle it as necessary.
* Resource1 and Resource2 are declared and instantiated within the try-with-resources statement. If the resources are already instantiated before the try block, we can simply pass them as arguments to the statement.
* The resources are closed automatically when the try block is exited, and there's no need to explicitly call their close() methods.
* In multiple statement inside try, order of closing resources:
* Resources declared within a try-with-resources statement are closed in the reverse order of their declaration, from right to left. 
* Resource1 is declared first, followed by Resource2, and then Resource3. 
* When the try block is exited, the resources will be closed in the following order:
Resource3
Resource2
Resource1

* Order is reversed from the order of declaration, with the resource declared last (Resource3) being closed first, and the resource declared first (Resource1) being closed last.

**Thread**
* A thread can be created by extending the thread class. The thread class can be extended through the ``Thread`` keyword.
* As a programmer,* we can not control a thread, we can only optimise it.
* By using the ``Thread`` keyword with class, it will not create a new thread.
```
class A extends Thread {
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println("Hi");
        }
    }
}
```

* Have to use the start() method in the main to start the execution of a new thread.
```
A obj1 = new A();
obj1.start();
```
* ``start()`` is a method that is present inside the thread class. ``start()`` method only calls the run method.
* ``start()`` invokes the ``run()`` method on the Thread object.
* run method should be present inside every thread to start a new thread.
* ``run()`` method is used to do an action for a thread.

**``getPriority()``**
* We cannot control the schedular, we can only give suggestions to it to give priority.
* getPriority() is a method that gives the current priority of a thread.
* Range of priority ⇒ 1 to 10.
    * 1⇒least 
    * 10⇒maximum
    * 5⇒default priority or normal priority.
* Code
```
System.err.println(obj1.getPriority());
```

**``setPriority()``**
* Can also change the priority by using the ``setPriority()``.
* Can set priority using value 1-10 or some constant like ``Thread.MIN_PRIORITY`` or ``Thread.MAX_PRIORITY``
* Code
```
obj1.setPriority(10);
or
obj1.setPriority(Thread.MIN_PRIORITY);
```

**``Thread.sleep(__);``**
* Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds, subject to the precision and accuracy of system timers and schedulers
* Thread will wait by using the ``sleep()`` method.
* In the ``sleep()`` method, we have the pass value for how much time we want a thread to wait. The time will be in milliseconds.
* ``sleep()`` method will throw an interrupted exception. So, we can handle an exception by using the try-catch block.
* When we use ``sleep()``, then the thread goes into the waiting state.
* Code:
```
    try {
        Thread.sleep(10);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
```
# Day 34 -Method of creating the thread, Runnable with lambda, Thread Safe, join method and synchronized keyword, Thread State,Collection, Set, ArrayList
**Method of creating the thread:**
* Extend a thread class
* Implement a Runnable interface.The runnable interface does not have thread methods, in that case, we need to create a separate thread object to use features.

* In the Runnabe method, the start() method is not present so we can not use it by implementing Runnable simply.
* Thread has multiple constructors and one of the constructors takes a runnable object.
* We cannot create an object of a thread by using a class name.
* Objects for a thread will be created by using a Runnable keyword. So, we create a reference of an interface and an object of a class
* e.g., Runnable obj= new A();
* We have to pass a reference to an object in the thread class.
* After creating a reference of the Runnable class, we can use the start() method with the thread.
```
    Runnable obj1 = new A();
    Runnable obj2 = new B();

    Thread t1 = new Thread(obj1);
    Thread t2 = new Thread(obj2);
    t1.start();
    t2.start();
```

**Runnable with lambda**
* Runnable is function interface so we can use the lambda.
```
    Runnable obj1 = () -> {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    };
```

**Thread Safe:**
* Thread safe means that only one thread will work at one point.
* When a thread is already working on an object and preventing another thread from working on the same object, this process is called Thread-Safety.
* If we have two threads and each thread is calling increment thousand times, then increment will be called two thousand times.
* For the above case, every time you run the code you will get a different output for this.
* This happens because the main method prints the value of the count at any moment of time, it does not wait for threads to execute completely and come back to the main method.
* If the main method waits for threads to execute and to come back after completion, then it gives nearby correct output.


**join method and synchronized keyword:**
* ``join()`` is a method that allows the main method to wait for the other threads to come back and join.
* join through an exception so we have to handle it by using throws Interruption.
* If both threads go to the method at the same time then it might be possible that they will be lost some of the values in between.
* The above problem will be resolved by using the synchronized keyword.
* By using the synchronized, java ensures that the method will be called by only one method at a time to handle instability in code.
* So, if a thread is working with the synchronized method, then the other thread has to wait to work with that method until the first thread gets completed.
* Synchronization in java is the capability to control the access of multiple threads to any shared resource. 
```
class Counter {
    int count; // This is an integer field named 'count'

    public synchronized void increment() { // A synchronized method to ensure thread safety
        count++; // Increase the count by 1
    }
}
```

**Thread State**
* Every time you create a new thread that goes into a new state.
* When you start a thread, it goes into the Runnable state.When the thread is executing and then it is waiting for the schedular, it is in a runnable state.
* When the thread is actually running on a CPU, it is in a Running state.The thread executes with the help of the ``run()`` method in a running state.A thread goes in the running state only when it gets informed by the schedular to get executed.
* The thread can be held with the help of the ``sleep()`` or ``wait()`` method, then will go into the waiting state.
* With the use of ``notify()`` method, the thread goes to the Runnable state from the waiting state.
* You can stop the execution of a thread by using a stop() method, and then it will go into the Dead State.
* When the work of a thread gets over, then it will go into the dead state automatically.

**Collection**
* Collection consists of:.
    * Collection API  -- concept
    * Collection  -- Interface
    * Collections -- Class

* The collection interface belongs to java.util.Collection package. All classes and methods of collection interface belong to this java.util package.
* API means a library or some features that we can use directly, we do not need to define an implementation for it.
* Collections List, Queue, Map and Set simply extend the Collection interface and this collection interface must have its own class implementation.

*  We can also convert a collection into an array.
*  ``ArrayList`` is used like:
```
    Collection nums=new ArrayList(); 
    nums.add(6);
```
*  We can add values in a collection by using the add() method.
*  We do not have indexing for the collection API.
*  In the array, we need to specify its type of it. While Collection API works with objects.
*  All the data types classes like integer and float extend an object class and thus collection API directly use an object.
*  To define the data types in collection API, we use Generics.
*  You can define the type of an object to which data type class it belongs in angular brackets like:
```
    Collection<Integer> nums = new ArrayList<Integer>();
```
* Here, we use Integer as it is a class, while int is a primitive data type.
* If we do not specify the datatype of a collection object, then it will give a run-time error.
* ArrayList is a class that implements a list. The list does not have a method called get because it list works with an index in the values.
* It uses a dynamic array to store the duplicate element of different data types. 
* The ArrayList class maintains the insertion order and is non-synchronized. 
* The elements stored in the ArrayList class can be randomly accessed. 
* The size of an ArrayList is increased automatically if the collection grows or shrinks if the objects are removed from the collection. 
* If you want to use and fetch values from an ``ArrayList``, then you can use ``Collection``.
```
    Collection<Integer> nums = new ArrayList<Integer>();
```
* If you want to work with an index value, you should use List as it supports index values.
```
    List<Integer> nums1 = new ArrayList<Integer>();
```

**Set**
* Set also uses the add() method to insert the values in a set.
* Set does not print the repeated values. It prints the same value only one time.
* Set does not maintain the sequence, it gives values in any random order. The set does not sort the values
* Set also does not support an index for values.
```
    Set<Integer> set = new HashSet<Integer>();//give un sorted list
    Set<Integer> set = new TreeSet<Integer>();// sorted list
```

# Day 35 - Map, Collections, Comparable, forEach, Stream, ParallelStream
**Map**
* Map is a collection of key-value pairs. in this, for every value of an element, a key is associated with it.
* Map itself is in an interface that supports key-value pairs. A class that implements it is called HashMap.
* Add elements in a map using the ``put()`` method that accepts both the key and value of it.
* Get the value of an element by specifying its key of it in the ``get()`` method.
* Keys are unique but values can be repeated. The value of a key can also be updated.
* In a map, keys are in a set while values are in a list.
* We can get all the keys by using the method ``keySet()``.
* We can get the value of a key by using the method ``get()`` and pass a parameter as a key in the method.
* ``remove()`` method is used to delete a particular element or an entity from a map.
```
    Map<String, Integer> students = new HashMap();
```

**Collections**
* We can sort a list or an ArrayList by using the method sort of collection class
```
    Collections.sort();
```
* If we want to apply our own logic in sorting, then we have to use a comparator with sorting in collections.
* Comparator is also an interface.
* We have a method called compare() in the comparator interface.
* We can use an interface by implementing a class or through an anonymous class.
* Compare method works on an algorithm where it compares two values and then swaps them.
* So, a comparator is an interface through which you can specify your own concept of sorting.
```
    Comparator<Integer> com = new Comparator<Integer>() {
        public int compare(Integer i, Integer j) {
            if (i % 10 > j % 10) {
                return 1;
            } else {
                return -1; 
            }
        }
    };
```

**Comparable**
* Integer class implements a Comparable interface. So by default, sort works for Integer.
* If you want to do natural sorting on any other non-defined class, you can implement something called the Comparable.
* Comparable is present in the lang package.
* Comparable has a method known as compareTo(). 
* You have to define the method comapreTo() in a class, that is implementing Comparable.
```
    class Student implements Comparable<Student> {  
        @Override
        public int compareTo(Student that) { 
            if (this.age > that.age) {
                  return 1; 
            } else {
                return -1; 
            }
        }
    }
```
* Here, that is a variable
* We can also override the logic by using Comparator even if we have implements the Comparable interface.
* Lambda expression can also be used with Comparator as it is a functional interface.
```
    Comparator<Student> studscomlamda = (Student i, Student j) -> i.age > j.age ? 1 : -1;
```

**Difference between Comparable & Comparator:**
Comparable provides a single sorting sequence while the Comparator provides multiple sorting sequences.
In Comparable, actual gets modified while in Comparator, the original class does not get affected.
Comparable gives the compareTo() method for sorting while Comparator gives the compare() method to sort elements.

**forEach**
* ``forEach`` method gives one value at a time and we can save that value in a variable say n and print it.
* ``forEach`` traverses each element of the Iterable until all the elements have been processed.
* ``forEach`` method takes an object of the consumer.
* ``forEach`` method is part of a list interface, that gives one value at a time and then you can perform operations on it.
```
    nums.forEach(n -> System.out.println(n));
```

**Stream**
* Stream is an interface, it contains a stream() method.
* Stream method return an object of type stream.
* Any operation can be performed inside the stream method.
* Any changes done inside the stream can be reflected on the actual list.
* Once we work with a stream, we can't reuse it. We can work with a stream only once.
* If you use more than once, it will create run time error
```
    Stream<Integer> s1 = nums.stream();
```

**ParallelStream**
* Creates multiple threads to work faster.
* parallelStream should not be used with a sorted method as sorting requires all the elements together, so there multiple threads will create an ambiguity.

# Day 36 -Var, Sealed Class
**Var**
* Var will convert into specific type behind the scene.
* We cannot use the var without initialization
```
    var a = 9;// valid
    var d; // runtime error / (cannot use 'var' on variable without initializer)
```
* Var keyword cannot be used as classname
```
    class var { //'var' is not a valid type name
    }
```
* Var can be used as object name;
```
    String var = "Prashant";
```
* Both are same
```
    int num[] = new int[10];
    var nums = new int[10];
```

**Sealed Class**
* You can mention which are the classes/subclasses which can inherit from this particular class/interface
```
    sealed class A permits B, C {
    }
    non-sealed class B extends A {
    }
    non-sealed class C extends A {
    }
    class D {
    }
```
* We can make sub class final , non-sealed, sealed 
```
    non-sealed class C extends A {
    }
    Or
    sealed class C extends A permits E {
    }
    Or
    final class C extends A {
    }
```
* Permit should be the last.
* For sub interface we have only two option: non-sealed, sealed

# Day 39 - Read/write from txt and csv files

* ``FileWriter`` to write to the file
* ``FileReader`` to read from the file
* ``BufferedReader`` to efficiently read characters from the file

**Code to Write in txt file**
```
 // Create a FileWriter object to write to the file
            FileWriter writer = new FileWriter(fileName);
            // Write some text to the file
            writer.write("Hello, this is an example text.\n");
            writer.write("We're writing to a file using Java.");
            // Close the FileWriter object to save changes and release resources
            writer.close();
```

**Code to read from txt file**
```
// Create a File object representing the file to be read
            File file = new File(fileName);
            // Create a FileReader object to read from the file
            FileReader reader = new FileReader(file);
            // Create a BufferedReader object to efficiently read characters from the file
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            // Display the contents of the file
            System.out.println("Contents of " + fileName + ":");
            // Read lines from the file until reaching the end
            while ((line = bufferedReader.readLine()) != null) {
                // Print each line to the console
                System.out.println(line);
            }
            // Close the BufferedReader and FileReader objects to release resources
            reader.close();
```

**Code to write in csv file**
```
 // Define the file name
            String fileName1 = "data1.csv";

            // Define the data to be written to the CSV file
            String[][] data = {
                    { "Name", "Age", "City" },
                    { "John", "25", "London" },
                    { "Alice", "30", "New York" },
                    { "Bob", "35", "Paris" }
            };
            FileWriter writer = new FileWriter(fileName1);

            // Write each row of data to the CSV file
            for (String[] row : data) {
                // Write each element in the row followed by a comma
                for (int i = 0; i < row.length; i++) {
                    writer.append(row[i]);
                    // Add a comma if the element is not the last one in the row
                    if (i < row.length - 1) {
                        writer.append(",");
                    }
                }
                // Move to the next line after writing each row
                writer.append("\n");
            }

            // Close the FileWriter object to save changes and release resources
            writer.close();
```

**Code to read from csv file**
```
// Define the CSV file name
            String file = "data.csv";
            // Create a BufferedReader object to read from the CSV file
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = "";

            // Read lines from the CSV file until reaching the end
            while ((line = reader.readLine()) != null) {
                // Split each line into an array of strings using comma as the delimiter
                String[] row = line.split(",");

                // Iterate through each element in the row array
                for (String index : row) {
                    // Print each element with a formatted width of 10 characters
                    System.out.printf("%-10s", index);
                }
                // Move to the next line after printing each row
                System.out.println();
            }
```

# Day 40 - Kotlin
* ``fun`` is used to declare a function
* The ``main()`` function is where your program starts fro
* The body of a function is written within curly braces ``{}``
* ``println()`` and ``print()`` functions print their arguments to standard output

**Types of Variable**
* read-only variables with ``val``
* mutable variables with `var`

**String**
* Elements of a string are characters that you can access via the indexing operation: ``s[i]``. 
```
    for (c in str) {
        println(c)
    }
```
**Kotlin has two types of string literals:**
* Escaped strings
```
    val s = "Hello, world!\n"
```
* Multiline strings
```
    val text = """
    for (c in "foo")
        print(c)
    """
```

* To remove leading whitespace from multiline strings, use the trimMargin() function
```
    val text1 = """
        |Tell me and I forget.
        |Teach me and I remember.
        |Involve me and I learn.
        |(Benjamin Franklin)
        """.trimMargin()
        //will print
    // Tell me and I forget.
    // Teach me and I remember.
    // Involve me and I learn.
    // (Benjamin Franklin)
```
A template expression starts with a dollar sign ``($)`` and consists of either a name:``println("i = $i") `` or an expression in curly braces:``"$s.length is ${s.length}"``

**``String.format()``**
```
String.format("%07d", 31416) //will print 0031416
String.format("%+.4f", 3.141592)    //will print +3.1416
String.format("%S %S", "hello", "world")    //will print HELLO WORLD
```

# Day 41 - Kotlin Variable, Collection, Class, Function
Kotlin has the following basic types:
Integers--``Byte``, ``Short``, ``Int``, ``Long``
Unsigned integers--``UByte``, ``UShort``, ``UInt``, ``ULong``
Floating-point numbers--``Float``, ``Double``
Booleans--``Boolean``
Characters--``Char``
Strings--``String``

**Collection**
* List
* Set
* Map

**List**
* Read-only()
```
val readOnlyShapes = listOf("triangle", "square", "circle")
```
* Mutable list
```
val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
```
    
* To get the first or last item in a list, use ``.first()`` and ``.last()`` functions respectively
* To get the number of items in a list, use the ``.count()`` function
* To check that an item is in a list, use the ``in`` operator
* To add or remove items from a mutable list, use ``.add()`` and ``.remove()`` functions respectively

**Set**
* read-only set
* mutable set
```
// Read-only set
val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
// Mutable set with explicit type declaration
val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
```

* To get the number of items in a set, use the ``.count()`` function
* To check that an item is in a set, use the ``in`` operator
* To add or remove items from a mutable set, use ``.add()`` and ``.remove() ``functions respectively

**Map**
* read-only map
* mutable map
```
// Read-only map
val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)

// Mutable map with explicit type declaration
val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
```
* To access a value in a map, use the indexed access operator ``[]`` with its key
* To get the number of items in a map, use the ``.count()`` function
* To add or remove items from a mutable map, use ``.put()`` and ``.remove()`` functions respectively
* To check if a specific key is already included in a map, use the ``.containsKey()`` function
* To check that a key or value is in a map, use the in operator:
```
val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
println("orange" in readOnlyJuiceMenu.keys)
// true
println(200 in readOnlyJuiceMenu.values)
// false
```

**Conditional expression**
*  if
```dotnetcli
if (a > b) a else b
```
* when
```
val obj = "Hello"

when (obj) {
    // Checks whether obj equals to "1"
    "1" -> println("One")
    // Checks whether obj equals to "Hello"
    "Hello" -> println("Greeting")
    // Default statement
    else -> println("Unknown")     
}
            or
val temp = 18

val description = when {
    // If temp < 0 is true, sets description to "very cold"
    temp < 0 -> "very cold"
    // If temp < 10 is true, sets description to "a bit cold"
    temp < 10 -> "a bit cold"
    // If temp < 20 is true, sets description to "warm"
    temp < 20 -> "warm"
    // Sets description to "hot" if no previous condition is satisfied
    else -> "hot"             
}
println(description)
// warm
```

**Function**
```
fun sum(x: Int, y: Int): Int {
    return x + y
}
```
can be written as
```
fun sum(x: Int, y: Int) = x + y
```

**Class**
* You can declare properties for a class:
    * Within parentheses () after the class name.
```
    class Contact(val id: Int, var email: String)
```
    * Within the class body defined by curly braces {}.
```
    class Contact(val id: Int, var email: String) {
    val category: String = ""
}
```

**Create instance**
``` 
class Contact(val id: Int, var email: String)

fun main() {
    val contact = Contact(1, "mary@gmail.com")
}
```

# Day 42 - Row and Column in JetPack Compose

# Day 47

**Method to create List view**
* Make listView by columns
```
  val scrollState= rememberScrollState()
  Column(Modifier.verticalScroll(scrollState)) {
      for (i in 1..50) {
          Text(
              text = "Item $i",
          )
      }
  }
```

* ListView using LazyColumn
```
    LazyColumn{
        itemsIndexed(   //equivalent to for each loop
            listOf("This","is","JetPack","Compose")
        )
        {
            index,string->  Text(
            text = string,
            )
        }
    }

or 
    LazyColumn{
        items(5000){      //equivalent to for loop
            Text(
               text = "Item $it",
            )
        }
    }
```

# Day 55
Learn about Activity, Layouts, Android R.java, View, View Group, Layout Width, Linear Layout

Notes:
Modal==>in case of ecommerce, product,shop are modals
view==> Ui (xml file in this case)
Controller==> act as middle man between Modal and view
R. file==> automatically generated file which constant all the unique int value of all resource like string, image and activities
ViewGroup==> collection of different views or viewGroup
Wrap content==> will take only space of the child,
match parent==> will take as much space as the parent
sp (Scale independent pixel ==> used for font ==> when user change the font size in setting it will increase the font size of the app too
dp (density-independent pixels) ==>used for other

Linear Layout
--Horizonatally(default)
--Vertically

1st it will check and render the child and then it will check for layout width

# Day 62
* Program - set of instruction
* Process - When program gets executed. Process execute the intruction in thread/s
    * Process ID
    * State
    * Memory
    * Handle for Networking, File System

* Sequential Execution 
    - one instructions after another execution
    - Problem:- if one instruction take more time after process will be halt
    - Solution:-  create new thread for different instruction. this will increase the performance

**Coroutines**
- When the instruction begain its execution, it will acquire the thread from the thread pool. and beagin it execution. After some time, it raises the IO operation. so the acquired thread will not wait for the response but begain to execute the next execution until the response hasnot arrived. After the response has arrived, if the previous thread is free then it will use that thread, otherwise use the next thread from the thread pool.
- Exected inside the thread
- One thread can have multiple coroutines
- Cheap
- Limitation of thread is that you can create certain thread but there is no limitation like this

**Dispactcher**
- Dispatchers is a way to define threads on which Coroutines are executed.
- Predefined Dispatchers
    - Dispatchers-IO
    - Dispatchers. Main 
    - Dispatchers. Default

**Start Thread**
```
thread(start=true){}
```

**Start Coorutine**
```
CoroutineScope(Dispatchers.IO).launch{}
or
GlobalScope.launch(Dispatchers.Main){}
or
MainScope().launch(Dispatchers.Default){}
```

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
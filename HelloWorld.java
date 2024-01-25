/*
 * class HelloWorld{
 * public static void main(String[] args){
 * System.out.println("Hello World");}
 * }
 */

// Type conversion

/*
 * byte b = 127;
 * int a =12;
 * a=b;
 * b=(byte)a;
 * System.out.println(b);
 * 
 * int c=257;
 * byte k =(byte)c;
 * System.out.println(k);
 * 
 * 
 * float f=5.6f;
 * int x=(int)f;
 * System.out.println(x);
 */

// Type promotion

/*
 * byte y=10;
 * byte z= 30;
 * int result = y*z;
 * System.out.println(result);
 * }
 * }
 */

// Switch Statement in java

// in n=1 I want to print monday
/*
 * import java.util.Scanner;
 * class HelloWorld{
 * 
 * public static void main(String[] args) {
 * Scanner scanner =new Scanner(System.in);
 * int n=scanner.nextInt();
 * 
 * switch(n){
 * case 1:
 * System.out.println("Monday");
 * break;
 * case 2:
 * System.out.println("Tuesday");
 * break;
 * case 3:
 * System.out.println("Wednesday");
 * break;
 * case 4:
 * System.out.println("Thursday");
 * break;
 * case 5:
 * System.out.println("Friday");
 * break;
 * case 6:
 * System.out.println("Saturday");
 * case 7:
 * System.out.println("Sunday");
 * break;
 * default:
 * System.out.println("Invalid date");
 * break;
 * 
 * //break; statement within the default case terminates the entire switch
 * statement. When Java encounters a break; statement, it exits the nearest
 * enclosing loop or switch statement.
 * //This ensures that if the default case is reached, the switch statement is
 * immediately terminated.
 * }
 * }
 * }
 */

// or new update in switch cases statements
// use "->" instead of "break" statement.
// either use all ':' or use all '->' for switch cases statements.

/*
 * class HelloWorld{
 * 
 * public static void main(String[] args) {
 * String day="Monday";
 * 
 * switch(day){
 * case "Saturday","Sunday" -> System.out.println("6AM");
 * case "Monday" -> System.out.println("8AM");
 * default -> System.out.println("7am");
 * }
 * }
 * }
 */

// using Switch case as an return statement it will evaluate and return the
// value.@interface

/*
 * public static void main(String[] args) {
 * String day="Monday";
 * String result = " ";
 * 
 * switch(day){
 * case "Saturday","Sunday" -> result = "6AM";
 * case "Monday" -> result = "8AM";
 * default -> result = "7am";
 * }
 * System.out.println(result);
 * }
 * }
 * 
 * or
 * 
 * public static void main(String[] args) {
 * String day="Monday";
 * String result = " ";
 * 
 * result = switch(day){
 * case "Saturday","Sunday" -> "6AM"; // if you prefer to use ":" use ": yield"
 * instead of "->"
 * case "Monday" -> "8AM";
 * default -> "7am";
 * };
 * System.out.println(result);
 * }
 * }
 */

// "class and object in java"

// create a public class,variables,method and object(instance)

/*
 * class Calculator{
 * 
 * int a;
 * public int add(int n1,int n2){
 * System.out.println("add");
 * 
 * // returning the values
 * int r = n1 + n2;
 * return r; // or return n1 + n2
 * }
 * }
 * public class HelloWorld{
 * public static void main(String[] args){
 * 
 * int num1=4;
 * int num2=3;
 * 
 * // to use the class Calculator you need to create an object of it
 * // "Calculator" is an reference variable and new Calc =new Calculator(); is a
 * object
 * // creating a object will comsume the space in JVM
 * Calculator calc=new Calculator();
 * 
 * int result =calc.add(num1,num2);
 * 
 * System.out.println(result);
 * 
 * }
 * }
 */

// constructor in java

// under the hood in the java

/*
 * JDK = Java Development Kit
 * 
 * converting code into bite code we need JDK
 * 
 * JVM = Java Vartiual Machine
 * 
 * JVM is the space you actually exicute the bytecode
 * 
 * JRE = Java Runtime Environment
 * 
 * JRE will act as a libray Environment
 * 
 */

// Methods in Java

// one class HelloWorld
// main is the method which is start of execution in "public static void
// main(String[] args"

// class Computer{

// public void playMusic()
// {
// System.out.println("Music Playing..");
// }
// public String getMePen(int cost)
// {
// // what if the cost is less than 10
// if(cost>=10)
// return "Pen";

// return "Nothing";

// }

// }

// public class HelloWorld{
// public static void main(String[] args){
// Computer obj = new Computer();
// obj.playMusic();
// String str = obj.getMePen(5);
// System.out.println(str);

// }
// }

// the differnt between the main method and playMusic method is Satic keyword
// need to learn about static

// " Method OverLoading in Java "
// methods can use or have same names add in below but it should have different
// parameters
// either in should have different types of methods or with same name differnt
// parameters
// having different return type with same parameters will also not work

// class Calculator{

// public int add(int n1,int n2){
// return n1 + n2;
// }
// public int add(int n1,int n2,int n3){ // same method name different
// parameters
// return n1 + n2 + n3;
// }
// //this method is acceptable
// public double add(double n1,int n2){
// return n1 + n2;
// }
// // error for above diferent return types
// // int result=(int)obj.add(3.5,4,5);
// // System.out.println(result);

// }
// public class HelloWorld{
// public static void main(String[] args){
// Calculator obj=new Calculator();

// int result=obj.add(3,4,5);
// System.out.println(result);

// }
// }

// "Method overriding"

// "Stack and Heap in Java"

// Stack memory -> last in and first out input: 1,2,3 and output: 3,1,2

// Heap Memory ->

// variable types

// class Calculator{

// int num=5; // instance variable

// public int add(int n1,int n2){ // n1 & n2 are local variables part of method
// add
// return n1 + n2;
// }
// }
// public class HelloWorld{
// public static void main(String[] args){

// int data =10;

// Calculator obj=new Calculator();
// Calculator obj1=new Calculator();
// int result=obj.add(3,4);

// obj.num=8; // this will refer to the heap memory of obj with two colums num
// and add ()
// where obj1 and obj will have two different heap memories to refere with each
// unique id or address.
// here we have a link from stack to heap memory to look for obj and obh=j1

// System.out.println(result);
// System.out.println(obj.num);
// System.out.println(obj1.num);
// }
// }

// 2 stacks = add and main stacks
// under add variables created are n1 and n2 and under main obj,obj1, data and
// result
// heap memory variable is num
// notes: ananomous objects why the link between stack and heap memory is
// important.

// Array and multi Dimensional arrays

// public class HelloWorld{
// public static void main(String[] args){
// int num [][]= new int[3][4];

// for(int i=0; i<3; i++)
// {
// for(int j=0; j<4;j++){

// num [i][j]=(int)(Math.random() *100); // type casting from double to int
// Math.random will fill the random numbers to arrays
// // if you want the single digit numbers to assign to numb array multiply by
// 10
// }

// }
// for(int i=0; i<3; i++)
// {
// for(int j=0; j<4;j++){
// System.out.print(num [i][j]+" ");
// }
// System.out.println();
// }

// // lets try with enhanced for loop

// for(int n[] : num)
// {
// for(int m:n){
// System.out.print(m+" ");
// }
// System.out.println();
// }
// }
// }

// jagged and 3D array in java

// public class HelloWorld{
// public static void main(String[] args){
// int num [][]= new int[3][]; // jagged array where the length of the each will
// not be specified it will be assigned individually

// num[0]=new int[3];
// num[1]=new int[4];
// num[2]=new int[2];

// for(int i=0; i<num.length; i++)
// {
// for(int j=0; j<num[i].length;j++){

// num [i][j]=(int)(Math.random() *10);

// }
// }
// for(int n[] : num)
// {
// for(int m:n){
// System.out.print(m+" ");
// }
// System.out.println();
// }

// }
// }

// Drawbacks of Array in java

// the array data strored in heap memory will take linear space here the array
// is object (num)
// if you use the new keyword in java it is a object in java
// the lenght will be fixed for the array you can't expand the lenght of the
// array in future
// NOTE: check out the collection in array

// Arrays of Objects in Java

// class Student
// {
// int rollno;
// String name;
// int marks;
// }

// public class HelloWorld{
// public static void main(String[] args){

// Student s1 = new Student();
// s1.rollno =1;
// s1.name ="Alice";
// s1.marks = 88;

// Student s2= new Student();
// s2.rollno =2;
// s2.name ="Bob";
// s2.marks = 78;

// Student s3 = new Student();
// s3.rollno =1;
// s3.name ="William";
// s3.marks = 98;

// Student students[] = new Student[3]; // objects of student with the array
// students.

// students[0]=s1;
// students[1]=s2;
// students[2]=s3;

// for(int i=0; i<students.length; i++)
// {
// System.out.println(students[i].name + " : "+students[i].marks);
// }

// or enhanced for loop statement

// for(Student stud:students)
// {
// System.out.println(stud.name + ":" + stud.marks);
// }

// }
// }

// Enhanced for loop in java(for each loop by general programming languages)

// What is string in java

// this is how you create a string object in java because string is a class

// public class HelloWorld{
// public static void main(String[] args){
// String name = new String ("John");

// // instead of the above object creation you can use this below method this
// will create object automatically in the backend

// String name1 = "Ivana";

// System.out.println("hello " + name);
// System.out.println(name.hashCode());

// // Since name is a class we have methods here we used chartAt method can see
// the charter at a particular location

// System.out.println(name.charAt(0));

// // concatinate string

// System.out.println(name.concat(" logan"));

// }
// }

// mutable and immutable strings

// public class HelloWorld{
// public static void main(String[] args){
// String name = "John"; //once the new address has been updated in stack memory
// the object "name" in heap memory where it has stored the data "John" is
// eleigible for garbage collection(it will be removed after sometime)

// name = name + " Logan"; // here the name will be updated with new address id
// where the object of "john Logan" is saved
// System.out.println("Hello "+ name);

// // the above changes will not alter the exsisting string "name" stored in the
// heap memory

// // for the below stings only one object will be created in heap memory where
// you have s1 and s2 in stack. it is due to the "String constant pool"

// String s1 = "john";
// String s2 = "john";

// System.out.println(s1==s2); //true

// // NOTE : String Literal in java used to make java more memory efficient: As
// multiple reference can point to one value in string pool and no new object
// will be created if it already exist in string constant pool.
// // diff between string literal and string object
// // We have terms to remember while creating a string
// // concept of mutable and immutable strings
// // NOTE : Mutable means changed and Immutables means unchanged
// // By default strings are immutable once you have created the object you
// can't change it
// // What if you want to create a mutable string that why we have two different
// classes in Java to use instead of using string you can use "StringBuffer" and
// "String Builder"

// }
// }

// "StringBuffer" used to create mutable strings
// diff between StringBuffer and StringBuilder where StringBuffer is thread safe
// (thread concept)

// public class HelloWorld{
// public static void main(String[] args){

// StringBuffer sb = new StringBuffer("Naveen"); // after the data in stored now
// the capacity is increased to 22 due to reduce the relocation of the srings in
// the heap memory it will provide the memory above the saved data.@interface

// // to check the capacity fo the string buffer (it will provide 16 bites)
// System.out.println(sb.capacity());

// // append data alter the string
// System.out.println(sb.append(" Reddy"));

// // convert the String Buffer to String
// String str = sb.toString();

// }
// }

// Static Variables in java
// Static variables in shared by all the objects in the calss Hello World
// NOTE : There is a different area in our JVM where we have all the static
// variables
// Static variables means you are making the string as class member not an
// object member

// class Mobile
// {
// String brand;
// int price;
// // String name;
// static String name; // static variable is shared by all the objects m1 and m2

// public void show() // this methos will print everythig in the class Mobile
// {
// System.out.println(brand + ":" + price + ":" + name); // in this case the
// show is the non-statice method here we can use the static variable there is
// no harm
// }
// }

// public class HelloWorld{
// public static void main(String[] args){

// Mobile m1 = new Mobile();
// m1.brand ="Apple";
// m1.price = 1500;
// //m1.name = "Iphone15Pro";
// Mobile.name = "Iphone15Pro"; // static variables should be called with their
// class name not with object reference name

// Mobile m2 = new Mobile();
// m2.brand ="Samsung";
// m2.price = 1200;
// //m2.name = "SamsungS1Pro";
// Mobile.name = "SamsungS1Pro";

// //m1.name = "smartPhone";
// Mobile.name ="smartPhone";

// m1.show();
// m2.show();

// }
// }

// What if I create the static method and use the instance variables

// Static Methods

// class Mobile
// {
// String brand;
// int price;
// static String name;

// // constructor in general
// public void show()
// {
// System.out.println(brand + ":" + price + ":" + name);
// }
// // Create the static method
// public static void show1()
// {
// System.out.println("The static method");

// // System.out.println(brand + ":" + price + ":" + name); // you can't use the
// instance variables(non-static objects) "brand & price"in the statice method
// }
// // Creating a static method to pass the objects of class Mobiles instance
// variables(non-static strings)
// public static void show2(Mobile m1)
// {
// System.out.println(m1.brand + ":" + m1.price + ":" + name); // we should call
// the non static variables with their objects
// }

// }

// public class HelloWorld{
// public static void main(String[] args){

// Mobile m1 = new Mobile();
// m1.brand ="Apple";
// m1.price = 1500;
// Mobile.name = "Iphone15Pro";

// Mobile m2 = new Mobile();
// m2.brand ="Samsung";
// m2.price = 1200;
// Mobile.name = "SamsungS1Pro";

// Mobile.name ="smartPhone";

// m1.show();
// m2.show();

// // you can call a static method with the class name "Mobile.show1();" but you
// can't call non static method with the calss name "Mobile.show()"
// // non static variable directly getting access in a static method in
// impossible
// Mobile.show1();

// // in-directly it is possible if you pass the objects m1 and m2 to the static
// method

// Mobile.show2(m1);
// Mobile.show2(m2);
// }
// }

// static block

// class Mobile
// {
// String brand;
// int price;
// static String name;

// static
// {
// name = "Smart_Phone"; // initializing the static variable and it will be
// called once irrespective of how you many objects you have created.
// System.out.println("in static block");
// }

// //constructor
// public Mobile()
// {
// brand ="";
// price = 200;
// //name = "Phone"; // we can initialize the static variable inside the
// constructor
// // every time you you call an object the constructor will be called
// // if you want to initialize the "name" static variable at one time you
// should use static block

// System.out.println("in constructor");
// }

// //NOTE: Why static block in printing first irrespect of the before or after
// the constructor
// // in JVM every time you create the object there is two steps take place
// "Class loads" & "Objects are instantiated"
// // Class will load once because you have a "class loader" in JVM
// // if you haven't created any objects the class will not be load even the
// static block willl not be called
// // what if you want to load the class without the creating the objects you
// should use method "Class.forName(metion your class name)"
// }

// public class HelloWorld {
// public static void main(String[] args) throws ClassNotFoundException // NOTE:
// Exception handling here
// {

// // Mobile m1 = new Mobile();
// // m1.brand ="Apple";
// // m1.price = 1500;
// // Mobile.name = "Iphone15Pro";

// // Mobile m2 = new Mobile();
// // m2.brand ="Samsung";
// // m2.price = 1200;
// // Mobile.name = "SamsungS1Pro";

// // to load the class without creating a objects
// Class.forName("Mobile");

// }
// }

// Encapsulation in Java

// class Human
// {
// int age;
// String name;
// private String middleName = "Logan"; // this name is only accessible by the
// same class
// private int weight;

// // access the private data with methods
// public String getMiddleName() {
// return middleName;
// }

// // what if you don't want to initialize the values in the constructor for
// private variables
// public void setWeight(int w){
// weight = w;
// }

// public int getWeight(){
// return weight;
// }

// }

// public class HelloWorld
// {
// public static void main(String[] args) {

// Human obj = new Human();
// obj.age = 11;
// obj.name = "John";
// //obj.middleName ="Logan"; this can't be initialized

// System.out.println(obj.name);
// // System.out.println(obj.middleName); also can't print this variable

// // you can fetch the private data calling their methods
// System.out.println(obj.getMiddleName());

// //initialize the object for w for setWeight Method
// obj.setWeight(55);

// System.out.println(obj.getWeight());
// }

// }

// Getters and Setters in Encapsulation

// you can use any names in the get and set methods instead of getAge or setAge

// in any ide use can use source action to autogenerate the setters and getters
// methods

// "this" Keyword in Java

// class Human
// {

// private int age;
// private String name;

// // public void setAge(int age,Human obj){
// // Human obj1=obj;
// // obj1.age =age;
// // }
// // instead of the above method to use object you can use "this" to denote the
// instance variable "age"
// // the "age" is use to denote the instance variable and local variable "age"
// you can use the above method using calling and passing the object "Human"
// // here "this" can be used to differentiate the instance variable

// public void setAge(int age){

// this.age =age;
// }

// public int getAge(){
// return age;
// }
// }

// public class HelloWorld{
// public static void main(String[] args){

// // Human obj = new Human();
// // obj.setAge(30,obj); // we need to call the method using the object and
// also passing the object here

// Human obj = new Human();
// obj.setAge(30);

// System.out.println(obj.getAge());
// }
// }

// Constructor or default constructor in Java and Parameterixed Constructors.

// NOTE: what if when I create the object imediately a default value should be
// assinged to the object rather then "null" or "0"
// It is possible only by using the constructor
// constructor looks like method itself and carries the same name as class
// for constructor you don't specify the return type

// class Human
// {
// private int age;
// private String name;

// // constructor

// public Human() // SHOULD BE SAME AS CLASS NAME it is called default
// constructor
// {
// System.out.println("in constructor"); // this will called every time you
// create a object "obj" ,"obj1" etc...

// // let assing the values in the constructor
// age = 12;
// name = "John";
// }

// // Parameterized Constructor

// public Human(int age, String name)
// {
// this.age =age;
// this.name = name;
// }

// // set and get parametes for private data access
// public int getAge()
// {
// return age;
// }

// public void setAge(int age)
// {
// this.age = age;
// }

// public String getName(){
// return name;
// }

// public void setName(String name)
// {
// this.name = name;
// }

// }

// public class HelloWorld{
// public static void main(String[] args){

// Human obj = new Human();
// // after creating the constructor
// System.out.println(obj.getName()+":"+obj.getAge());

// // before creating the constructor
// obj.setAge(14);
// obj.setName("Wick");
// System.out.println(obj.getName()+":"+obj.getAge());

// // parameterized constructor
// Human obj1 = new Human(16, "Logan");
// System.out.println(obj1.getName()+":"+obj1.getAge());

// }
// }

// NOTE: CAN WE DO THE METHOD-OVERLOADING IN CONTRUCTOR

// This and Super Methods in Java

// class A
// {
// public A( )
// {
// System.out.println("in A");
// }
// public A(int n)
// {
// System.out.println("in A int");
// }
// }
// class B extends A
// {
// public B( )
// {
// System.out.println("in B");
// }
// public B(int n) // parameterized constructor
// {
// System.out.println("in B int");
// }

// }
// public class HelloWorld{
// public static void main(String[] args) {

// B obj = new B(5); // by passing value the B it will print "in B int"

// }
// }

// out "in A","in B" Why the constructor subclass "B" called superclass "A" both
// as an output
// Why the parameterized constructor for superclass is called in the output and
// by default it calls only the superclass constructor

// by default we have "super" in every constructor class
// super means call the constructor of the superclass
// even if you don't mention the super() still it exists same for super class
// for every constructor

// class A extends Object // super class constructor // every clas in java
// extends an Object class so the supercalss constructor for class A is object
// {
// public A( )
// {
// super();
// System.out.println("in A");
// }
// public A(int n)
// {
// super();
// System.out.println("in A int");
// }
// }
// class B extends A // subclass constructor
// {
// public B( )
// {
// super(5); // by passing value here it will print "int A int" and " int B"
// System.out.println("in B");
// }
// public B(int n) // parameterized constructor
// {
// super(n); // if you pass the n here it will print the superclass
// parameterized constructor
// System.out.println("in B int");
// }

// }
// public class HelloWorld{
// public static void main(String[] args) {

// B obj = new B();
// B obj1 = new B(5); // by passing value the B it will print "in B int"

// }
// }

// OUTPUT : "in A int" and "int B int"

// this function

// "this() will call the constructor of the same class"
// if you want to execute the below output
// "int A", "int B" and "int B int" both the values of the constructor B using
// single object

// class A extends Object
// {
// public A( )
// {
// super();
// System.out.println("in A");
// }
// public A(int n)
// {
// super();
// System.out.println("in A int");
// }
// }
// class B extends A
// {
// public B( )
// {
// super();
// System.out.println("in B");
// }
// public B(int n)
// {
// this(); // this will called the constructor B here
// System.out.println("in B int");
// }

// }
// public class HelloWorld{
// public static void main(String[] args) {

// B obj = new B(5);

// }
// }

// Naming Conventions

// Camel casing

// class and interface - Calc, Runable
// variable and method - marks, show()
// constants - PIE,BRAND

// showMyName() - camel casing
// show_my_name() -snake casing

// Anonymous Object

// class A
// {
// public A()
// {
// System.out.println("object created");
// }
// public void show()
// {
// System.out.println("int A show");
// }
// }

// public class HelloWorld{
// public static void main(String[] args) {

// // A.obj = new A();
// //or
// // A obj;
// //obj=new A();
// // obj.show();

// //Anonymousy object or objects without reference (object stored in heap no
// reference variable is created in stack)
// // this type of object don't have a name
// // the only problem with these types of objects you can't reuse them

// //new A(); // if you run the code here it will print object created

// new A().show(); // if you want to call the show method

// }
// }

// OOP CONCEPTS
// object , class, encapsulations

// Inheritance

// when you write the same code again and again it is called "redundancy"
// for inheritance you need a java.class file not .java files it will work fine

// class Calc
// {
// public int add(int n1, int n2)
// {
// return n1+n2;
// }
// public int sum(int n1, int n2)
// {
// return n1-n2;
// }
// }

// class AdvCalc extends Calc // here the keyword "extends" work as a inherited
// features of Calc's to AdvCalc
// {
// public int mul(int n1, int n2)
// {
// return n1*n2;
// }
// public int div(int n1, int n2)
// {
// return n1/n2;
// }
// }

// public class HelloWorld {
// public static void main(String[] args) {

// AdvCalc obj = new AdvCalc();
// System.out.println(obj.add(3,4));
// System.out.println(obj.sum(10,3));
// System.out.println(obj.mul(2,2));

// }
// }

// single and Multiple inheritance in Java

// this inheritance will work
// class A
// {

// }
// class B extends A
// {

// }
// class C extends B
// {

// }

// Multiple inheritance in java will not work

// class A
// {

// }
// class B
// {

// }
// class C extends A,B // or A extends B will also not work
// {

// }

// Why: if two parents class has same methods of inheritance it will cause a
// ambiguty conditon between the two parents class methods.

// Method overriding in java

// class A
// {
// public void show()
// {
// System.out.println("in A show");
// }
// public void config()
// {
// System.out.println("in A config");
// }
// }
// class B extends A
// {
// public void show() // this show method overriding the "show" method in class
// A
// {
// System.out.println("in B show");
// }
// }

// public class HelloWorld
// {
// public static void main(String[] args) {
// B obj = new B();
// obj.show();
// obj.config();

// A obj1 = new A();
// obj1.show();
// }
// }

// out put
// in B show
// in A config
// in A show

// Packages in java

// package tools; // tools is a folder

// import tools.Calc; // importing a file from a tool folder

// import tools.*; // to access the all the files from the folder "tools"

// package other.tools; // tools in other folder
// import others.*; // give access to all files in other

// import other.tools.calc: // this is how you access the file of tools through
// other folder

// // what ever inbuilt class we use in java is a imbuild package
// import java.util.ArrayList; // this also a package list you imported
// import java.lang.*; or import java.lang.system; // this is by default package
// name for "System.out.println()" class

// to assign a uique name to your package to give access to globally it should
// be unique.
// website "Maven Repository" mvnrepository.com
// example: if you want to use the library to connect the database "mongodb"
// with java we use package "mongodb-driver-sync"
// " package com.google.calculation;" this is how you define your package name
// unique for your domain

// Access Modifiers

// private , public, protected and default access modifier

// package tools;

// public class A
// {
// // public access modifier
// public int marks=77; // "public" will give access to the other package to
// acces the marks

// // methods are always public
// public void show()
// {
// System.out.println("its a method");
// }

// // variables always private
// private String name = "John";
// // private variable can be used in the same class irrespective of the same
// package itself.

// // default access modifier
// // it can only access in same package
// default String middleName ="Logan";

// // protected access modifier

// protected int MSD = 7;
// }

// class launch
// {
// public void show1()
// {
// A obj =new A();
// System.out.println(obj.MSD);// This will work in same packages

// }
// }
// //

// //package other;

// public class B{

// int marks=88;

// }

// // Protected access data will work in sub-classes
// class C extends A{

// public void abc()
// {
// System.out.println(MSD); // in subclass it is accessible
// }

// }

// public class HelloWorld{
// public static void main(String[] args){
// A obj = new A();
// System.out.println(obj.marks); // trying to access the marks from package
// "tools"
// obj.show();
// B obj1 = new B();
// System.out.println(obj1.marks);

// }
// }

// "Private" Accessible--> same class
// "Protected" Accessible--> Same class, Same package subclass, Same package
// non-subclass, Different package subclass.
// "Public" Accessible--> Same class, Same package subclass, Same package
// non-subclass, Different Package subclass, Different package non-subclass.
// "Default" Accessible--> Same class, Same package subclass, Same package
// non-subclass.

/*
 * NOTE: 1,always keep your method public
 * 2,can't have two public classes in same file
 * "public C extends A{
 * public int show()
 * {
 * 
 * }
 * }"
 * 
 * 3, keep your instance variables private
 * 4, if you want method or a variable which should be accessed only in the
 * subclass of other packages use protected.
 */

// Polymorphism(poly-many, morphy-behaviour) in Java

/*
 * Compile time Polymorphism also called early binding
 * Runtime Polymorphism also called late binding
 * 
 * "overloading" its a part of compile time and "overriding" its a part of
 * runtime.
 */

// Dynamic Method Dispatch in Java

/*
 * we can mention type as parent and obj as child
 * following example:
 */

// class computer
// {
// public void show()
// {
// System.out.println("in computer");
// }
// }
// class laptop extends computer
// {
// public void show()
// {
// System.out.println("in laptop");
// }
// }

// class A
// {
// public void show1()
// {
// System.out.println("in A class");
// }
// }
// class B extends A
// {
// public void show1()
// {
// System.out.println("in B class");
// }
// }
// class C extends B
// {
// public void show1()
// {
// System.out.println("in C class");
// }
// }

// public class HelloWorld{
// public static void main(String[] args) {

// computer obj = new laptop(); // object type as parent and object as child
// obj.show();

// obj = new computer();
// obj.show();

// A obj1 = new A();
// obj1.show1(); // this will print " in A class" from method name "show1()"
// from A class.

// obj1 =new B();
// obj1.show1(); // method overloading this is printing "in B class" of same
// method name "show1()" from B class.
// // it doesn't matter the type of the object it only matters the object itself

// obj1 = new C();
// obj1.show1();

// // the same objects "obj" and "obj1" behaving differently with different
// methods is polymorphcism
// // this is run time polymorphcism becasue the object decide as the exicution
// which method to choose from which class.
// // All this cocept is called Dynamic method dispatching
// }
// }

// Final Keyword

// final keyword can be used with variable, method, class

// if you want to constant the variable so their values can't be changed.

// final keyword in class and method

// final class Calc
// class Calc
// {
// public final void show() // final keyword here it will stop method overriding
// {
// System.out.println("in Calc show");
// }
// public void add(int a, int b)
// {
// System.out.println(a+b);
// }
// }
// class AdvCalc extends Calc // type advance calculator cannot be a subclass of
// the final Calc
// { // you are basically stoping the inheritance of child class AdcCalc.
// }

// to stop method overriding you can use final keyword in method

// class AdvCalc extends Calc
// {
// public void show() // show method can't be used here
// {

// }
// }

// public class HelloWorld {
// public static void main(String[] args){
// int num =8;
// num=9;
// System.out.println(num);

// //final keyword in variable
// final int num1 =7; // final keyword make this variable constant
// //num1=10;
// System.out.println(num1);

// Calc obj = new Calc();
// obj.show();
// obj.add(3,4);

// }

// }

// Object Class equals toString hashcode in Java

// every class in java extends the object class

/*
 * class Laptop
 * {
 * String model;
 * int price;
 * 
 * public String toString() // if you don't have a method here it will call a
 * superclass method which will return hexadecimal values for you objects
 * {
 * return model+ ":" +price;
 * }
 * 
 * // instead of creating the equals method overhere by yourself, you can use
 * IDE help
 * // source Action -> Generate hashCode()and equals() and select the variables
 * you want to compare against
 * // you can use the IDE help to generate "toString()"
 * 
 * 
 * @Override // these are extra annotations. annotation have importance you need
 * to check later
 * public int hashCode() {
 * final int prime = 31;
 * int result = 1;
 * result = prime * result + ((model == null) ? 0 : model.hashCode());
 * result = prime * result + price;
 * return result;
 * }
 * 
 * @Override
 * public boolean equals(Object obj) {
 * if (this == obj)
 * return true;
 * if (obj == null)
 * return false;
 * if (getClass() != obj.getClass())
 * return false;
 * Laptop other = (Laptop) obj;
 * if (model == null) {
 * if (other.model != null)
 * return false;
 * } else if (!model.equals(other.model))
 * return false;
 * if (price != other.price)
 * return false;
 * return true;
 * }
 * 
 * public boolean equals(Laptop that)
 * {
 * if(this.model.equals(that.model)&& this.price == that.price) // for string we
 * use "==" here
 * return true;
 * else
 * return false;
 * 
 * //or
 * 
 * // return this.model.equals(that.model)&& this.price == that.price; // this
 * also produce same values
 * 
 * }
 * 
 * 
 * }
 * 
 * public class HelloWorld
 * {
 * public static void main(String[] args) {
 * 
 * Laptop obj = new Laptop();
 * obj.model = "Lenovo";
 * obj.price = 1000;
 * 
 * // System.out.println(obj.toString()); // here if you mention toSting or not
 * it will print by default hexdecimal unless if you have metion any return in
 * toString method metioned in the above laptop class
 * 
 * //"Laptop@251a69d7" by default the SOP will print "toString" method it is
 * part of hexadecimal numbers
 * // you will not find any toString method in Laptop class unless you have
 * created it but you wil find this in object class
 * 
 * // after adding method "toString"
 * 
 * System.out.println(obj); // here you don't need to menthod the method
 * "toString" it will work
 * 
 * // now we will try to compare the objects has same values
 * 
 * Laptop obj1= new Laptop();
 * obj1.model = "Macbook";
 * obj1.price = 2000;
 * 
 * Laptop obj2= new Laptop();
 * obj2.model = "Macbook";
 * obj2.price = 2000;
 * 
 * // trying to compare the objects by creating boolean here
 * 
 * //boolean result = obj1 == obj2; // false
 * 
 * //boolean result = obj1.equals(obj2); // false
 * 
 * // in our class we don't have the equals it is coming form the object.calss
 * and the reason for false result the objects are compared to their hexadecimal
 * values
 * 
 * 
 * // after creating the equal method above now this will not use equals of
 * object class now it will use the equals of my own object class laptop
 * 
 * boolean result = obj1.equals(obj2); // true
 * System.out.println(result);
 * 
 * 
 * }
 * }
 * 
 */

// Typecasting : Upcasting and Downcasting in java

/*
 * class A
 * {
 * public void show()
 * {
 * int num = 7;
 * System.out.println(num);
 * }
 * }
 * class B extends A
 * {
 * public void show1()
 * {
 * System.out.println("in B show");
 * }
 * 
 * }
 * public class HelloWorld{
 * public static void main(String[] args) {
 * 
 * // upcasting
 * 
 * A obj = (A)new B(); // even you still have the object of B it still works
 * obj.show();
 * 
 * // downcasting
 * 
 * B obj1 = (B) obj; // A is a parent it has no idea of show1 to slove this we
 * need downcasting
 * obj1.show1();
 * 
 * }
 * }
 */

// Wrapper Class in java
/*
 * java is not purely object oriented
 * primitive data types not required object to cast its values
 * as we know every class in Java extends object class but not primitive values
 * int, float,double are primitive types they are not object types
 * it helps java on quick performance on fixed value better than storing the
 * data in heap memory as an object
 * 
 * There are certain values only works with object examples collection
 * framework(similar to array)
 * in array we can have primitive types but in collection it should be object
 * type
 * 
 * Wapper Class
 * 
 * Int, char,double primitive values stored in Wapper classes Integer,Character
 * and double and these integer Classes are extends the object class
 * 
 * boxing : take a primitive value and storing it in object and this concept is
 * called boxing
 * int num=7;
 * Integer num1 = new Integer(num); //boxing
 * 
 * autoboxing : it will convert it automatically
 * 
 * int num=7;
 * Integer num1=num; // autoboxing
 * 
 */

/*
 * public class HelloWorld{
 * public static void main(String[] args) {
 * 
 * int num=7;
 * 
 * //Integer num1=new Integer(8);
 * 
 * Integer num1 = num; // autoboxing here the reference variable num1 is an
 * object so the num is automatically getting converted to object type.
 * 
 * // how you assign a num1 value to primitive type num2
 * 
 * int num2 = num1.intValue(); // you are getting the value from object type to
 * primitive type this is called "unboxing".
 * 
 * System.out.println(num2);
 * //or
 * int num3= num2; // This method is called "Autounboxing" here we assign
 * directly the object value to primitive type.
 * 
 * System.out.println(num3);
 * 
 * 
 * // what if you want to convert string into integer
 * 
 * String str ="14";
 * 
 * int num4 = Integer.parseInt(str); // here Integer is a wapper class where it
 * covers the primitive type.
 * 
 * System.out.println(num4 *2);
 * 
 * 
 * // num = primitive variable
 * // Interger = class type(object type)
 * // num2 = reference variable
 * 
 * 
 * }
 * }
 */

// Abstract Keyword in Java

/*
 * if you don't want to inmplement anything in a method. example in class car we
 * don't want to define drive method you can rather implementing it you can
 * declare it
 *
 * "public abstract void drive();"
 * if you want to declare a method you need to use abstract keyword
 * NOTE: you can have abstract method in only abstract class
 * abstract class Car
 * {
 * public abstract void drive();
 * }
 * if you are extending abstract class you need to define the method from
 * abstract class otherwise it will show an error
 * 
 * NOTE: it is not compelsory to have abstract method in abstract class it can
 * have normal method
 */

/*
 * abstract class Car // this class is called as 'abstract class'
 * {
 * public abstract void drive(); // declaring the method here because it is a
 * feature of the car but sometime you can't define it
 * 
 * public void playMusic()
 * {
 * System.out.println("playing Music");
 * }
 * }
 * 
 * class WagonR extends Car // this class is called as "concrete class"
 * {
 * public void drive() // implementing the drive method in WagonR class
 * {
 * System.out.println("driving...");
 * }
 * }
 * public class HelloWorld
 * {
 * public static void main(String[] args) {
 * 
 * // you can't create the object of the abstract class Car here
 * //car obj = new Car();
 * 
 * Car obj = new WagonR(); // you can use Car as a reference class not to define
 * object
 * obj.drive();
 * obj.playMusic();
 * }
 * 
 * }
 */

// Inner class in java

/*
 * class A
 * {
 * int variable = 7;
 * 
 * public void show()
 * {
 * System.out.println("in show..");
 * }
 * 
 * class B
 * {
 * public void configure()
 * {
 * System.out.println("in config..");
 * }
 * }
 * 
 * // or here you can use "static" for inner class so you can refer directly
 * with the class A object
 * // you can't make outer class static
 * 
 * 
 * static class C
 * {
 * public void show1()
 * {
 * System.out.println("in static inner class..");
 * }
 * }
 * 
 * }
 * public class HelloWorld
 * {
 * public static void main(String[] args) {
 * 
 * // you want to access B you need to refer Class A and Class A object
 * 
 * A obj = new A();
 * A.B obj1 = obj.new B();
 * A.C obj2 = new A.C();
 * 
 * obj.show();
 * obj1.configure();
 * obj2.show1();
 * 
 * }
 * }
 */

// Anonymous Inner Class in Java

/*
 * class A
 * {
 * 
 * public void show()
 * {
 * System.out.println("in A show..");
 * }
 * }
 * public class HelloWorld
 * {
 * public static void main(String[] args) {
 * 
 * // instead of creating new class for overriding the class method show() we
 * can directly implement here.
 * A obj = new A()
 * { // created anonymous inner class
 * public void show()
 * {
 * System.out.println("in new show..");
 * }
 * };
 * obj.show();
 * 
 * }
 * }
 */

// Abstract and Anonymous Inner Class in Java

/*
 * abstract class A
 * {
 * 
 * public abstract void show();
 * public abstract void config();
 * }
 * public class HelloWorld
 * {
 * public static void main(String[] args) {
 * 
 * A obj = new A()
 * {
 * public void show() // providing an implementation here for abstract class "A"
 * {
 * System.out.println("in new show..");
 * }
 * 
 * public void config()
 * {
 * System.out.println("in config");
 * }
 * };
 * obj.show();
 * 
 * }
 * }
 */

// What is the need for the interface in Java

/*
 * class Laptop
 * 
 * {
 * public void code()
 * {
 * System.out.println("code, compile, run");
 * }
 * }
 * class Desktop
 * {
 * public void code()
 * {
 * System.out.println("code, compile, run : Faster ");
 * }
 * }
 * class Developer
 * {
 * public void devApp(Desktop desk) // lap is a object accepted here and it will
 * call the code method
 * {
 * desk.code();
 * }
 * 
 * public void devApp1(Laptop lap)
 * {
 * lap.code();
 * }
 * }
 * public class HelloWorld
 * {
 * public static void main(String[] args) {
 * 
 * Laptop lap = new Laptop();
 * Desktop desk = new Desktop();
 * 
 * 
 * Developer john = new Developer();
 * 
 * john.devApp(desk);
 * 
 * Developer yogitha = new Developer();
 * 
 * yogitha.devApp1(lap);
 * 
 * 
 * }
 * }
 * 
 * // or you can use the follow the following step to execute without overriding
 * object
 * // here the code has executed loosely coupled based on the objects you use
 * // instead of abstract here we use interface and implement
 * 
 * 
 * interface Computer//abstract class Computer
 * {
 * void code(); //public abstract void code();
 * 
 * }
 * 
 * class Laptop implements Computer //extends Computer
 * 
 * {
 * public void code()
 * {
 * System.out.println("code, compile, run");
 * }
 * }
 * class Desktop implements Computer //extends Computer
 * {
 * public void code()
 * {
 * System.out.println("code, compile, run : Faster ");
 * }
 * }
 * class Developer
 * {
 * public void devApp(Computer lap)
 * {
 * lap.code();
 * }
 * }
 * public class HelloWorld
 * {
 * public static void main(String[] args) {
 * 
 * Computer lap = new Laptop(); // now it will become interface reference for
 * computer not class reference
 * Computer desk = new Desktop();
 * 
 * 
 * Developer john = new Developer();
 * 
 * john.devApp(desk); //desk , lap
 * 
 * 
 * }
 * }
 * 
 */

// What is interface in Java

/*
 * all the variables inside the interface are final and static
 * when it is final we need to initialize the variable here
 * 
 * Why the variable is static and final in interface?
 * Static: we don't instantiate the interface A here we do instantiat a class B
 * and we implements methods only methods not variables
 * Final :interface has no own memory in the heap you will create the object are
 * belong to B. If you don't have your own memory how can you have a non final
 * variable in interface A.
 */

/*
 * interface A
 * {
 * int age =30;
 * String name="John";
 * 
 * void show(); // under the hood it is always public abstract method
 * void config();
 * }
 * interface X
 * {
 * void run();
 * }
 * 
 * // interface can entends interface
 * 
 * NOTE: class - class -> extends
 * class - interface /interface - class-> implements
 * interface - interface -> extends
 * 
 * interface Y extends X
 * {
 * //void run1();
 * }
 * class B implements A,Y // interface can implement multiple interfaces compare
 * to abstract class
 * {
 * public void show()
 * {
 * System.out.println(" in A show");
 * }
 * public void config()
 * {
 * System.out.println(" in config");
 * }
 * public void run()
 * {
 * System.out.println("in run");
 * }
 * // public void run1()
 * // {
 * // System.out.println("in run1");
 * // }
 * }
 * public class HelloWorld {
 * public static void main(String[] args) {
 * A obj = new B()
 * {
 * public void show()
 * {
 * System.out.println(" in new show");
 * }
 * };
 * obj.show();
 * obj.config();
 * 
 * X obj1 = new B();
 * obj1.run();
 * 
 * // Y obj2 = new B();
 * // obj2.run1();
 * 
 * // here the interface variables are static by default we can use it directly.
 * 
 * System.out.println(A.age);
 * System.out.println(A.name);
 * }
 * }
 */

// What is Enum in Java

/*
 * enumeration (enum for short)
 * enums are named constants whic we create constants for error codes or in
 * networking concepts
 * instead of creating different object by yourselft you can create a enum
 */

/*
 * enum Status
 * {
 * Running, Failed, Pending, Success; // these are objects and these are named
 * constants
 * // instead of using numbers or stings we can use named constants
 * }
 * 
 * public class HelloWorld
 * {
 * public static void main(String[] args)
 * {
 * Status s = Status.Success; //Running; // here status is a type and object
 * "Running" has been assigned to s
 * System.out.println(s);
 * 
 * // if you want to print the ordinal of the above status
 * System.out.println(s.ordinal());
 * 
 * // what if you want to print all the objects
 * Status [] ss = Status.values();
 * System.out.println(ss[0]);
 * // here you can use enhanced for loop to print all the objects
 * for(Status status :ss)
 * {
 * System.out.println(status + ":"+status.ordinal());
 * }
 * 
 * // enum with if and else and switch cases
 * 
 * Status S = Status.Pending;
 * 
 * if(S == Status.Running)
 * System.out.println("All Good");
 * else if(S == Status.Failed)
 * System.out.println("Try Again");
 * else if(S == Status.Pending)
 * System.out.println("Please wait...");
 * else
 * System.out.println("Done");
 * 
 * // using switch statement (switch supports enum)
 * 
 * Status Sts = Status.Running;
 * 
 * switch(Sts)
 * {
 * case Running:
 * System.out.println("All Good");
 * break;
 * 
 * case Failed:
 * System.out.println("Try Again");
 * break;
 * 
 * case Pending:
 * System.out.println("Please wait...");
 * break;
 * 
 * default://case Success:
 * System.out.println("Done");
 * break;
 * 
 * }
 * }
 * }
 */

// Enum class in java

/*
 * Enum is a class itself but you can't extend enum with any other class
 * apart from extending you can define method, create constructors and own
 * variables
 * by default in java every class extends objects so enum can get like methods
 * hashCode();, toString() methods.
 * 
 */

/*
 * enum Status
 * {
 * Running, Failed, Pending, Success;
 * }
 * 
 * public class HelloWorld
 * {
 * public static void main(String[] args)
 * {
 * Status s = Status.Running;
 * 
 * // enum here extends class and superclass by default
 * 
 * System.out.println(s.getClass().getSuperclass()); //class java.lang.Enum
 * 
 * 
 * }
 * }
 */

/*
 * enum Laptop
 * {
 * MacBook(2000), XPS(2200), Surface, ThinkPad(1800);
 * 
 * private int price;
 * 
 * 
 * // what if you didn't specify a price for a Laptop(Surface) it will throw an
 * exception
 * // before there was a default constructor once you used the parameterized
 * constructor(private Laptop(int price)) so you need to set the price for the
 * surface
 * // or you can use the below method by creating default constructor
 * // why we are using the private constructor because we are creating the
 * objects "MacBook, XPS" in the same class itself
 * 
 * private Laptop() { //default constructor here surface is defined by this
 * constructor
 * price = 500;
 * 
 * }
 * 
 * // used constructor to assign the prices to laptops
 * 
 * private Laptop(int price) { // this constructor prints 3 times by printing
 * the object name you can prove
 * this.price = price;
 * System.out.println("in Laptop : " + this.name());
 * }
 * 
 * // access the private variable price using getters and setters
 * 
 * public int getPrice() {
 * return price;
 * }
 * 
 * public void setPrice(int price) {
 * this.price = price;
 * }
 * 
 * }
 * 
 * public class HelloWorld
 * {
 * public static void main(String[] args)
 * {
 * 
 * // Laptop lap= Laptop.MacBook;
 * 
 * // System.out.println(lap + " : " +lap.getPrice());
 * 
 * 
 * // to get the all the laptops and prices
 * 
 * for(Laptop lap : Laptop.values())
 * {
 * System.out.println(lap + " : " +lap.getPrice());
 * 
 * //MacBook : 2000
 * // XPS : 2200
 * // Surface : 1500
 * // ThinkPad : 1800
 * 
 * }
 * 
 * }
 * }
 * 
 */

// What is Annotation in Java

/*
 * A supplement to an runtime or a compiler
 * you can show the intension with the help of annotations
 * annotations are : @Override we don't use annotation in core java
 * once you start work with framework example hibernate framework or spring
 * framework
 * some annotations which works with methods and some with variables and some on
 * class levels
 * class level annotations : @Deprecated
 * 
 * @Deprecated either use the class or not use it.@interface
 * if you set a annotation you can set a retention level for that annotation
 * (which means till what level this annotation is applicable.)
 * you can set the annotation to compilery or till runtime.
 */

/*
 * @Deprecated // annotation for class level
 * class A
 * {
 * public void showTheDataWhichBelongsToThisClass()
 * {
 * System.out.println("in A show");
 * }
 * }
 * class B extends A
 * {
 * 
 * @Override // annotation for method level
 * public void showTheDataWhichBelongsToThisClass()
 * {
 * System.out.println("in B show");
 * }
 * }
 * 
 * public class HelloWorld
 * {
 * public static void main(String[] args)
 * {
 * B obj = new B();
 * obj.showTheDataWhichBelongsToThisClass();
 * 
 * }
 * }
 */

// Functions Interface New in Java

/*
 * we can call this interface as SAM(single abstract method interface) or
 * fanctional interface
 * we can use the annotation called @FunctionalInterface
 * Once you use the annotation we are making sure that we can use only one
 * method.
 * from Java8 java is not completely verbose language here they introduce Lambda
 * expression it can be used only with function interface
 */

// Lambda Expression in Java

/*
 * 
 * @FunctionalInterface
 * interface A
 * {
 * void show(int i);
 * 
 * }
 * public class HelloWorld
 * {
 * public static void main(String[] args)
 * {
 * //A obj = new A()
 * 
 * // instead of using the above code here you can use lambda expression here
 * // "->" is an lambda expression
 * 
 * // A obj = () -> System.out.println(" in interface A");
 * 
 * // to accept the value here
 * 
 * // A obj = (int i) -> System.out.println(" in interface A " + i);
 * // A obj = (int i, int j) -> System.out.println(" in interface A " + i); //
 * multiple variables
 * 
 * //A obj = (i) -> System.out.println(" in interface A " + i); // no need to
 * mention the variable types
 * 
 * A obj = i -> System.out.println(" in interface A " + i); // in you only one
 * variable you can remove the bracket here
 * 
 * 
 * 
 * obj.show(5);
 * }
 * }
 */

// Lambda Expression with return type

/*
 * once you are calling the function passing the object or method as lambda
 * expression(in collection we use this)
 */

/*
 * @FunctionalInterface
 * interface A
 * {
 * int add(int i,int j);
 * 
 * }
 * public class HelloWorld
 * {
 * public static void main(String[] args)
 * {
 * // A obj = new A()
 * // {
 * // public int add(int i, int j)
 * // {
 * // return i+j;
 * // }
 * // };
 * 
 * // using LambdaExpression
 * 
 * A obj = (i,j) -> i+j; // if you only one statement it has to return you
 * whatever you write here will become return type
 * 
 * 
 * int result = obj.add(5,9);
 * System.out.println(result);
 * 
 * }
 * }
 */

// Types of Interface in Java

/*
 * Normal Interface : Two or more methods can be defined in the normal interface
 * Functional Interface(SAM): Interface has only one method
 * Marker Interface: Interface which has no method
 * Marker interface is a empty interface used to interact or update with the
 * compiler (Java Serialization)
 * Serialization is converting objects into byte streams that can be stored,
 * shared, and used by Java Machines to reconstruct the objects.
 * reusing the serialized data is called "Deserialization"
 * every object not allowed to be serialized and deserialized you should give
 * permission to do so. by marking up the object.
 * 
 * 
 */

// What is Exception and Exception Handling in Java Using try catch

/*
 * Types of error
 * 
 * Compile time error :
 * Run time error :
 * your execution will be interepted if you face the runtime error
 * exceptions are run time errors
 * Logical error : Bug
 */

/*
 * public class HelloWorld {
 * public static void main(String[] args) {
 * //System.out.Println(); // Compile error
 * System.out.println(2+2); // output is 5 it is supposed to be 4 this is
 * "logaical error"
 * System.out.println(2/0); // runtime error
 * }
 * }
 */

// use of try and catch for exception handling

/*
 * public class HelloWorld {
 * public static void main(String[] args) {
 * 
 * int i =0;
 * int j =0;
 * 
 * try
 * {
 * j=18/i;
 * }
 * catch(Exception e) // catch block executed only in case of exception
 * {
 * System.out.println("Something went wrong");
 * 
 * System.out.println("Something went wrong" + e); // if you want to print
 * exception as well
 * 
 * 
 * }
 * 
 * System.out.println(j); // here the j value is 0 as it is
 * 
 * System.out.println("Bye World!");
 * }
 * }
 */

// Try with Multiple Catch in Java
/*
 * once it the first exception it will try to exist the try block after without
 * executing the second exception
 * why we need to multiple catch block
 * either the exception is from diff try block it will execute the same catch
 * block exception and it message
 * for the below example you can use if fucntion to check the exception "e" is
 * ArithmeticException or something else.
 * 
 * if you have a exceptional statement in try block but you don't have a specify
 * catch block for it that means you are not handling it well
 */

/*
 * public class HelloWorld {
 * public static void main(String[] args) {
 * 
 * // int i =0;
 * int i =2;
 * int j =0;
 * String str = null;
 * 
 * int nums[] = new int[5];
 * 
 * try
 * {
 * j=18/i; // exception 1
 * System.out.println(str.length()); // exception 2
 * System.out.println(nums[1]);
 * System.out.println(nums[5]); // exception 3
 * }
 * // catch(Exception e)
 * // {
 * // System.out.println("Something went wrong" + e);
 * 
 * // }
 * 
 * // what if you specify the exception in catch
 * 
 * catch(ArithmeticException e)
 * {
 * System.out.println("Cannot divide by zero");
 * }
 * catch(ArrayIndexOutOfBoundsException e)
 * {
 * System.out.println("Out of bounds exception");
 * }
 * // if you don't know what exception may be there you can keep the parent
 * exception in the bottom to handle exceptions.
 * catch(Exception e)
 * {
 * System.out.println("Something went wrong" + e);
 * }
 * 
 * System.out.println(j);
 * 
 * System.out.println("Bye World!");
 * }
 * }
 */

// Exception is a super class ( Exception Hiearchy in Java)

/*
 * What class belongs to where
 * which exception to handle first or prioritizing the exception and which
 * exception no need to handle
 * 
 * Object -- Throwable -- 1, Error:
 * 2, Exception
 * Exception you can handle
 * Error you can't handle you need to recheck the code here
 * Error -- 1, Thread Death
 * 2, IOError (input or output wrong)
 * 3,Virtual Machine Error
 * 4,Out of Memory Error
 * 
 * Exception -- 1, Runtime Exception(Arthematic Exception,
 * ArrayIndexedOutOfBoundsException and NullPointerException)
 * 
 * 1, SQLException -- check exception
 * 2, IOException
 * All Runtime Exception are called unchecked exceptions
 * Other Exception are called checked exceptions
 * checked exceptions you need to handle it
 * 
 */

// Exception throw Keyword in Java

/*
 * we have throw and throws keyword in Java
 * throw keyword is used to throw the exception and catch block will be catching
 * it
 */

/*
 * public class HelloWorld {
 * public static void main(String[] args) {
 * 
 * // int i =0;
 * int i = 20;
 * int j = 0;
 * 
 * try {
 * j = 18 / i;
 * if (j == 0)
 * // throw new ArithmeticException(); or you can use throw to send to message
 * too
 * throw new ArithmeticException("Can't divided by zero and greater values");
 * }
 * 
 * catch (ArithmeticException e) {
 * j = 18 / 1; // to throw a default output
 * System.out.println("That is the default output" + e); // you need to add "e"
 * exception here to
 * // show the throw message to client.
 * } catch (Exception e) {
 * System.out.println("Something went wrong" + e);
 * }
 * 
 * System.out.println(j);
 * 
 * System.out.println("Bye John!");
 * }
 * }
 */

// Custom Exception in Java

/*
 * if you want to throw you own exception
 * by creating a class with extends parent Exception
 * you can extent exception or run time exceptions
 */

/*
 * class JohnException extends RuntimeException { // Exception {
 * public JohnException(String string) {
 * super(string); // you need call the super constructor to pass the message of
 * throw
 * 
 * }
 * }
 * 
 * public class HelloWorld {
 * public static void main(String[] args) {
 * 
 * int i = 20;
 * int j = 0;
 * 
 * try {
 * j = 18 / i;
 * if (j == 0)
 * throw new JohnException("I don't want to print zero");
 * 
 * } catch (JohnException e) {
 * j = 18 / 1;
 * System.out.println("exception: I print default value" + e);
 * } catch (Exception e) {
 * System.out.println("something went wrong");
 * }
 * 
 * System.out.println(j);
 * 
 * System.out.println("Bye user!");
 * }
 * }
 */

// Ducking Exception using throws in Java (using throws keyword)

/*
 * ducking the exception using throws keyword where the exception are handled by
 * class and extended classes using try catch
 * 
 */
/*
 * class A
 * {
 * public void show()
 * {
 * try
 * {
 * //Class.forName("Calc");// Class loaded
 * Class.forName("John"); // this will throw the exception.
 * 
 * }
 * catch (ClassNotFoundException e)
 * {
 * System.out.println("Not able to find the class" + e);
 * }
 * }
 * }
 * 
 * public class HelloWorld{
 * 
 * // static block
 * 
 * static{
 * System.out.println("Class Loaded");
 * }
 * public static void main(String[] args) {
 * A obj = new A();
 * obj.show();
 * }
 * }
 * // or you can do this using throws
 * 
 * class A {
 * public void show() throws ClassNotFoundException {
 * 
 * Class.forName("John");
 * }
 * }
 * 
 * public class HelloWorld {
 * // public static void main(String[] args) throws ClassNotFoundException { //
 * // this is not recommended you can't call main method handel the exception
 * main
 * // in
 * // handel by JVM then it will stop the execution
 * 
 * public static void main(String[] args) {
 * A obj = new A();
 * try {
 * obj.show();
 * } catch (ClassNotFoundException e) {
 * System.out.println("Class not Found");
 * 
 * // to get the Hierarchy of the methods you can use this statement
 * e.printStackTrace();
 * }
 * 
 * }
 * }
 */

// User Input using BufferedRear and Scanner in Java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args) throws IOException{
        
        System.out.println("Enter a number");

        //println is an method belongs to printstream.class 
        //out is the object to use println() of printSteam class and "out" object belongs to System.class and created as static variable
        //Since it is a static variable(out) we can use as Syste.out 

        // to receive the input 
      
           //int num= System.in.read(); 

          // System.out.println(num);// this will print all the husky numbers by default how to capture the values from user input

           //System.out.println(num -48); // this will provide the caputre the input values
          // what is you want more the one input you need to use loop here to avoid these confusion we work with class "BufferReader" and
            
          //BufferReader
         // intstead of working with System.in.read()

        //  InputStreamReader in = new InputStreamReader(System.in); // you have to get the "in" object you need InputStream object of System.class.
        //  BufferedReader bf = new BufferedReader(in);  // if you go to bufferreader constructor you need to pass as "in" object from inputSteamReader object
         
        //  int num = Integer.parseInt(bf.readLine());
        //  System.out.println(num);
        // in is the object to use read() of InputStream.class and "in" object belongs to System.class and created as static variable
        // this code will throw an exception it is checked exception of IOException
        // BufferReader can take input from System file, user, network and you can mention it in buffer reader "BufferReader bf = new BufferReader(input.txt);""
        

        // if you open a resource you need to close it example of resource  file , network and database connection

         //bf.close();

        // instance of BufferReader you can use scanner class

        Scanner sc = new Scanner(System.in); // You have to mention here where you get the input from either file, console or database
        
        int num1=sc.nextInt();

        System.out.println(num1);

    }
}

//Format Specifiers
 /* 
 %c character
%d decimal (integer) number (base 10)
%e exponential floating-point number
%f floating-point number
%i integer (base 10)
%o octal number (base 8)
%s String
%u unsigned decimal (integer) number
%x number in hexadecimal (base 16)
%t formats date/time
%% print a percent sign
\% print a percent sign

Note: %n or \n are used as line separators in printf().
*/   

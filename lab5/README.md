# Laboratory 5 - OOP


## Inheritance

##### Task1

1.  _**Create 10 classes with their names as first 10 aphabetical letters (A, B, C, D, ... , J).
Each next class inherits from previous letter class (ex: B inherits from A, C inherits from B ...).**_

_**Each class should have their own String property with corresponding letter as their refference (ex: A - public String a; public B - String b; ... J - public String j;).**_

1.  _**Create by an object of each class type and print it in console in a clever way (such that to be clear each objects states).**_


##### Task 2

1. _**Change all states from previous classes from public access specifiers to protected.**_

1. _**Create class X which has a private String name property that should have also a constructor for that X.**_

1. _**Add a object of X to A class as a state and modify the constructor of A from A(new String("blabla")) to A(new String("blabla"), new X("some name")).**_

* _**Checkout for errors if appeared in child classes and try to resolve the issue.**_

1. _**Finally print J and see what happens states does it have.**_


##### Task3

1. _**Add initial value to state X from class A. (ex: protected X x = new X("xxx")).**_

* _**Print a object of J and see the result.**_

2. _**Go in class D and create also a state with the same name x as in class A and give another initial value.**_

* _**Print the result and checkout if any changes.**_

3. _**Now do the same in class H and add to a state x another initial value.**_

* _**Chackout again if any changes when printing object of class J.**_

4.**_Make the property x from class H private and checkout now if any errors appeared and try to solve them._**

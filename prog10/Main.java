class Parent {
    public void func1(){
        System.out.println("==> Class Parent | method func1 <==");
    }
}
class Child extends Parent{
    public void func1(){
        System.out.println("==> Class Child | method func1 <==");
    }
    public void func2(){
        System.out.println("==> Class Child | method func2 <==");
    }
}

public class Main {
    public static void main(String[] args){
        Parent ppRef = new Parent();
        Parent pcRef = new Child();
        // Child cpRef = new Parent(); // Type mismatch: cannot convert from parent to child
        Child ccRef = new Child();

        System.out.println("\n\n====> Parent ref | obj Parent <====");
        ppRef.func1();
        // ppRef.func2(); // The method func2() is undefined for the type Parent

        System.out.println("\n\n====> Parent ref | obj Child <====");
        pcRef.func1();
        // pcRef.func2(); // The method func2() is undefined for the type Parent

        System.out.println("\n\n====> Child ref | obj Child <====");
        ccRef.func1();
        ccRef.func2();
    }
}

/*

case 1: the reference variable only knows the methods which are declared in its class type.
Main.java:28: error: cannot find symbol
        pcRef.func2(); // The method func2() is undefined for the type Parent
             ^
  symbol:   method func2()
  location: variable pcRef of type Parent
1 error

case 2: if the method is declared (func1 in this case) then it will access the method latest overriden method definition in the subclass's object. 
*/

/*
Program output:

====> Parent ref | obj Parent <====
==> Class Parent | method func1 <==


====> Parent ref | obj Child <====
==> Class Child | method func1 <==


====> Child ref | obj Child <====
==> Class Child | method func1 <==
==> Class Child | method func2 <==

*/

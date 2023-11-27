package p1;
//import p1.Child;

public class Main {
    public static void main(String args[]){
        Child c = new Child();
        c.defaultMethod();
        c.protectedMethod();
        c.publicMethod();       
    }
}

/*
 * 
 * 
##############################################################################################################

case 1: Not compilable & Main.java is outside the package

    $ javac Main.java
    Main.java:7: error: defaultMethod() is not public in Child; cannot be accessed from outside package
            c.defaultMethod();
            ^
    Main.java:8: error: protectedMethod() has protected access in Child
            c.protectedMethod();
            ^
    2 errors

##############################################################################################################

case 2: Main.java inside the p1 package & converted defaultMethod in Child to private
$ javac p1/Child.java
p1\Child.java:8: error: defaultMethod() in Child cannot override defaultMethod() in Parent
    private void defaultMethod(){
                 ^
  attempting to assign weaker access privileges; was package
1 error

##############################################################################################################

case 3: converted defaultMethod in Child to public
$ java p1/Main

defaultMethod present in Child


protectedMethod present in Child


publicMethod present in Child


##############################################################################################################

case 4: publicMethod is commented in Child
$ java p1/Main

defaultMethod present in Child


protectedMethod present in Child


publicMethod present in Parent

##############################################################################################################

case 5: commented protectedMethod in parent & child class
$ java p1/Main

defaultMethod present in Child


protectedMethod present in GrandParent


publicMethod present in Parent


* 
 */
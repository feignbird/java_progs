// ###########################################
///// PROGRAM NOT WORKING YET
// ################################################

import java.util.Scanner;


// Exception handling goals
    // show that even after getting error, the program do not stop & continue its execution after exeception handling is done.
    // show example of Checked Exception, Unchecked Exception, Error
    // show example of user defined exception
    // handle exceptions using try{}catch{} block
    // multiple catch{} block
    // use finally block
    // Make a class to catch an exception created by division by zero along with finally block.
    // Make an user defined exception InalidMobileNumberException and thrown when the mobile number entered by user is invalid format.

class NotAllowedException extends Exception {
    public NotAllowedException(String s){
        super(s);
    }
    // public String toString(){
    //     System.out.println("Not Allowed Exception...");
    // }
}


class ExceptionCheck {
    public void divideByZero(){
        try{
            int i = 5/0;
        } catch(ArithmeticException e){
            System.out.println("Some exception happened. " + e.toString());
        }
        System.out.println("Next steps ....");
    }
    public void validateAge(int age){
        if (age<=18){
            throw new ArithmeticException("Not Valid");
        }
        else {
            System.out.println("You are allowed.");
        }
    }
    public void validateName(String name){
        if (name.startsWith("A")){
            // throw new NotAllowedException("Not Allowed!");
        }
        else {
            // Complete it
        }
    }


}

public class Main {
    public static void main(String[] args){
        ExceptionCheck eCheck = new ExceptionCheck();
        eCheck.divideByZero();

        // eCheck
    }
}
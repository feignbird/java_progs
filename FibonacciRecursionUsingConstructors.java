/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author feignbird
 */

import java.util.Scanner;
import java.util.InputMismatchException;

class Fibonacci {
    private int count = 0;
    
    Fibonacci(){
        this.count = 10;
    }
    Fibonacci(int _count){
        this.count = _count;
    }

    public void setCount(int _count){ this.count = _count; }
    
    public long getNthFibonacciNumber(int _count){
        switch(_count){
            case 1 -> { return 0l; }
            case 2 -> { return 1l; }
        }
        return (this.getNthFibonacciNumber(_count-1) + this.getNthFibonacciNumber(_count-2));
    }
    
    public void printNFibonacciNumbersUsingRecursion(){
        for(int i=1; i<=this.count; i++){
            System.out.print(this.getNthFibonacciNumber(i)+", ");
        }
    }
    
    public void printNFibonacciNumbersUsingLoop(){
        long first=0, second=1, third=0;
        for(int i=1; i<=this.count; i++){
            System.out.print(first + ", ");
            third = first + second;
            first = second;
            second = third;
        }
    }
}



public class FibonacciRecursionUsingConstructors {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number for how many fibonacci numbers you want to print: ");
        int fiboIndex = 5;
        try{
            fiboIndex = sc.nextInt();
        }catch(InputMismatchException ex){
            System.out.println("Dear user, Enter an integer value -" + ex.toString());
            System.exit(0);
        }
        Fibonacci fDefault = new Fibonacci(), fParameterized = new Fibonacci(fiboIndex);
        System.out.println("\n\nDoing the slow way: ");
        fDefault.printNFibonacciNumbersUsingRecursion();
        System.out.println("\n\nDoing the fast way: ");
        fDefault.printNFibonacciNumbersUsingLoop();

        System.out.println("\n\nDoing the slow way: ");
        fParameterized.printNFibonacciNumbersUsingRecursion();
        System.out.println("\n\nDoing the fast way: ");
        fParameterized.printNFibonacciNumbersUsingLoop();
    }
}

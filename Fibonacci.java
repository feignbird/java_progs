/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author admin
 */

class DisplaySeries {
    public static void printTillN(int n){
        int first=0,second=1,third;
        while(first+second < n){
            third = first+second;
            System.out.println(third);
            first = second;
            second = third;
        }
    }
}


public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        DisplaySeries.printTillN(100);
    }
}

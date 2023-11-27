/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author admin
 */
public class ReverseArray {
    
    int intArray[] = {32, 72, 93, 12, 45, 15};
    
    ReverseArray(){}
    
    public void reverseFor(){
        System.out.println("\nreverseFor:");
        for(int i=this.intArray.length-1; i>=0; --i){
            System.out.print(intArray[i]+", ");
        }
    }
    
    public void reverseWhile(){
        System.out.println("\nreverseWhile:");
        int i=this.intArray.length-1;
        while(i>=0){
            System.out.print(intArray[i]+", ");
            --i;
        }
    }
    
    public void reverseDoWhile(){
        System.out.println("\nreverseDoWhile:");
        int i=this.intArray.length-1;
        do {
            System.out.print(intArray[i]+", ");
            --i;
        }while(i>=0);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        ReverseArray r = new ReverseArray();
        r.reverseFor();
        r.reverseWhile();
        r.reverseDoWhile();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author admin
 */

class ComplexCalc {
    double real;
    double img;
    
    /*
    ComplexCalc(){
        System.out.println("Invoked default constructor ...");
    }
    */
    
    ComplexCalc(double _real, double _img){
        // System.out.println("Constructor invoked .....");
        this.real = _real;
        this.img = _img;
        // System.out.println(this.toString());
    }
    
    public ComplexCalc add(ComplexCalc c){
        // System.out.println("ComplexCalc add method executed " + c.toString() + " + " + this.toString());
        return new ComplexCalc(this.real + c.real, this.img + c.img);
    }
    
    public ComplexCalc mul(ComplexCalc c){
        // System.out.println("ComplexCalc mul method executed " + c.toString() + " + " + this.toString());
        // a = this.real
        // b = this.img
        // c = c.real
        // d = c.img
        // (a+ib)*(c+id) = (ac + iad + ibc + (-bd)) = (ac - bd) + i(ad+bc)
        return new ComplexCalc(this.real*c.real - this.img*c.img, this.real*c.img + this.img*c.real);
    }
    
    @Override public String toString(){
        String toStringReturn = this.real + " + ("+ this.img + "i)";
        return toStringReturn;
    }
}


public class Complex {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        ComplexCalc c1, c2, c3;
        c1 = new ComplexCalc(4.0, 5.0);
        c2 = new ComplexCalc(5.0, 6.0);
        
        c3 = c1.add(c2);
        System.out.println("adding result of ("+ c1.toString() +") + ("+ c2.toString() + ") = c3: "+c3.toString());
        c3 = c1.mul(c2);
        System.out.println("multiplication result of ("+ c1.toString() +") + ("+ c2.toString() + ") = c3: "+c3.toString());
    }
}

















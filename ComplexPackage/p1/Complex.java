package p1;
public class Complex {
    private double real;
    private double img;
    
    /*
    Complex(){
        System.out.println("Invoked default constructor ...");
    }
    */
    public Complex(){
        real = 0;
        img = 0;
    }
    public Complex(double _real, double _img){
        // System.out.println("Constructor invoked .....");
        this.real = _real;
        this.img = _img;
        System.out.println("Calling from Complex parameterized constructor");
        
        // System.out.println(this.toString());
    }

    protected void setReal(double real){
        this.real = real;
    }
    protected void setImg(double img){
        this.img = img;
    }

    protected double getReal(){
        return real;
    }
    protected double getImg(){
        return img;
    }

    public Complex add(Complex c){
        // System.out.println("ComplexCalc add method executed " + c.toString() + " + " + this.toString());
        return new Complex(this.real + c.real, this.img + c.img);
    }
    
    public Complex mul(Complex c){
        // System.out.println("ComplexCalc mul method executed " + c.toString() + " + " + this.toString());
        // a = this.real
        // b = this.img
        // c = c.real
        // d = c.img
        // (a+ib)*(c+id) = (ac + iad + ibc + (-bd)) = (ac - bd) + i(ad+bc)
        return new Complex(this.real*c.real - this.img*c.img, this.real*c.img + this.img*c.real);
    }
    
    @Override public String toString(){
        String toStringReturn = this.real + " + ("+ this.img + "i)";
        return toStringReturn;
    }
}


class MainComplex {
    public static void main(String args[]) {
        Complex c1, c2, c3;
        c1 = new Complex(4.0, 5.0);
        c2 = new Complex(5.0, 6.0);
        
        c3 = c1.add(c2);
        System.out.println("adding result of ("+ c1.toString() +") + ("+ c2.toString() + ") = c3: "+c3.toString());
        c3 = c1.mul(c2);
        System.out.println("multiplication result of ("+ c1.toString() +") + ("+ c2.toString() + ") = c3: "+c3.toString());
    }
}

















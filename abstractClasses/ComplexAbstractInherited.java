// to make complex class abstract & verify error when abstract method definition is not overrided in child & show after definition

public class ComplexAbstractInherited extends ComplexAbstract {
    ComplexAbstractInherited(){
        super(0.0, 0.0);
    }
    ComplexAbstractInherited(double real, double img){
        super(real, img);
    }
    public ComplexAbstractInherited add(ComplexAbstract c){
        // (a+ib)+(c+id) = (a+c)+i(b+d)
        return new ComplexAbstractInherited(getReal()+c.getReal(), getImg()+c.getImg());
    }
    public ComplexAbstractInherited sub(ComplexAbstractInherited c){
        // (a+ib)-(c+id) = (a-c) + i(b-d)
        return new ComplexAbstractInherited(getReal()-c.getReal(), getImg()-c.getImg());
    }
}

class Main{
    static void print(String s){
        System.out.print(s);
    }
    static void println(String s){
        System.out.println(s);
    }
    public static void main(String[] args){
        ComplexAbstractInherited c1 = new ComplexAbstractInherited(3.0, 4.0);
        ComplexAbstractInherited c2 = new ComplexAbstractInherited(4.0, 5.0);
        println(c1.toString());
        println(c2.toString());
        ComplexAbstractInherited c3 = c2.add(c1);
        println("Addtion Output: "+c3.toString());
        ComplexAbstractInherited c4 = c2.sub(c1);
        println("Subtraction Output: "+c4.toString());
    }
}


class Calc implements InfSub {
    int b;

    Calc(){
        b = 0;
    }
    Calc(int b){
        this.b = b;
    }

    public int mul(int a) {
        return b*a;
    }

    public int add(int a) {
        return b+a;
    }

    public double div(double a) {
        return (double)b/(double)a;
    }

    public int sub(int a) {
        return b-a;
    }
}

public class Main {
    public static void main(String[] args){
        Calc a = new Calc(3);
        System.out.println("type of 'a' is Calc : ");
        System.out.println("a + b : "+a.add(32));
        System.out.println("a - b : "+a.sub(32));
        System.out.println("a * b : "+a.mul(32));
        System.out.println("a / b : "+a.div(32));
        System.out.println("a / 0 : " + a.div(0));

        InfMul b = new Calc(10);
        System.out.println("\ntype of 'b' is InfAdd : ");
        System.out.println("b + c : "+b.add(32));
        // System.out.println("b - c : "+b.sub(32));
        System.out.println("b * c : "+b.mul(32));
        // System.out.println("b / c : "+b.div(32));
        // System.out.println("b / 0 : " + b.div(0));

    }
}

/*

case1: When commenting a method, in this case 'mul'
Main.java:1: error: Calc is not abstract and does not override abstract method mul(int) in InfMul
class Calc implements InfSub {
^
Main.java:34: error: cannot find symbol
        System.out.println("a * b : "+a.mul(32));
                                       ^
  symbol:   method mul(int)
  location: variable a of type Calc
2 errors


case2: When uncommenting some calling statements, in this case b.sub(), b.div()
Main.java:41: error: cannot find symbol
        System.out.println("b - c : "+b.sub(32));
                                       ^
  symbol:   method sub(int)
  location: variable b of type InfMul
Main.java:43: error: cannot find symbol
        System.out.println("b / c : "+b.div(32));
                                       ^
  symbol:   method div(int)
  location: variable b of type InfMul
Main.java:44: error: cannot find symbol
        System.out.println("b / 0 : " + b.div(0));
                                         ^
  symbol:   method div(int)
  location: variable b of type InfMul
3 errors


output 

type of 'a' is Calc : 
a + b : 35
a - b : -29
a * b : 96
a / b : 0.09375
a / 0 : Infinity

type of 'b' is InfAdd : 
b + c : 42
b * c : 320

 */
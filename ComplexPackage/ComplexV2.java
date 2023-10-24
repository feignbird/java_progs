// To display working of access modifier in inheritance

import p1.Complex;

public class ComplexV2 extends Complex
{
    public ComplexV2(){
        super(0, 0);
    }
    public ComplexV2(double real, double img){
        // System.out.println("Calling in ComplexV2 parameterized constructor before super() call.");
        super(real, img);
        System.out.println("Calling in ComplexV2 parameterized constructor after super() call.");
    }

    // sub
    public ComplexV2 sub(ComplexV2 c){
        // sub = (a+ib) - (c+id) = (a-c) + i(b-d)
        return new ComplexV2(getReal() - c.getReal(), getImg() - c.getImg());
    }
    // div
    public ComplexV2 div(ComplexV2 c){
        double a = getReal();
        double b = getImg();
        double _c = c.getReal();
        double d = c.getImg();

        // Note = i = sqrt(-1), i^2 = -1

        // div = (a + ib)/(c + id) = (a + ib)(c - id) / (c + id)(c - id)
        // = ac - iad + ibc - i^2(bd) / c^2 - (id)^2
        // = ((ac + bd)/(c^2 + d^2)) + i((bc - ad)/(c^2 + d^2))

        return new ComplexV2(((a*_c+b*d)/(_c*_c + d*d)), ((b*_c - a*d)/(_c*_c + d*d)));
    }
}

class MainComplex
{
    public static void main(String[] args){
        ComplexV2 c1 = new ComplexV2(3.0, 4.0);
        ComplexV2 c2 = new ComplexV2(2.0, 3.0);
        ComplexV2 c3 = c1.sub(c2);
        System.out.println("subtracting result of ("+ c1.toString() +") + ("+ c2.toString() + ") = c3: "+c3.toString());
        ComplexV2 c4 = c1.div(c2);
        System.out.println("dividing result of ("+ c1.toString() +") + ("+ c2.toString() + ") = c4: "+c4.toString());
    }
}

/**

Not even compiled...

ComplexV2.java:12: error: call to super must be first statement in constructor
        super(real, img);
             ^
1 error


after commenting out SOP statement before super() call.

Compiled...

Running...

Calling from Complex parameterized constructor
Calling in ComplexV2 parameterized constructor after super() call.
Calling from Complex parameterized constructor
Calling in ComplexV2 parameterized constructor after super() call.
Calling from Complex parameterized constructor
Calling in ComplexV2 parameterized constructor after super() call.
subtracting result of (3.0 + (4.0i)) + (2.0 + (3.0i)) = c3: 1.0 + (1.0i)
Calling from Complex parameterized constructor
Calling in ComplexV2 parameterized constructor after super() call.
dividing result of (3.0 + (4.0i)) + (2.0 + (3.0i)) = c4: 1.3846153846153846 + (-0.07692307692307693i)



 */

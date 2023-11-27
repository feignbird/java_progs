/**
 * CalcHybridInterface
 */

interface InfAdd {
    int add(int a);
}

interface InfMul extends InfAdd {
    int mul(int a);
}

interface InfDiv extends InfAdd {
    double div(double a);
}

interface InfSub extends InfMul, InfDiv {
    int sub(int a);
}

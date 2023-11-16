abstract public class ComplexAbstract {
    private double real;
    private double img;

    ComplexAbstract(){
        real = 0.0;
        img = 0.0;
    }
    ComplexAbstract(double real, double img){
        this.real = real;
        this.img = img;
    }
    abstract public ComplexAbstract add(ComplexAbstract c);

    public ComplexAbstract sub(ComplexAbstract c){
        // overrided by the subclass
        return c;
    };

    public double getReal(){
        return real;
    }
    public double getImg(){
        return img;
    }
    public void setReal(double real){
        this.real = real;
    }
    public void setImg(double img){
        this.img = img;
    }
    public String toString(){
        String toStringReturn = this.real + " + ("+ this.img + "i)";
        return toStringReturn;
    }
}
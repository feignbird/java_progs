package p1;


public class Child extends Parent {
    private void privateMethod(){
        System.out.println("\nprivateMethod present in Child\n");
    }
    public void defaultMethod(){
        System.out.println("\ndefaultMethod present in Child\n");
    }
    protected void protectedMethod(){
        System.out.println("\nprotectedMethod present in Child\n");
    }
    public void publicMethod(){
        System.out.println("\npublicMethod present in Child\n");
    }
}


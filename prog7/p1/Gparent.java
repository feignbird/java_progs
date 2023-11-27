// EXP 7: modify the access modifire through out the class lineage
package p1;


class GrandParent {
    private void privateMethod(){
        System.out.println("\nprivateMethod present in GrandParent\n");
    }
    void defaultMethod(){
        System.out.println("\ndefaultMethod present in GrandParent\n");
    }
    protected void protectedMethod(){
        System.out.println("\nprotectedMethod present in GrandParent\n");
    }
    public void publicMethod(){
        System.out.println("\npublicMethod present in GrandParent\n");
    }
}


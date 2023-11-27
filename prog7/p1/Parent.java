package p1;


class Parent extends GrandParent {
    private void privateMethod(){
        System.out.println("\nprivateMethod present in Parent\n");
    }
    void defaultMethod(){
        System.out.println("\ndefaultMethod present in Parent\n");
    }
    protected void protectedMethod(){
        System.out.println("\nprotectedMethod present in Parent\n");
    }
    public void publicMethod(){
        System.out.println("\npublicMethod present in Parent\n");
    }
}
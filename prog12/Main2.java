
class BaseParent {
    public void saySomething(){
        System.out.println("Hi, I'm class BaseParent.");
    }
}

class BaseChild extends BaseParent implements Runnable {
    public void run(){
        for(int i=200; i<301; i+=2){
            System.out.println(i + " (Runnable BaseChild) ");
        }
    }
}

public class Main2 {
    public static void main(String[] args){
        System.out.println("\n\nImplementing with Runnable interface");
        BaseChild even200to300obj = new BaseChild();
        Thread even200to300thread = new Thread(even200to300obj);
        System.out.println("Printing EVEN numbers from 200 to 300: ");
        even200to300thread.start();
        System.out.println("Printing ODD numbers from 1 to 100: ");
        for(int i=1; i<101; i+=2){
            System.out.println(i + " (Main) ");
        }
    }
}

class ThreadODD extends Thread {
    public void run(){
        for(int i=1; i<101; i+=2){
            System.out.println(i + " (ThreadODD) ");
        }
    }
}

class ThreadEVEN extends Thread {
    public void run(){
        for(int i=200; i<301; i+=2){
            System.out.println(i + " (ThreadEVEN) ");
        }
    }
}

public class Main1 {
    public static void main(String[] args){
        System.out.println("\n\nExtending with Thread Class");
        ThreadODD odd1to100 = new ThreadODD();
        ThreadEVEN even200to300 = new ThreadEVEN();
        System.out.println("Printing ODD numbers from 1 to 100: ");
        odd1to100.start();
        System.out.println("Printing EVEN numbers from 200 to 300: ");
        even200to300.start();
    }
}
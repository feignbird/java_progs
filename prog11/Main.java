// To demonstrate working of inner classes

interface Shape {
    void draw();
}

class Animal {
    void makeSound() {
        System.out.println("Generic animal sound");
    }
}

class Outer {
    private int outerVar = 10;

    // Member Inner Class
    class MemberInner {
        void display() {
            System.out.println("Member Inner: " + outerVar);
        }
    }

    // Static Inner Class
    static class StaticInner {
        void display() {
            System.out.println("Static Inner");
        }
    }

    // Method with Local Inner Class
    void localInnerDemo() {
        int localVar = 20;

        class LocalInner {
            void display() {
                System.out.println("Local Inner: " + localVar);
            }
        }

        LocalInner localInner = new LocalInner();
        localInner.display();
    }

    // Method with Anonymous Inner Class
    void anonymousInnerDemo() {

        // Anonymous Inner Class extending a class
        Animal anonymousAnimal = new Animal() {
            void makeSound() {
                System.out.println("Anonymous animal makes a unique sound");
            }
        };
        anonymousAnimal.makeSound();

        // Anonymous Inner Class implementing an interface
        Shape rectangle = new Shape() {
            public void draw() {
                System.out.println("Drawing a rectangle");
            }
        };
        rectangle.draw();
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of the outer class
        Outer outerObj = new Outer();

        // Creating an object of the member inner class
        Outer.MemberInner memberInnerObj = outerObj.new MemberInner();
        memberInnerObj.display();

        // Creating an object of the static inner class
        Outer.StaticInner staticInnerObj = new Outer.StaticInner();
        staticInnerObj.display();

        // Calling the method with local inner class
        outerObj.localInnerDemo();

        // Calling the method with anonymous inner class
        outerObj.anonymousInnerDemo();
    }
}

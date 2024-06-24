package Java.OOPsConcepts;

 abstract class Animal{
    // public void walk(){
        
    // }

    abstract void walk(); //needs no implementation
    Animal(){
        System.out.println("You are creating a new animal");
    }
    public void eat(){
        System.out.println("Animal eats");
    }
}



class Horse extends Animal{
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
    Horse(){
        System.out.println("Created a Horse");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        // horse.walk();
        // Animal animal = new Animal();
        // animal.walk();
        // horse.eat(); //inheritance
    }
}



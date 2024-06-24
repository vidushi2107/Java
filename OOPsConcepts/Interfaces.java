package Java.OOPsConcepts;

interface Pets{
    int eyes = 2;
    void talk();
}

interface Herbivore{

}

class Dog implements Pets, Herbivore{
    public void talk(){
            System.out.println("talks and walks on 4 legs");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.talk();
    }
    
}

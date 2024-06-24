package Java.OOPsConcepts;
import bank.Bank;

public class Inheritance {

    public static void main (String args[]){
        // Triangle t1 = new Triangle();
        // t1.color = "red";
       bank.Account account1 = new bank.Account();
       account1.name = "Rex";

    }
    
}

class Shape{
    //Base class
    public void area(){
        System.out.println("displays area");
    }
}

class Triangle extends Shape{ //single level inheritance
    //derived class
        //properties from inherited class as well as its individual properties
        public void area(int l, int h){
            System.out.println(1/2*l*h);
        }

}

class Circle extends Shape{ //Hierarchial inheritance as multiple derived classes (triangle and circle) share the same base class
    public void area(int r){
        System.out.println((3.14*r*r));
    }
}

class EquilateralTriangle extends Triangle{ //multilevel inheritance as it posses all the properties of a triangle and triangle posses all the props of shape
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}



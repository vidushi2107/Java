package Java.OOPsConcepts;

 class ClassesObjects{
    String color;
    String type; // ballpoint, gel

    public void write(){
        System.out.println("writing something");
    }

    // this refers to current class's instance variable


    public void printColor(){
        System.out.println(this.color);
    }

    public void printType(){
        System.out.println(this.type);
    }

}



 class Student {
    String name;
    int age;

    // public void printInfo(){
    //     System.out.println(this.name);
    //     System.out.println(this.age);
    // }



// Declared constructor for student could have been : 

// 1. Non-parameterised Constructor : 


    // Student(){
    //     System.out.println(" Non Param Constructor called");
    // }

// 2. Non-Parameterised Constructor :

        // Student(String name,int age){
        //     this.name = name;
        //     this.age = age;
        // }

// 3. Copy Constructor : copies the student s info into its current object

            // Student(Student s){
            //     this.name = s.name; 
            //     this.age = s.age;
            // }



            //  Student() {
            //    // Student s1 = new Student();  to call such a format in the main for copy constructor
            // }

// *Function overloading -> Compile Time Polymorphism -> Different Functions with same name but distinct arguement format

// some differentiating factor needs to be there :
//  1. return type should be different
//  2. if return type= same, Then type of parameters should be different 
//  3.  if return type= same and type of parameters= same , Then no. of arguements should be different


public void printInfo(String name){
    System.out.println(name);
}

public void printInfo(int age){
    System.out.println(age);
}

public void printInfo(String name, int age){
    System.out.println(name + " " + age);
}

}






   class OOPsClassesObjects {
    public static void main(String args[]){

        //All about Pen 

        ClassesObjects pen1 = new ClassesObjects();
        pen1.color = "red";
        pen1.type = "gel";
        pen1.write();

        ClassesObjects pen2 = new ClassesObjects();
        pen2.color = "black";
        pen2.type = "ballpoint";

        pen1.printColor();
        pen1.printType();
        System.out.println("--------");
        pen2.printColor();
        pen2.printType();


        //All about Student
        System.out.println("All about Student");
        System.out.println("-------");

        // Student student = new Student(); //calling the undeclared "Non Param" constructor by default

    
        // student.name = "mauve";
        // student.age = 18;

                // student.printInfo();



        // Student student = new Student("Nick", 25); //calling the Parameterised Constructor

        Student s1 = new Student();
        s1.name = "Alexa";
        s1.age = 20;

        // Student s2 = new Student(s1); // calling Copy Constructor Concept
        // s2.printInfo();



        //Function overloading :

        s1.printInfo(s1.name, s1.age);
        s1.printInfo(s1.age);
        s1.printInfo(s1.name);





    }

  }




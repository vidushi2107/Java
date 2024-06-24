package Java.OOPsConcepts;

class Student{
    String name;
    static String school;
    static void changeSchool(String name) { 
        school = name;
     }
     void studInfo(){
        System.out.println("school name is : " +school);
     }
    }



public class staticExample {
    public static void main(String[] args) {
        // Student.changeSchool("name");
        Student student1 = new Student();
        student1.name = "Tony";
        System.out.println(student1.name);
        // student1.studInfo();
    }
}


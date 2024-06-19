package Java;
public class Swap2StringVariableWithoutTemp {

    public static void main(String[] args) {
        String a= "Hello";
        String b = "World";


        //Print String before Swap 
        System.out.println("Strings before Swap : a = " + a + " and b = " +b);

        //append 2nd string to 1st
        a = a + b;

        //Print the appended value
        System.out.println("value of a is : " + a );

        //store initial string a in b
        b = a.substring(0, a.length() - b.length());

        //print stored value of b
        System.out.println("value of b after storing is :" + b);

        //store initial value of string b in string a
        a = a.substring(b.length());

        //print the stored value of a
        System.out.println("value of a after storing is :" + a);

        //print the values after swapping
        System.out.println("value after swapping : a is " + a + " and b is " + b );
    }
    
}

package Java.Programs;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class GenerateRandomNumbers {
    /*
    3 ways :
      1. Random class
      2. Math.random()
      3. ThreadLocalRandom (after JDK 1.7 it got added)

      Use cases : Random number in email while sending the POST call, or Random Phone numbers
      
    */
    public static int generateRandomValue(int Min, int Max){
        return ThreadLocalRandom.current().nextInt(Min, Max+1);
    }

    public static void main(String[] args){
        Random random = new Random();
        
        for(int i=1; i<=5; i++){
            System.out.println("random int:"+random.nextInt());
            System.out.println("random double:"+random.nextDouble());
            System.out.println("random long:"+random.nextLong());
            System.out.println("random float:"+random.nextFloat());
            System.out.println("random boolean:"+random.nextBoolean());
            System.out.println("random Gaussian:"+random.nextGaussian());
        }
        
        System.out.println("--------");

        for(int i=1; i<=5; i++){
            System.out.println(Math.random()); //generates some random double values always
        }

        System.out.println("---------");

        for(int i =1; i<=100; i++){
            System.out.println(ThreadLocalRandom.current().nextInt());
            System.out.println(ThreadLocalRandom.current().nextDouble());
            System.out.println(ThreadLocalRandom.current().nextFloat());
            System.out.println(ThreadLocalRandom.current().nextBoolean());
        }
        System.out.println("----range------");

        for(int i=1; i<=5; i++){

            //using the object from Random class

            System.out.println(random.nextInt(20));; //between 0 to 20 
            System.out.println(random.nextInt(100));; //between 0 to 100 

            //using the Math.random function
            System.out.println((int)(Math.random() * 20)); // typecasting the double the result to int 

            //using ThreadLocalRandom class - need to give a range least, bound

            System.out.println("using Thread Local");

            System.out.println(ThreadLocalRandom.current().nextInt(0, 20));
                int Min = 1, Max = 100;
                System.out.println("Random value between " + Min + " and " + Max + " : " + generateRandomValue(Min,Max));

        }

    }
}

    // public static void generateRandom(int min, int max) {
    //     System.out.println(min + Math.floor((max - min)* Math.random()));
    // }

    





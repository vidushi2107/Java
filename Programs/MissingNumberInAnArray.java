package Java.Programs;
public class MissingNumberInAnArray {
    public static void main(String[] args){
        int biggest;
        int[] numbers = new int[]{1,2,3,4,6,7};
        biggest = 7;

        //Finding the sum of the first n numbers in the series
        int expectedSum = biggest * ((biggest + 1)/2);

        //initialising the sum of all the array elements as zero
        int numSum = 0;

        //traverse the array from start to end as well as finding the sum of all the array elements
        for(int i: numbers){
            numSum = numSum + i ;
        }

        //finding the missing number by subtracting the array numbers sum from sum of first n natural numbers
        System.out.print(expectedSum - numSum);

    }
}
package Java.Programs;
class DuplicateWord{
    public static void main(String args[]){
     String string = "Big black bug bit a big black dog on his big black nose";
     int count;

     string = string.toLowerCase();

     String words[] = string.split(" ");
     System.out.println("Duplicate words given in a string : ");

     for(int i=0;i < words.length; i++){
        count = 1;
        
        for(int j = i+1; j < words.length; j++){
            if(words[i].equals(words[j])){
                count++;
                //Set words[j] to zero to avoid printing visited word

                words[j]="0";
            }
        }

        //Displays the duplicate word if count is greater than 1
            if(count > 1 && words[i]!= "0"){
            System.out.println(words[i]);
            }

     }

     

        
        
    }
}
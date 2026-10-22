import java.util.Random;

public class Randomallotment {
    public static void main(String[] args) 
    {
    
       int[] rollno = new int[100];
        int[][] cls = new int[10][10];
        Random rand = new Random();
         for(int i=0;i<cls.length;i++){
            System.out.println("Class number is: "+(i+1)+"\n");
             for(int j=0;j<cls.length;j++){
                for(int k=0;k<rollno.length;k++){
                rollno[i]=rand.nextInt(100)+1;}
                System.out.println("\t\t Roll number "+rollno[i]);
            
        }
    }
  }

}

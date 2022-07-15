import java.util.Scanner;
public class Throw2b {
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter values of I & J:");
        int i=input.nextInt();
        int j=input.nextInt();  
        int k=i+j;
        try{           
         Excep.MyExcep(k);
         System.out.println(k);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }    
}
}
class Excep extends Exception{
    static void MyExcep(int s) throws Exception{
        if(s>10)
        {
            throw new Exception("K is Greater than 10");
        }
    }
} 

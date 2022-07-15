import java.util.Scanner;
public class Throw2a {
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter values of I & J:");
        int i=input.nextInt();
        int j=input.nextInt();  
        int k;
        try{           
         k = i+j;
         
        if (k>10)
        {
            throw new ArithmeticException();
        }
        System.out.println(k);
        }
        catch (ArithmeticException e )
        {
            System.out.println("K is Greater than 10");
            System.out.println(e);
        }
    }
}
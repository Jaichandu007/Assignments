import java.util.Scanner;
public class Ans8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int num = input.nextInt();
        int fact= 1;
        for(int i=0;i<num;i++)
        {
            fact = (fact)*(num-i);
            
        }
        System.out.println(fact);
    }
    
}

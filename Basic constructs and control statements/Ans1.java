import java.util.*;

public class Ans1{
    public static void main(String[] args){
        int a,b;
        Scanner input = new Scanner(System.in);
        System.out.println("enter 1st integer");
        a = input.nextInt();
        System.out.println("enter 2nd integer");
        b = input.nextInt();
        if(a>b){
            System.out.printf("%d is larger",a);
        }
        else if(b>a){
            System.out.printf("%d is larger",b);
        }
        else{
            System.out.println("These numbers are equal");
        }
        
    }

}




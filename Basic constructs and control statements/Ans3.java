import java.util.*;
public class Ans3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        int No_of_Pos=0 , No_of_Neg=0 , No_of_Zeros=0;
        System.out.println("Enter 5 numbers");
        for(int i=0;i<5;i++)
        {
            arr[i] = input.nextInt();
        }
        for(int i=0;i<5;i++)
        {
        if(arr[i] < 0)
        {
            No_of_Neg++;
        }
        else if ( arr[i] > 0)
        {
            No_of_Pos++;
        }
        else 
        {
            No_of_Zeros++;
        }
    }
        System.out.println();
        System.out.printf("Total postive numbers: %d\n", No_of_Pos);
        System.out.printf("Total negative numbers: %d\n", No_of_Neg);
        System.out.printf("Total zero numbers: %d\n", No_of_Zeros);
    }
}

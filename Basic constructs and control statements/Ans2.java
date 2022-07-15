import java.util.Scanner;
public class Ans2 {
    public static void main(String[] args){
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a five digit number");
        number = input.nextInt();
        while(number<10000 || number>99999){
            System.out.println("enter a five digit number please");
            number = input.nextInt();
        }
        int [] arr = new int[5];
      

            for(int i=0; i<5; i++){
                arr[i] = number%10;
                number = number/10;
            }
        
            for(int a=0; a<5; a++){
                System.out.print(arr[4-a] + " ");
            }
    
    }
    
}

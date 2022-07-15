import java.util.Scanner; 
public class Ans6 {
    public static void main(String[] args)
    {
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

                if(arr[0]== arr[4] && arr[1]== arr[3])
                {
                    System.out.println("It is a palindrome");
                }
                else
                {
                    System.out.println("Not a palindrome");
                }
    }
    
}

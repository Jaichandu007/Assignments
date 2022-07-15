import java.util.Scanner;
import java.lang.Math;
public class Ans7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter Range");
        int Range = input.nextInt();
        if(Range < 500)
        {
        for(int a=1;a<Range;a++)
        {
            for(int b=1;b<Range;b++)
            {
                for(int c=1;c<Range;c++)
                {
                    if(c==Math.sqrt((Math.pow(a, 2)+(Math.pow(b, 2)))) && a<b)
                    {
                        System.out.printf("%d %d %d \n",a,b,c);
                    }
                }
            }
        }
    
    }
    else
    {
        System.out.println("Get lost");
    }
}

}

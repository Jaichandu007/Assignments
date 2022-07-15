import java.util.ArrayList;
import java.util.Scanner;
public class LongerPal {
    static boolean function(String s){
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        return s.equals(sb.toString());
    }
    public static void main(String[] args){
        ArrayList<String>aL = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String x = sc.nextLine();
        StringBuilder word = new StringBuilder(x);
        for (int i=0;i<word.length();i++)
        {
            for(int j=i;j<word.length();j++)
            {
                if(function(word.substring(i,j+1)) && word.substring(i,j+1).length()!=1){
                    System.out.print(word.substring(i,j+1)+" ");
                }
            }
        }
    }
}

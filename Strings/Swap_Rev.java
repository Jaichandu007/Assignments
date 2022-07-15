import java.util.Scanner;
public class Swap_Rev { 
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Sentence:");
        String s = input.nextLine();
        String s1 = "";
        int i = 0;
        for (i = 0; i < s.length();) {
            while (s.charAt(i) != ' ') {
                s1 = s1 + s.charAt(i);
                i++;
            }
            break;
        }
        String s2 = "";
        int j = 0;
        for (j = s.length() - 1; j >= i;) {
            while (s.charAt(j) != ' ') {
                s2 = s.charAt(j) + s2;
                j--;
            }
            break;
        }
        System.out.print(s2);
        for (int m = j; m >= i; m--) {
            System.out.print(s.charAt(m));
        }
        System.out.println(s1);
    }
}
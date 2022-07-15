import java.util.Scanner;

public class ASCII{
    public static String ASCII(String ascii)
    {
        String hexa = "";
        for (int i = 0; i < ascii.length(); i++) {

            char ch = ascii.charAt(i);
            int in = (int)ch;
            String part = Integer.toHexString(in);
            hexa += part;
        }
        return hexa;
    }
    public static void main(String[] arg)
    {
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter a word");
        String name = input.nextLine();
        System.out.println(ASCII(name));
    }
}
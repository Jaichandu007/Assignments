import java.util.Scanner;
public class Anagram {
    public static String SortArray(String s){
        char arr[] = s.toCharArray();
        char temp;
        int i = 0;
        while (i < arr.length){
            int j = i + 1;
            while (j < arr.length) {
                if (arr[j] < arr[i]) {        
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j += 1;
            }
            i += 1;
        }
        String sorter = new String(arr);
        return sorter;
    }
       
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First word");
        String S1 = input.nextLine();
        System.out.println("Enter Second word");
        String S2 = input.nextLine();
        S1 = S1.replaceAll(" ", "");
        S2 = S2.replaceAll(" ", "");
        S1 = S1.replaceAll("\\p{Punct}","");
        S2 = S2.replaceAll("\\p{Punct}","");
        S1 = S1.toLowerCase();
        S2 = S2.toLowerCase();
        if (SortArray(S1).equals(SortArray(S2)))
        {
            System.out.println("They are Anagrams");
        }
        else 
        {
            System.out.println("Not Anagrams");
        }
    
}
}
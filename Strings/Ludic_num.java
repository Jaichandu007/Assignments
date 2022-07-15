import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Ludic_num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = input.nextInt();
        List<Integer> ludic = new ArrayList<Integer>(num);
        for (int i = 1; i <= num; i++)
            ludic.add(i);
        for (int index = 1; index < ludic.size(); index++) {
            int idx_ludic = ludic.get(index);
            int rem = index + idx_ludic;
            while (rem < ludic.size()) {
                ludic.remove(rem);
                rem = rem + idx_ludic - 1;
            }
        }
        System.out.println(ludic);
    }
}

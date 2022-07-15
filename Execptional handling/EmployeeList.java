import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
public class EmployeeList {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<String> data = new ArrayList<String>(5);
        data.add("Jai");
        data.add("Jabez");
        data.add("Teja");
        data.add("Vishnu");
        data.add("Satwik");
        int count =0;
        System.out.println("Enter name:");
        String name = input.nextLine();
        for (int i=0;i<5;i++)
        {
            if (data.get(i).equals(name))
            {
                count++;
            }
        }
        try{
            if (count ==0)
            {
                throw new Exceptionthrower("Data not found");
            }
            System.out.println("Employee name found");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}



class Exceptionthrower extends Exception{
    public Exceptionthrower (String msg){
        super (msg);
    }
}
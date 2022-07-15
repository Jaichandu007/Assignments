import java.util.Scanner;
import javax.swing.*;
public class ScoreException {
    public static void main(String[] args) {

        JFrame f = new JFrame();
        Scanner input = new Scanner(System.in);
       String num= JOptionPane.showInputDialog(f, "Enter Test Score");
    
        try{
            int n = Integer.parseInt(num);
            Exce.MyExce(n);
            JOptionPane.showMessageDialog(f, "This is a valid Score");
        }catch(Exception e){
            JOptionPane.showMessageDialog(f,e.getMessage());
        }
        String s= JOptionPane.showInputDialog(f, "Do you want to enter another score?");
        s = s.toLowerCase();
        while (s.equals("yes") || (s.equals("y")))
        {
            String c = JOptionPane.showInputDialog(f,"Enter Another Test Score");
            try{
                int i = Integer.parseInt(c);
                Exce.MyExce(i);
                JOptionPane.showMessageDialog(f, "That is a valid Score");
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(f, "You must enter a number for the score!");
            }
            catch(Exception e)
            {
              JOptionPane.showMessageDialog(f,e.getMessage());  
            }
            s= JOptionPane.showInputDialog(f, "Do you want to enter another score?");
            s =s.toLowerCase();
        }
    }   
}
class Exce extends Exception{
    static void MyExce(int num)throws Exception{
        if(num <=0 ||num >=100)
            {
                throw new Exception("The score must be >= 0 and <= 100!");
            }
    }
}
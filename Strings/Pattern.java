import javax.swing.plaf.synth.SynthLookAndFeel;

public class Pattern {
    public static void main(String[] args){
            for (int i=1;i<=9;i++)
            {
                if (i<5) {
                    for (int j = 1; j <= 10; j++) {
                        if (j >= 6 - i && j <= 5 + i)
                            System.out.print("- ");
                        else
                            System.out.print("  ");
                    }
                    System.out.println();
                }
                 else
                    {
                        for (int j=1;j<=10;j++)
                        {
                            if (j>=i-4 && j<=15-i)
                                System.out.print("- ");
                            else
                                System.out.print("  ");
                        }
                        System.out.println();
                    }


            }

    }
}

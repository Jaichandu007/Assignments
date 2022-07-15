import java.util.Scanner;
public class Points {
    int X;
    int Y;
    Scanner input = new Scanner(System.in);
        public void vertices(int X, int Y)
        {
            this.X = X;
            this.Y = Y;
        }
         public void setX(int X)
         {
            this.X = X;
         }

        int getX()
        {
            return X;
        }

        public void setY(int Y)
        {
            this.Y = Y;
        }

        public int getY()
        {
            return Y;
        }
    }


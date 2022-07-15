import java.util.Scanner;

public class Guessgame {
    public void StartGame(){
    Scanner input = new Scanner(System.in);
    int min = 0;
    int max = 9;
    int num = (int) (Math.random()*(max-min+1)+min);
    Player P1 = new Player();
    Player P2 = new Player();
    Player P3 = new Player();

    System.out.println("Press enter to start the game");
    System.out.println("Guess the number");

    P1.Guess();
    P2.Guess();
    P3.Guess();
    while(true)
    if(P1.Guess() == num)
    {
        System.out.println("Player1 won the game");
        System.out.printf("Number is %d\n ",num);
        break;
    }
    else if (P2.Guess() == num)
    {
        System.out.println("Player2 won the game");
        System.out.printf("Number is %d\n ",num);
        
    }
    else if (P3.Guess() == num)
    {
        System.out.println("Player3 won the game");
        System.out.printf("Number is %d\n ",num);
        break;
    }

}
}
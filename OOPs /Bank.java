public class Bank {
        int getInterestRate()
        {
            return 0;
        }
}
class Bank_A extends Bank {
    int getInterestRate()
    {
        return 5;
    }
    
}
class Bank_B extends Bank {
    int getInterestRate()
    {
        return 10;
    }
    
}
class Bank_C extends Bank {
    int getInterestRate()
    {
        return 15;
    }
    
}

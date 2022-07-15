public class Throw1b {
    public static void main(String[] args){
        try{
            MyException.Exceptioner();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

class MyException extends Exception{
    static void Exceptioner() throws Exception{
        System.out.println("Error");
    }
}

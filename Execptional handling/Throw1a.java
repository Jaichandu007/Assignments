
import java.io.IOException;
public class Throw1a{
    public static void main(String[] args) throws IOException{
        try{
            throw new IOException();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
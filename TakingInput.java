import java.io.IOException;

public class TakingInput {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter your name : ");
        // read() - reads 1 byte at a time and returns integer
        // read() - returns ASCII number of any character
        int name = System.in.read();
        System.out.println("Name is : " + name);
    }
}

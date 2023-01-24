import java.math.BigInteger;

public class DataTypesP2 {
    public static void main(String[] args) {
        BigInteger x = new BigInteger("4538247234798327498283792");
        // int y = 234;
        BigInteger y = new BigInteger("451232");
        BigInteger z = x.add(y);
        System.out.println(z);
    }
}

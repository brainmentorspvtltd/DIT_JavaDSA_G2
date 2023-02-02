package ControlFlow;

public class PrimeNumberP2 {
    public static void main(String[] args) {
        // int num = 100000007;
        int num = 101;
        boolean prime = true;
        int iter = 0;
        for(int i = 2; i * i <= num; i++) {
            iter++;
            if(num % i == 0) {
                prime = false;
                break;
            }
        }
        System.out.println("Number of Iterations : " + iter);
        if(prime) {
            System.out.println("Number is Prime...");
        }
        else {
            System.out.println("Number is not Prime...");
        }
    }
}

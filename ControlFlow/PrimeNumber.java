package ControlFlow;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 997;
        boolean prime = true;
        int iter = 0;
        for(int i = 2; i < num/2; i++) {
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

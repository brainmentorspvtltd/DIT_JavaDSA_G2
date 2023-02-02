package ControlFlow;

public class Armstrong {
    public static void main(String[] args) {
        int num = 153;
        int copy = num;
        int result = 0;
        while(num != 0) {
            int rem = num % 10;
            result += rem * rem * rem;
            num = num / 10;
        }
        if(copy == result) {
            System.out.println("Armstrong Number...");
        }
        else {
            System.out.println("Not Armstrong...");
        }
    }
}

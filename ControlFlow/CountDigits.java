package ControlFlow;

public class CountDigits {
    public static void main(String[] args) {
        int num = 345215;
        int count = 0;
        while(num != 0) {
            num = num / 10;
            count++;
        }
        System.out.println("Count is : " + count);
    }
}

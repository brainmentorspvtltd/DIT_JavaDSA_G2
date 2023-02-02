package ControlFlow;

public class NestedLoop {
    public static void main(String[] args) {
        // for each iteration of i, j will be executed till 5 times
        // i * j = 5 * 5 = 25
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.println(i + "," + j);
            }
        }
    }
}

package ControlFlow;

public class LabelForLoop {
    public static void main(String[] args) {
        outer:
        for(int i = 0; i < 5; i++) {
            inner:
            for(int j = 0; j < 5; j++) {
                if(i == 2 && j == 2) {
                    break outer;
                }
                System.out.println(i + "," + j);
            }
        }
    }
}

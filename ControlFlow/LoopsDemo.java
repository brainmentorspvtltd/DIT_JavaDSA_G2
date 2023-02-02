package ControlFlow;

public class LoopsDemo {
    public static void main(String[] args) {
        
        // i = 0,1,2,3,4
        // for(int i = 0; i < 5; i++) {
        //     System.out.println(i);
        // }

        int arr[] = {3,2,5,1,7,8};
        // i = 0,1,2,3,4,5
        // for(int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }

        // i = 3,2,5,1,7,8
        for (int i : arr) {
            System.out.println(i);
        }

    }
}

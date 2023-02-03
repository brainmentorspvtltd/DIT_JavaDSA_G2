public class Py {
    public static void main(String[] args) {
        // Left
        final int NO_OF_LINES = 7;
        // for(int line = 1; line<=NO_OF_LINES; line++){
        //     for(int star=1 ; star<=line; star++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int line = NO_OF_LINES; line>=1; line--){
        //     for(int star = 1; star<=line; star++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int line = 1; line<=NO_OF_LINES; line++){
        //     for(int space =1; space<=NO_OF_LINES-line; space++){
        //         System.out.print(" ");
        //     }
        //     for(int star=1 ; star<=line; star++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
         int countSpace = 0;   
         for(int line = NO_OF_LINES; line>=1; line--, countSpace++){
            for(int space = 0 ; space<=countSpace; space++){
                System.out.print(" ");
            }
            for(int star = 1; star<=line; star++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

   


}

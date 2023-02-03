public class Pattern2 {
    public static void main(String[] args) {
        final int NO_OF_LINES = 5;
        for(int line = 1; line<=NO_OF_LINES; line++){
            for(int star = 1; star<=NO_OF_LINES; star++){
                if(line ==1 || line == NO_OF_LINES || star ==1 || star ==NO_OF_LINES){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

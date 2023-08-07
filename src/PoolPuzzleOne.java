public class PoolPuzzleOne {
    public static void main(String [] args) {
        int x = 0;
        while (x < 4) {
            x = x - 1;
            if (x < 1) {
                System.out.print("a ");
                System.out.print("noise");
            }
            x = x + 1;
            if (x > 1) {
                System.out.print("an");
            }
            if (x == 1) {
                System.out.print("noys");
            }
            if (x > 3) {
                System.out.print(" oyster");
            }
            System.out.println("");
            x = x + 2;
        }

    }
}

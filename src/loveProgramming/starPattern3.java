package loveProgramming;

public class starPattern3 {
    public static void main(String[] args) {
        int k = 5;
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(" ");
            }
            k--;
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();

        }
        System.out.println();

    }
    }





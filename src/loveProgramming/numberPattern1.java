package loveProgramming;

public class numberPattern1 {
    public static void main(String[] args) {
        int k=5;
        for (int i = 0; i <=5; i++) {
            for(int j=0;j<k;j++)
            {
                System.out.print(" ");
            }
            k--;
            for(int j=0;j<=i;j++)
            {
                System.out.print(i);
            }

            for(int j=0;j<i;j++)
            {
                System.out.print(i);
            }


            System.out.println();

        }

        System.out.println();
    }
}



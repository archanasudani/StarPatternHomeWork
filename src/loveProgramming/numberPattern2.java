package loveProgramming;

public class numberPattern2 {
    public static void main(String[] args) {
    int k=5;
        for (int i = 0; i <=5; i++) {
        for(int j=0;j<k;j++)
        {
            System.out.print(" ");
        }
        k--;
        int m=i;
        for(int j=0;j<i;j++)
        {
            System.out.print(m);
            m--;
        }

        for(int j=2;j<=i;j++)
        {
            System.out.print(j);
        }


        System.out.println();

    }
        System.out.println();


}

}


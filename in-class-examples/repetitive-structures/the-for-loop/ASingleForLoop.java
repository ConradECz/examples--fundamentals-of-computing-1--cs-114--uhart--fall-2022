public class ASingleForLoop {
    public static void main(String[] args) {
        // for(int i = 0; i < 100; i += 50) {
        //     System.out.println("The value of i is " + i);
        // }

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.println("i is " + i + " and j is " + j);
            }
        }


        int i = 0;
        int j = 0;
        while(i < 4) {

            int j = 0;
            while(j < 4) {
            System.out.println("i is " + i + " and j is " + j);

                j++;

            }
            j = 0;

            i++;
        }
        // for(int i = 0; i < 10; ) {
        //     System.out.println("The value of i is " + i);

        //     i++;
        // }


        // int i = 0;

        // for( ;i < 10; ) {
        //     System.out.println("The value of i is " + i);

        //     i++;
        // }


        // int i = 0;

        // for( ; i < 10; i++) {
        //     System.out.println("The value of i is " + i);
        // }

        // for( ; ; )
        //     ;
    }
}

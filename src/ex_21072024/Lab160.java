package ex_21072024;
//* * * * * * * *
// * * * * * * *
//  * * * * * *
//   * * * * *
//    * * * *
//     * * *
//      * *
//       *
public class Lab160 {
    public static void main(String[] args) {
        for (int i = 8; i >=1; i--) {

            for (int j = 8; j > i; j--) {
                System.out.print(" ");
           }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}

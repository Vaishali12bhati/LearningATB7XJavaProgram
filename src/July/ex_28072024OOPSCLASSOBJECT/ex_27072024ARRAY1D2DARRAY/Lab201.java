package July.ex_28072024OOPSCLASSOBJECT.ex_27072024ARRAY1D2DARRAY;

public class Lab201 {
    public static void main(String[] args) {
        int[][] arr_2d = {
                {2,3,4},
                {3,4,5},
                {3,5,2}

        };
        for (int i = 0; i < arr_2d.length; i++) {
            for (int j = 0; j < arr_2d.length; j++) {
                System.out.print(arr_2d[i][j]);
                System.out.print(" ");
            }
            System.out.println();


            }

        }
    }

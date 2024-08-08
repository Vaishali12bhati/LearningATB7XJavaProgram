package July.ex_27072024ARRAY1D2DARRAY;
//wap to print
//{34,2}
//{43,3}
//{43,4}
public class Lab203 {
    public static void main(String[] args) {
        int[][]array_2d = {{34,2},
                          {43,3},
                          {40,4}

        };
        for (int i = 0; i < array_2d.length; i++) {
            for (int j = 0; j < array_2d[i].length; j++) {
                System.out.print(array_2d[i][j]);
                System.out.print(" ");
            }
            System.out.println();

            }

        }
    }



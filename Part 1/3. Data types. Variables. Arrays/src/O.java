public class O {
    public static void main(String[] args) {
        double[][] m = {
                {1, 2, 3, 4},
                {5, 6, 7, 8, 9},
                {10, 11, 12}
        };

        for(int i = 0; i < m.length; ++i){
            for (int j = 0; j < m[i].length; ++j){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}

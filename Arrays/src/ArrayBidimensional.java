import java.util.Arrays;

public class ArrayBidimensional {
    public static void main(String[] args) {
        int[][] miArray = new int[5][4];

        for(int i = 0; i < miArray.length; i++) {
            for(int j = 0; j < miArray[0].length; j++) {
                miArray[i][j] = (int) (Math.random() * 10);
                System.out.print(miArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(miArray));
    }
}
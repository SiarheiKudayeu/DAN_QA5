package lesson6.manyArrays;

import java.util.Arrays;

public class ManyArrays {
    public static void main(String[] args) {
        //Двумерный массив
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(numbers[1][2]);

        int[][] ints = new int[3][3];
        ints[1][2] = 6;

        String[][] text = {{"Text1", "Text2"}, {"Text3", "Text4"}};

        for (String[] string: text){
            System.out.print("(");
            for (String word: string ) {
                System.out.print(word + ", ");
            }
            System.out.println("\b\b)");
        }

        //трехмерный
/*        int[][][] be= {
            {
                {1,2},{1,3}
            },
            {
                {1,3},{1,3}
            }
        };

        System.out.println(Arrays.deepToString(be));*/

    }
}

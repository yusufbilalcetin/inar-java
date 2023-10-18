package week_08.live_class;

public class Common_Elements {
    public static void main(String[] args) {
          /*
     int[][] array1 = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] array2 = {
            {3, 7, 8},
            {6, 2, 4}
        };

        Common element found: 2
        Common element found: 3
        Common element found: 4
        Common element found: 6

     */
        int[][] array1 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] array2 = {
                {3, 7, 8},
                {6, 2, 4}};

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                int tempt = array1[i][j];
                isContains(array2, tempt);
            }

        }
    }

    public static void isContains(int[][] array2, int tempt) {
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                if (tempt == array2[i][j]) {
                    System.out.println("Common element found: " + tempt);
                }
            }
        }
    }
}

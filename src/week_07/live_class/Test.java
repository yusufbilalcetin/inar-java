package week_07.live_class;

public class Test {
    public static void main(String[] args) {
        //Given an array length 1 or more of ints, return the difference between the largest
        // and smallest values in the array. Note: the built-in Math.min(v1, v2) and
        // Math.max(v1, v2) methods return the smaller or larger of two values.
        //bigDiff([10, 3, 5, 6]) → 7
        //bigDiff([7, 2, 10, 9]) → 8
        //bigDiff([2, 10, 7, 2]) → 8

        int[] numbers1 = {10, 3, 5, 6};
        int dif = bigDiff(numbers1);
        System.out.println(dif);//7

        int[] numbers2 = {7, 2, 10, 9};
        dif = bigDiff(numbers2); //8
        System.out.println(dif);

        int[] numbers3 = {2, 10, 7, 2};
        dif = bigDiff(numbers3); //8
        System.out.println(dif);

        int[] numbers4 = {10, 10, 10, 10};
        dif = bigDiff(numbers4); //0
        System.out.println(dif);

        int[] numbers5 = {10};
        dif = bigDiff(numbers5); //0
        System.out.println(dif);

        int[] numbers6 = {10, -10, 2, 5, 7};
        dif = bigDiff(numbers6); // 20
        System.out.println(dif);


    }

    public static int bigDiff(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max - min;
    }
}


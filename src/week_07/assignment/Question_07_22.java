package week_07.assignment;

public class Question_07_22 {
    public static void main(String[] args) {
        int[] numbers = generateSolution();
        while (!isSolution(numbers)) {
            numbers = generateSolution();
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (j == numbers[i]) {
                    System.out.print("|Q");
                } else {
                    System.out.print("| ");
                }
            }
            System.out.println("|");
        }
    }

    public static boolean isSolution(int[] numbers) {
        boolean isAnswer = true;

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (Math.abs(i - j) == Math.abs(numbers[i] - numbers[j])) {
                    return false;
                }
            }
        }
        return isAnswer;
    }

    public static int[] generateSolution() {
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        for (int i = 0; i < array.length; i++) {
            int index = (int) (Math.random() * array.length);
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
        return array;
    }
}

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {


        //Exercise 1

        int[] arr = generateRandomArray();
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("«Сумма трат за месяц составила " + sum + " рублей");

        //Exercise 2

        int min = 999_999;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            } else if (min > arr[i]) {
                min = arr[i];
            }
        }

        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");


        //Exercise 3

        double averageValue = sum / 30;
        System.out.println("Средняя сумма трат за месяц составила " + averageValue + " рублей");


        //Exercise 4

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();


        //Exercise 5

        int[][] matrix = new int[3][3];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
        }


        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

        //Exercise 6

        int[] incorrectArray = {5, 4, 3, 2, 1};
        int[] correctArray = new int[incorrectArray.length];


        System.out.println(Arrays.toString(incorrectArray));

        for (int i = incorrectArray.length - 1; i >= 0; i--) {
            correctArray[incorrectArray.length - 1 - i] = incorrectArray[i];
        }

        System.out.println(Arrays.toString(correctArray));


        //Exercise 7

        int[] incArray = {5, 4, 3, 2, 1};

        for (int i = 0; i < incArray.length / 2; i++) {

            int cor = incArray[i];
            incArray[i] = incArray[incorrectArray.length - 1 - i];
            incArray[incorrectArray.length - 1 - i] = cor;
        }
        System.out.println(Arrays.toString(incArray));

        //Exercise 8 and 9

        int[] arrayNumbers = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};

        for (int i = 0; i < arrayNumbers.length - 1; i++) {
            for (int j = 0; j < arrayNumbers.length; j++) {
                if (arrayNumbers[i] + arrayNumbers[j] == -2){
                    System.out.println("При сумме "+ arrayNumbers[i] + " " + arrayNumbers[j] + " результат будет - 2");
                }
            }

        }


    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

}
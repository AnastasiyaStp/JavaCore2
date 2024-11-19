package number1;

public class EvenCounter {

    public static int countEvens(int[] nums) {

        int count = 0; // Переменная для подсчета четных чисел
        for (int num : nums) {
            if (num % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}

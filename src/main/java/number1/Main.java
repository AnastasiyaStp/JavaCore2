package number1;

import static number1.EvenCounter.countEvens;

public class Main {

    public static void main(String[] args) {

        System.out.println(countEvens(new int[]{2, 1, 2, 3, 4}));
        System.out.println(countEvens(new int[]{2, 2, 0}));
        System.out.println(countEvens(new int[]{1, 3, 5}));
    }
}
